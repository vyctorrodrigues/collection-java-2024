package ExemploUsandoLambda;
import java.util.ArrayList;
import java.util.List;



    public class CarrinhosCompras {
  //atributos
  private List<Items> itemsList;
  //construtor
  public CarrinhosCompras() {
    this.itemsList = new ArrayList<>();
  }

  public void adicionarItem(double preco, int quantidade) {
        itemsList.add(new Items(preco, quantidade));
    }
  
  //método para calcular valor total dos itens utilizando o Stream API
   /*public double calcularValorTotal() {
    if (itemsList.isEmpty()) {
      throw new RuntimeException("A lista está vazia!");
    }
    return itemsList.stream()
                      aqui é o Lambda
        .mapToDouble(items -> items.getPreco() * items.getQuantidade())
        .sum();
  }/* */

  public static void main(String[] args) {
    CarrinhosCompras carrinhosCompras = new CarrinhosCompras();

    carrinhosCompras.adicionarItem(8, 4);
    
  }
}
