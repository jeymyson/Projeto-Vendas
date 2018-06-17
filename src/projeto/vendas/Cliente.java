package projeto.vendas;

import java.io.Serializable;

@Entity
public class Cliente implements Serializable {
    
    private static final long serialVersionUID= 1L;

    public String nome;

    private String cpfCnpj;

    public String cidade;

    private double limite;
    @Id
    private int id;

    public Cliente() {
    }

    /**
     * @return the cpfCnpj
     */
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * @param cpfCnpj the cpfCnpj to set
     */
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
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
        return "Cliente{" + "nome=" + nome + ", cpfCnpj=" + cpfCnpj + ", cidade=" + cidade + ", limite=" + limite + ", id=" + id + '}';
    }
    
}
