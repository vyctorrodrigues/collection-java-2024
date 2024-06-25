package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;


public class CarrinhoCompras {
    private List<Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }
    //METODO PARA ADICIONAR LISTA
    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();  
        
        for (Item item : itemsParaRemover) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(item);
            }
        }

        itemsParaRemover.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();

                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoCompras [itemList=" + itemList + "]";
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        
        carrinhoCompras.adicionarItem("caderno", 40, 5);
        carrinhoCompras.adicionarItem("lapis",  3, 17);
        carrinhoCompras.adicionarItem("caneta", 1.50, 10);
        carrinhoCompras.adicionarItem("caneta", 6.34, 5);

        carrinhoCompras.exibirItens();

        carrinhoCompras.removerItem("caneta");

        carrinhoCompras.exibirItens();

        System.err.println("Total a pagar = " + carrinhoCompras.calcularValorTotal());
    }

}
