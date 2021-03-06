/*
 * @brief Classe Despesa. Contém métodos para criar um objecto desta
 *        classe.
 *
 * @author Carlos Pereira   - A61887
 * @author João Barreira    - A73831
 * @author João Gomes       - A74033
 * @author João Reis        - A75372
 */

package dividedespesa.business;

import java.util.Date;

public class Despesa {
    
    // Variáveis de instância
    
    private int id;                 //id da despesa
    private String info;            //informações da despesa
    private double valor;           //valor da despesa
    private String tipo;            //tipo de despesa
    private Date dataEmissao;       //data de emissão da despesa
    private Date dataLimite;        //data limite de pagamento da despesa
    private Date dataPagamento;     //data de pagamento da despesa
    
    
    //Construtores

    /**
     * Construtor por parâmetros
     * 
     * @param id            id
     * @param info          informações
     * @param valor         valor
     * @param tipo          tipo de despesa
     * @param dataEmissao   data de emissão
     * @param dataLimite    data limite de pagamento
     * @param dataPagamento data de pagamento
     */
    public Despesa (int id, String info, double valor, String tipo,
                    Date dataEmissao, Date dataLimite,
                    Date dataPagamento) {
        
        this.id = id;
        this.info = new String(info);
        this.valor = valor;
        this.tipo = new String(tipo);
        this.dataEmissao = dataEmissao;
        this.dataLimite = dataLimite;
        this.dataPagamento = dataPagamento;
    }
    
    /**
     * Construtor através de um objeto Despesa.
     * 
     * @param desp Despesa
     */
    public Despesa (Despesa desp) {
        this.id = desp.getId();
        this.info = desp.getInfo();
        this.valor = desp.getValor();
        this.tipo = desp.getTipoDespesa();
        this.dataEmissao = desp.getDataEmissao();
        this.dataLimite = desp.getDataLimite();
    }
    
    
    //Getters e Setters
    
    /**
     * Devolve o id da despesa.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Devolve as informações da despesa.
     * 
     * @return info
     */
    public String getInfo() {
        return new String(info);
    }
    
    /**
     * Devolve o valor da despesa.
     * 
     * @return valor
     */
    public double getValor() {
        return valor;
    }
    
    /**
     * Devolve o tipo de despesa.
     * 
     * @return tipo
     */
    public String getTipoDespesa() {
        return new String(tipo);
    }
    
    /**
     * Devolve a data de emissão da despesa.
     * 
     * @return dataEmissao
     */
    public Date getDataEmissao() {
        return dataEmissao;
    }
    
    /**
     * Devolve a data limite de pagamento da despesa.
     * 
     * @return dataLimite
     */
    public Date getDataLimite() {
        return dataLimite;
    }
    
    /**
     * Devolve a data de pagamento da despesa.
     * 
     * @return dataPagamento
     */
    public Date getDataPagamento() {
        return dataPagamento;
    }
    
    /**
     * Faz o set da data de pagamento da despesa.
     * 
     * @param g nova data de pagamento
     */
    public void setDataPagamento(Date g) {
        dataPagamento = g;
    }
} 

