package projeto.vendas;


import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.List;
import projeto.vendas.Statuspedido;

public class Pedido {

    private Cliente cliente;

    private Statuspedido status;

    private List<Iten> itens;
    
    private int nuItens;
    
    public int id;

    private double valorPedido;
    
    
   /** Constructor**/
    
    public Pedido(Cliente A) {
        this.cliente = A;  
    }
    
   /** Methods**/
    
    public void pagar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void cancelar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void submeter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void adicionaIten() {
         Iten iten = new Iten();
         iten.setPedido(this);
         itens.add(iten);
         this.setValorPedido(this.valorPedido + iten.getPreco() * iten.);
         setNuItens(getNuItens() + 1);     
    }     

    /**
     * @return the nuItens
     */
    public int getNuItens() {
        return nuItens;
    }

    /**
     * @param nuItens the nuItens to set
     */
    public void setNuItens(int nuItens) {
        this.nuItens = nuItens;
    }

    /**
     * @return the valorPedido
     */
    public double getValorPedido() {
        return valorPedido;
    }

    /**
     * @param valorPedido the valorPedido to set
     */
    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the status
     */
    public Statuspedido getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Statuspedido status) {
        this.status = status;
    }

    /**
     * @return the itens
     */
    public List<Iten> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(List<Iten> itens) {
        this.itens = itens;
    }

    
    
    
}
