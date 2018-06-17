package projeto.vendas;


import projeto.vendas.Produto;

public class Iten {
    static int idclass;
    
    private Pedido pedido;

    public Produto produto;

    private int quantidade;
    
    private double preco;

    public int id;

    public Iten(Produto produto, int quantidade) {
        
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = produto.getValor()*this.quantidade;
        this.id = Iten.idclass + 1;
        Iten.idclass++;
    }
    public void removeIten(){
        if(pedido.getStatus()==Statuspedido.NovoPedido){
        pedido.getItens().remove(this);
        pedido.setNuItens(pedido.getNuItens()-1);
        pedido.setValorPedido(pedido.getValorPedido()-this.preco);}
        
        else{
            throw new UnsupportedOperationException("Operação Invalida")  
        }
    
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Iten{ produto=" + produto + ", quantidade=" + quantidade + ", preco=" + preco + ", id=" + id + '}';
    }
    
}
