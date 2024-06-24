package OperacoesBasicasMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        // esse seria um outra opçao = Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        //esta em ordem crescente pq o localDate ja sabe em que ordem deve ser, por que ele é um extends de comparator
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        /* o metodo keySet esta retornando um Set com todas as Keys o dataSet nao conhece o elemento complementar value
        que esta dentro da colecao
        o metodo Set ou me retorna todas as keys
        Set<LocalData> dataSet = eventoMap.keySet();
        o metodo Collection me retorna todos os values
        o metodos values esta me retornando uma colecao com todos os valores
        Collection<Evento> values = eventoMap.values();
        eventoMap.get() tambem nao funciona porque ele so passa a Key e nao a data quer dizer q nao sei qual
        data sera o proximo evento*/
        /* o metodo LocalDate me tras um metodo now (LocalDate.now()) que sempre me retornara a data atual sempre que
         * quiser saber a data atual é so usar LocalDate.now()
        */
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

        /*dentro do metodo entrySet() ele vai me retornar um Set a partir do metodo entry eu consigo ter um determinado
         * valor e uma determinada key mesmo retornando um Set
         */
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O meu proximo evento: " + proximoEvento + " acontecera na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        //0 of de LocalDate é para por o date
        agendaEventos.adicionarEvento(LocalDate.of(2024, 07, 24), "Evento 1", "Atraçao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 05, 25), "Evento 2", "Atraçao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2026, 06, 26), "Evento 3", "Atraçao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.MARCH, 28), "Evento 4", "Atraçao 4");
        
        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }


    
}
