package OperacoesBasicasSet;


import java.util.HashSet;
import java.util.Set;




public class ListaTarefas {
    
    private Set<Tarefas> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao){
        Set<Tarefas> tarefasParaRemover = new HashSet<>();
        for (Tarefas t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
                break;
            }
        }
        tarefasSet.removeAll(tarefasParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefas> obterTarefasConcluidas() {
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        for (Tarefas tarefas : tarefasConcluidas) {
            if (tarefas == tarefasSet) {
                tarefasSet.add(tarefas);
                break;
            }
        }
        return tarefasConcluidas;
    }
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        //System.out.println("o numero total de elementos na lista: " + listaTarefas.contarTarefas());
        //listaTarefas.adicionarTarefa("Tarefa 1");

        //System.out.println("o numero total de elementos na lista: " + listaTarefas.contarTarefas());
        listaTarefas.adicionarTarefa("Tarefa1");
        
    }
}

