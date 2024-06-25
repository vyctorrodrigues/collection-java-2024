package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    //import List do java util
    private List<Pessoa> pessoaList;
    // abaixo é um constructor
    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }
    //metodo de adicionar pessoas
    public void adicionarPessoa(String nome, int idade, double altura){
        //chamando pessoaList do atributo privado e adcionando uma nova pessoa
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
        //implementando o comparable
    public List<Pessoa> ordenarPorIdade() {
        //a ArrayList começou com todos os valores de List ate aqui a lista nao esta ordenada
        // para ficar ordenada precisamos passar a interface Collection com o metodo sort Collections.sort()
        //o metodo sort vai entender que vai ter que ordena a lista de pessoas por idade atraves do comparable
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
        //implementando o comparator
    public List<Pessoa> ordenarPorAltura(){
        //duplicando a list por que estou colocando
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        // usando o comparator preciso usar o collection.sort para passar o comparator
        //para usar ele foi feito uma list e foi passado o comparator da implementacao da classe pessoa
        // new foi colocado para instaciar a class
        // fazendo isso o collection vai entender que é pra ele ordenar as pessoasPorAltura pelo comparator
        // quando nao passo o comparator ele vai ordenar pelo comparable
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("nome1", 20, 1.65);
        ordenacaoPessoa.adicionarPessoa("nome2", 30, 1.84);
        ordenacaoPessoa.adicionarPessoa("nome3", 25, 1.52);
        ordenacaoPessoa.adicionarPessoa("nome4", 17, 1.90);
        ordenacaoPessoa.adicionarPessoa("nome5", 29, 1.74);
        ordenacaoPessoa.adicionarPessoa("nome6", 34, 1.62);

        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
    }
}