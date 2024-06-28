package ExemploUsandoLambda;
public class Items {
    // atributo

    private double preco;
    private int quantidade ;
    
    public Items(double preco, int quantidade) {
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Items [preco=" + preco + ", quantidade=" + quantidade + "]";
    }
    
    
   
    

    
}
