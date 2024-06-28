package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributo

    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for(Aluno a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                } 
            }
        }
        alunosSet.remove(alunoParaRemover);
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>();
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("Não existe este aluno");
        }
    
    }


    
}
