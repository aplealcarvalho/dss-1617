/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividedespesa;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Observable;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Pereira
 */
public class DivideDespesaFacade extends Observable {
    
    private DivideDespesa dd;
    private List<Double> precos;
    
    public DivideDespesaFacade() {
        
        dd = new DivideDespesa();
        precos = new ArrayList<>();
    }
    
    
    public boolean validaSenhorio(String nome, String user, String pass) {
        Senhorio senhorio = new Senhorio(nome, user, pass);
        
        return senhorio.validaSenhorio();
    }
    
    public boolean validaAdministrador(String user, String pass) {
        Administrador admin = new Administrador(user, pass);
        
        return admin.validaAdministrador();
    }
    
    public boolean validaMorador(String nome, String user, String pass) {
        Morador morador = new Morador(user, pass, nome);
        
        return morador.validaMorador();
    }
    
    public boolean fieldSize(String username, String password, String nome) {
        
        return (username.length() == 0 || password.length() == 0 ||
                nome.length() == 0);
    }
    
    public String addMorador(String nome, String username, String password, 
                              List<Integer> numQuartos) {
        String ret;
        
        try {
            dd.addMorador(username, password, nome, numQuartos);
            ret = "Morador adicionado.";
        } catch (SQLException e) {
            ret = "Não foi possível ligar à Base de Dados.";
        } catch (MoradorExistenteException ex) {
            ret = "O morador já existe no apartamento.";
        }
        
        return ret;
    }
    
    public void setUtilizador(String username, String password) {
        Utilizador login = new Utilizador(username, password);
        dd.setUtilizador(login);
    }
    
    public String[] getQuartos() {
        String[] ret;
        
        try {
            ret = dd.getQuartosString();
        } catch (SQLException e) {
            ret = null;
        }
        
        return ret;
    }
    
    
    public String[] getMoradores() {
        String[] ret;
        
        try {
            ret = dd.getMoradoresString();
        } catch (SQLException e) {
            ret = null;
        }
        
        return ret;
    }

   
    public String parseString(String str) {
        String[] parts = str.split(" ");
        return parts[0];
    }
    
    
    public boolean addToPrecos(String str) {
        boolean ret;
        
        try {
            double preco = Double.valueOf(str);
            this.precos.add(preco);
            this.setChanged();
            this.notifyObservers();
            ret = true;
        } catch (NumberFormatException e) {
            ret = false;
        }
        
        return ret;
    }
    
    public boolean removeQuarto() {
        boolean ret;
        
        try {
            this.precos.remove(precos.size() - 1);
            this.setChanged();
            this.notifyObservers();
            ret = true;
        } catch (IndexOutOfBoundsException e) {
            ret = false;
        }
        
        return ret;
    }
    
    
    public int getNumQuartos() {
        return precos.size();
    }
    
    
    public boolean registaApartamento(String nomeSenhorio, String usernameSenhorio, 
                                      String passSenhorio, String usernameAdmin,
                                      String passAdmin) {
        boolean ret;
        
        try {
            Senhorio senhorio = new Senhorio(nomeSenhorio, usernameSenhorio, passSenhorio);
            Administrador admin = new Administrador(usernameAdmin, passAdmin);
            dd.registaApartamento(senhorio, admin, precos);
            ret = true;
        } catch (SQLException e) {
            ret = false;
        }
        
        return ret;
    }
    
    public boolean isSenhorio(String username, String password) {
        return dd.isSenhorio(username, password);
    }
    
    public boolean isAdministrador(String username, String password) {
        return dd.isAdministrador(username, password);
    }
    
    public String isMorador(String username, String password) {
        String ret;
        
        try {
            if(dd.isMorador(username, password)) {
                ret = "morador";
            } else {
                ret = "Login inválido.";
            }
        } catch (SQLException ex) {
            ret = "Não foi possível ligar à Base de Dados.";
        }

        return ret;
    }
    
    public boolean alterarPasswordMorador(String username, String password) {
        boolean ret;
        
        try {
            dd.alterarPasswordMorador(username, password);
            ret = true;
        } catch (SQLException ex) {
            ret = false;
        }

        return ret;
    }
    
    public boolean alterarQuartosMorador(String username, List<Integer> quartos) {
        boolean ret;
        
        try {
            dd.alterarQuartosMorador(username, quartos);
            ret = true;
        } catch (SQLException ex) {
            ret = false;
        }

        return ret;
    }
    
    public Set<String> getSetMoradores()  {
        Set ret = null;
        
        try {
            ret = new HashSet<>(Arrays.asList(dd.getMoradoresString()));
        } catch (SQLException e) {
            
        }

        return ret;
    }
   
    public Object[] despesasPagas(String morador) {
        Collection<Despesa> despesas = null;
        Object[] o = null; 
        
        try {
            despesas = dd.verDespesasPagas(morador);
            for(Despesa d: despesas){
                o = new Object[]{d.getId(),d.getInfo(),d.getValor(),d.getDataEmissao(),d.getDataLimite(),d.getDataPagamento()};
            }
        } catch (SQLException e) {
            
        }
        
        return o;
    }
   
    public Object[] despesasPorPagar(String morador) {
        Collection<Despesa> despesas = null;
        Object[] o = null;
        try {
            despesas = dd.verDespesasPorPagar(morador);
            for(Despesa d: despesas){
                o = new Object[]{d.getId(),d.getInfo(),d.getValor(),d.getDataEmissao(),d.getDataLimite(),d.getDataPagamento()};
            }
        } catch (SQLException ex) {
        
        }
        return o;
    }
   
    public String alterarRenda(String numQuarto, String valorRenda) {
        int quarto = Integer.valueOf(parseString(numQuarto));
        double renda = 0;
        String ret = "";
        
        if (numQuarto.isEmpty() || valorRenda.isEmpty()) {
            ret = "Todos os campos tÊm que estar preenchidos.";
        } else {
            try {
                renda = Double.valueOf(valorRenda);
                dd.alteraRendaQuarto(quarto, renda);  
            } catch (NumberFormatException e) {
                ret = "Introduza um valor de renda válido.";
            } catch (SQLException e) {
                ret = "Não foi possível ligar à Base de Dados.";
            }
            
            ret = "Valor da renda alterado.";
        }
        
        return ret;
    }
    
    
    public String remover(String username) {
        String ret;
        
        try {
            dd.removerUtilizador(username);
            ret = "Morador removido.";
        } catch (SQLException ex) {
            ret = "Não foi possível ligar à Base de Dados.";
        }
        
        return ret;
    }
    
    public String carregar(String username, String valorStr) {
        String ret;
        
        try {
            double valor = Double.parseDouble(valorStr);
            dd.updateSaldo(username, valor);
            ret = "A conta foi carregada.";
        } catch (NumberFormatException e) {
            ret = "Introduza um valor a carregar válido.";
        } catch (SQLException ex) {
            ret = "Não foi possível ligar à Base de Dados.";
        }
        
        return ret;
    }
        
    public String consultar(String username) {
        String ret;
        
        try {
            ret = Double.toString(dd.consultaSaldo(username));
        } catch (SQLException ex) {
            ret = "Não foi possível ligar à Base de Dados.";
        }
        
        return ret;
    }
   
    public String[] getDadosDespesa(String user) {
        String[] despesas = null;
        
        try {
            Collection<Despesa> temp = dd.verDespesasPorPagar(user);
        
            if(temp != null) {
                despesas = new String[temp.size()];

                int i = 0;

                for(Despesa d: temp){
                    StringBuilder sb = new StringBuilder();
                    sb.append(d.getId()).append(" - ").append(d.getInfo()).append(" - ").
                              append(d.getValor());
                    despesas[i] = sb.toString();
                    i++;
                }
            }
        } catch (SQLException e) {
            
        }
        
        return despesas;
    }

   
    public String pagar(String user, String despesaInfo) {
        String ret;
        int id;
        
        try {
            id = Integer.valueOf(this.parseString(despesaInfo));
            ret = dd.pagaDespesa(user, id);
        } catch (SQLException e) {
            ret = "Não foi possível ligar à Base de Dados.";
        } catch (NumberFormatException e) {
            ret = "Valor da despesa inválido.";
        }
        
        return ret;
    }
    
    public String getUsername() {
        
        String ret;
        
        try {
            ret = dd.getUtilizador().getUsername();
        } catch (Exception e) {
            ret = null;
        }

        return ret;
    }
}
