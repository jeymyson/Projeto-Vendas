package projeto.vendas;


import projeto.vendas.Produto;

public class Iten {
    
    private Pedido pedido;

    public Produto produto;

    private int quantidade;
    
    private double preco;

    public int id;

    public Iten(Produto A, int B) {
        
        this.produto = A;
        this.quantidade =B;
    }

    Iten() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void removeIten(){
        
        pedido.getItens().remove(this);
        pedido.setNuItens(pedido.getNuItens()-1);
        pedido.setValorPedido(pedido.getValorPedido()-this.preco);
    
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return produto.valor * this.getQuantidade();
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
}
