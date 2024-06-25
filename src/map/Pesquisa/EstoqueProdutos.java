package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;






public class EstoqueProdutos {
    
    private Map<Long, Produtos> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        //trabalhar com map é sempre key e value, key é o cod value é uma instancia usando new Produtos 
        //e passando os parametors de produto
        estoqueProdutosMap.put(cod, new Produtos(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
          for (Produtos p : estoqueProdutosMap.values()) {
            valorTotalEstoque += p.getQuantidade() * p.getPreco();
          }
        }
        return valorTotalEstoque;
    }
        

    public Produtos obterProdutosMaisCaro(){
        Produtos produtosMaisCaros = null;
        //usamos o MIN_VALUE para saber o maior valor é pq independente do valor do produto
        //o primeiro valor ja sera o maior valor
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for(Produtos p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtosMaisCaros = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtosMaisCaros;
    }

    public Produtos obterProdutosMaisBarato() {
        Produtos produtosMaisBaratos = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produtos p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtosMaisBaratos = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtosMaisBaratos;
    }

    public Produtos obterProdutosMaiorQuantidadeValorTotalNoEstoque() {
        Produtos produtosMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
          for (Map.Entry<Long, Produtos> entry : estoqueProdutosMap.entrySet()) {
                    double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                    if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                     maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                     produtosMaiorQuantidadeValorNoEstoque = entry.getValue();
                    }
            }
        }
            return produtosMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
    EstoqueProdutos estoque = new EstoqueProdutos();

    // Exibe o estoque vazio
    estoque.exibirProdutos();

    // Adiciona produtos ao estoque
    estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
    estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
    estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
    estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

    // Exibe os produtos no estoque
    estoque.exibirProdutos();

    // Calcula e exibe o valor total do estoque
    System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

    // Obtém e exibe o produto mais caro
    Produtos produtoMaisCaro = estoque.obterProdutosMaisCaro();
    System.out.println("Produto mais caro: " + produtoMaisCaro);

    // Obtém e exibe o produto mais barato
    Produtos produtoMaisBarato = estoque.obterProdutosMaisBarato();
    System.out.println("Produto mais barato: " + produtoMaisBarato);

    // Obtém e exibe o produto com a maior quantidade em valor no estoque
    Produtos produtoMaiorQuantidadeValorTotal = estoque.obterProdutosMaiorQuantidadeValorTotalNoEstoque();
    System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
  }
}

    
