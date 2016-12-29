/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividedespesa;

import dividedespesa.database.*;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Carlos Pereira, João Gomes, João Pires Barreira, João Reis
 */
public class DivideDespesa {
    
    // Variáveis de instância
    
    private Utilizador utilizador;
    private static AdministradorDAO adminDAO;
    private static SenhorioDAO senhorioDAO;
    private static QuartoDAO quartosDAO;
    private static MoradorDAO moradoresDAO;
    private static DespesaDAO despesasDAO;
    
    // Construtores
    
    public DivideDespesa() {
        utilizador = null;
        adminDAO = new AdministradorDAO();
        senhorioDAO = new SenhorioDAO();
        quartosDAO = new QuartoDAO();
        moradoresDAO = new MoradorDAO();
        despesasDAO = new DespesaDAO();
        
    }

    
    // Métodos de instância
    
    public void addMorador(String username, String password, String nome,
                               List<Integer> qrts) throws MoradorExistenteException, SQLException {
        
        if (moradoresDAO.containsKey(username)) {
            throw new MoradorExistenteException();
        } else {
            Morador novo = new Morador(username, password, nome);
            moradoresDAO.put(novo, qrts);
        }
    }
    
    public void adicionarDespesa(String nome, double valor, String tipo,
                                 Date data, String username) throws SQLException, NumberFormatException {
        
        int id = despesasDAO.size() + 1;

        Despesa d = new Despesa(id, nome, valor, tipo, data, data, null);   
        
        despesasDAO.put(d, username);
    }    
    
    public Collection<Despesa> verDespesasPorPagar(String username) throws SQLException {
        return despesasDAO.userPorPagar(username);
    }
    
    public Collection<Despesa> verDespesasPagas(String username) throws SQLException {
        return despesasDAO.userPagas(username);
    }
    
/*  É PRECISO ALTERAR*/
    /*public void cobrarRendaDAO() throws SQLException {
        Date date = new Date();

        Map<String,Double> moradoresPreco = moradoresDAO.getUsernamesPrecos();
        
        moradoresPreco.keySet().stream().forEach((user) -> {
            this.adicionarDespesa(user,
                                  new Despesa(despesasDAO.size(), "Renda", moradoresPreco.get(user), "Renda", new Date(), new Date(), null)); //TENHO DE ALTERAR
        });
    }*/
    
    public void alteraRendaQuarto(int numQuarto, double valor) throws SQLException {
        quartosDAO.updateRenda(numQuarto, valor);
    }
    
    public void alterarPasswordMorador(String username, String password) throws SQLException {
       moradoresDAO.updatePassword(username,password);
    }
    
    public void alterarQuartosMorador(String username, List<Integer> quartos) throws SQLException {
         moradoresDAO.updateMoradorQuarto(moradoresDAO.get(username), quartos); 
    }
    
    public boolean isMorador(String username, String password) throws SQLException {
        return moradoresDAO.exists(username,password);
    }
    
    public boolean isSenhorio(String username, String password) {      
        return senhorioDAO.exists(username,password);
    }
    
    public boolean isAdministrador(String username, String password) {
        return adminDAO.exists(username,password);
    }
    
    
    public String[] getQuartosString() throws SQLException {
        return quartosDAO.getAll();
    }
    
    public String[] getMoradoresString() throws SQLException {
        return moradoresDAO.getAll();
    }
    
    public double consultaSaldo(String username) throws SQLException {
        return moradoresDAO.get(username).getContaCorrente().getSaldo();
    }
    
    public void updateSaldo (String username, double valor) throws SQLException {
        moradoresDAO.updateSaldo(username, valor + consultaSaldo(username));
    }
    
    public void removerUtilizador(String username) throws SQLException {
        moradoresDAO.updateSaida(username, new Date());
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }
    
    public String pagaDespesa(String username, int idDespesa)  throws SQLException {
        
        double saldo = consultaSaldo(username),
               valor = despesasDAO.get(idDespesa).getValor();
        
        String ret;
        
        if(saldo < valor) {
            ret = "Valor da despesa superior ao saldo atual.";
        } else {
            updateSaldo(username, saldo - valor);

            ret = "Despesa paga.";
        }

        return ret;
    }
    
    void registaApartamento(Senhorio senhorio, Administrador admin,
                            List<Double> precosQuartos) throws SQLException {
        
        senhorioDAO.toDB(senhorio);
                
        adminDAO.toDB(admin);
        
        int i = 0;
        
        for(Double d : precosQuartos) {
            quartosDAO.toDB(i, precosQuartos.get(i));
            i++;
        }
    }
    
    
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */

  
    public static void main(String[] args) throws SQLException {
       

     
    }
}

