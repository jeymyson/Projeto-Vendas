/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.vendas;

/**
 *
 * @author Jeymyson
 */
public class ProjetoVendas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Produto cafe = new Produto("Café",100.0);
         
         Produto leite = new Produto("Leite",100.0);
         
         Cliente jeymyson = new Cliente();
         
         jeymyson.nome = "Jeymyson";
         jeymyson.setLimite(900.0);
         
         Pedido P1 = new Pedido(jeymyson);
         
         P1.adicionaIten(cafe, 6);
         P1.adicionaIten(leite, 4);
         
         
         System.out.println(P1);
         
         P1.submeter();
         
                 
         System.out.println(P1);
         
         //P1.getItenById(2).removeIten();
         
         //System.out.println(P1);
         
         
                 
                 
         
         
               
         
        
         
         
         
        
        
        
        
        
    }
    
}
