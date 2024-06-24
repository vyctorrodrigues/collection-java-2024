package OperacoesBasicasMap;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    //quando trabalhar com generics nao conseguimos por int como tipo primitivo, precisa ser Integer
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        //quando se trabalhar com o metodo put ele serve tanto para adicionar como tambem para atualizar
        agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        //"!"caso o valor nao esteja vazio
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

       /*agendaContatos.adicionarContato("Maria Clara", 123536);
        agendaContatos.adicionarContato("Clara", 127544);
        agendaContatos.adicionarContato("Maria", 999456);
        agendaContatos.adicionarContato("Vyctor", 1111111);
        agendaContatos.adicionarContato("Evandro", 777777);
        agendaContatos.adicionarContato("lUIZ", 111111);*/
        
        agendaContatos.exibirContato();

        agendaContatos.removerContato("lUIZ");
        agendaContatos.removerContato("Evandro");

        agendaContatos.exibirContato();
        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Maria Clara"));
    }   

    
}
