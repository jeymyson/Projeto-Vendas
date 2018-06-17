package projeto.vendas;

public class Produto {

    private String descricao;

    private double valor;

    private int id;
    
    /** Cosntructor**/
    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + ", valor=" + valor + ", id=" + id + '}';
    }
    
    
}
