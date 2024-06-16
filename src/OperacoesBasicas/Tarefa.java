package OperacoesBasicas;

public class Tarefa {
    //atributo

    private String descricao;


    //contrutor que recebe descricao e criou um objeto do tipo tarefa
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    //criei um metodo getDescricao como o atributo ta privado e eu vou querer saber a descricao da tarefa
    public String getDescricao() {
        return descricao;
    }
    
    public String toString() {
        return descricao;
    }

    
}
