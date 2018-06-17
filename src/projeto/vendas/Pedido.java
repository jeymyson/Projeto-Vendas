package projeto.vendas;


import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;
import projeto.vendas.Statuspedido;

public class Pedido {

    private Cliente cliente;
    
    private  Date datPedido;

    private Statuspedido status;

    private List<Iten> itens;
    
    private int nuItens;
    
    public int id;

    private double valorPedido;
    
    
   /** Constructor**/
    
    public Pedido(Cliente A) {
        this.cliente = A; 
        this.status = Statuspedido.NovoPedido;
        this.datPedido = new Date();
        this.itens = new ArrayList<>();
    }
    
   /** Methods**/
    
    public void submeter() {
        
        if (this.status==Statuspedido.NovoPedido){
            
            if(this.valorPedido<=1000.0){
                
                if(this.valorPedido<=cliente.getLimite()){
                    this.status = Statuspedido.Aceito;
                }
                else{
                    throw new UnsupportedOperationException("O cliente não possui limite para efetuar essa compra");   
                }
            }
            else{
                throw new UnsupportedOperationException("O valor do pedido é superior a 1000 reais "); 
            }                     
        }    
        else {    
           throw new UnsupportedOperationException("Operaçao invalida");
        }
    }

    public void cancelar() {
        
        if(this.status!=Statuspedido.Pago){
            
            this.status = Statuspedido.Cancelado;
        } 
        else{
           throw new UnsupportedOperationException("Operação inválida.");
        }
    }

    public void pagar() {
        
        if(this.status == Statuspedido.Aceito){
            
            this.status = Statuspedido.Pago;
        }
        
        else{
        throw new UnsupportedOperationException("Operação Invalida");}
    }

    public void adicionaIten(Produto produto, int quantidade) {
         Iten iten = new Iten(produto,quantidade);
         iten.setPedido(this);
         itens.add(iten);
         this.setValorPedido(this.valorPedido + iten.getPreco());
         setNuItens(getNuItens() + 1);     
    }   
    
    public Iten getItenById(long id){
        
        for(Iten iten : this.itens){
            if(iten.id == id){
                return iten;
            }
        }
        
        return null;
    
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

    /**
     * @return the datPedido
     */
    public Date getDatPedido() {
        return datPedido;
    }

    /**
     * @param datPedido the datPedido to set
     */
    public void setDatPedido(Date datPedido) {
        this.datPedido = datPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cliente=" + cliente + ", datPedido=" + datPedido + ", status=" + status + ", itens=" + itens + ", nuItens=" + nuItens + ", id=" + id + ", valorPedido=" + valorPedido + '}';
    }

    
    
    
}
