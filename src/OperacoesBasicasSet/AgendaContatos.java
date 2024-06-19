package OperacoesBasicasSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatoSet;

    //o construtor abaixo nao vai receber um parametro e sim instaciar um HashSet
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        if (!contatoSet.isEmpty()) {
            System.out.println(contatoSet);
          } else {
            System.out.println("O conjunto está vazio!");
          }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c : contatoSet) {
            //o metodo startsWith é um metodo que voce determina se um string começa com os caracteres
            // especificados retornando true ou false
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for (Contato c : contatoSet) {
            //se o nome do contato for igual ao nome que esta no parametro for true
            if (c.getNome().equalsIgnoreCase(nome)) {
                //vou alterar o numero passando contato setNumero(para alterar)
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 12345678);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 11111111);
        agendaContatos.adicionarContato("Camila Dio", 654987);
        agendaContatos.adicionarContato("Maria Clara", 11111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("M"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Maria Clara", 555555));
        
        agendaContatos.exibirContatos();
    }

    
}
