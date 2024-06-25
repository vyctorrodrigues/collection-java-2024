package list.Ordenacao;

import java.util.Comparator;

// implementacao da interface comparable para ordenacao de pessoas
//o comparable recebe um generics <aqui dentro fica a class que voce vai implementar no comparable> ou diamond operator
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;
    
    
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    // o metodo compareTo é para ordenar elementos e comparar o tipo de objeto
    @Override
    public int compareTo(Pessoa p) {
        //idade é um numero inteiro o que significa que podemos usar um wrap
        //o Integer é o wrap do tipo int onde tem varios metodos que nos ajuda a manipular numeros inteiros
        //e dentro dos metodos que nos ajuda a mainupar e comparar numeros inteiros temos o compare
        //Integer.compare nos ajuda a manipular e ou comparar numeros inteiros
        //o proprio Integer vai verificar qual é maior que o outro e vai passar na ordem que colocarmos
        //o integer compara a int do proprio objeto da class (idade)
        // e vamos comparar com a idade do obejto que vamos passar no compareTo
        //objeto p.getIdade() = get chama o objeto privado.
        return Integer.compare(idade, p.getIdade());
    }

    //get sao metodos acessores de atributos private
    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }


    public double getAltura() {
        return altura;
    }
    // quando pedi pra imprimir ele mostra o nome, idade e altura
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }

}
    //para ultilizar o Comparator vou utilizar uma class fora da class implementada em Comparable
    // igual ao comparable implementa usando o generics <T=type> e no caso o tipo é Pessoa
class ComparatorPorAltura implements Comparator<Pessoa> {
    //metodo abstrato compare para comparar a altura da p1, e p2
    public int compare(Pessoa p1, Pessoa p2){
        //o double tambem tem um wrap que é Double com D maiusculo
        // que tambem utiliza o metodo compare Double.compare(objeto p1. chama a altura do private getAltura())
        // faz o mesmo no segundo objeto p2.getAltura()
        return Double.compare(p1.getAltura(), p2.getAltura());
    }   
}
