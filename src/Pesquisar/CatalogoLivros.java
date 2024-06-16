package Pesquisar;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    //atributos

    private List <Livros> livrosList;
    
    //constructor
    public CatalogoLivros() {
        //instanciando uma ArrayList
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livros(titulo, autor, anoPublicacao));
    }

    public List<Livros> pesquisarPorAutor(String autor) {
        List<Livros> livrosPorAutor = new ArrayList<>();
        //(!)negacao ou diferença se nao estiver vazia return true
        if (!livrosList.isEmpty()) {
            for (Livros livros : livrosList) {
                if (livros.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livros);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livros> livrosPorIntervaloAnos = new ArrayList<>(null);
        if (!livrosList.isEmpty()) {
            for (Livros livros : livrosList) {
                if (livros.getAnoPublicacao() >= anoInicial && livros.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livros);
                }
            }
        }

        return livrosPorIntervaloAnos;
    }

    public Livros pesquisarPorTitulo(String titulo) {
        //esta null por que nao tem nenhum objeto do tipo livro 
        Livros livrosPorTitulo = null;

        if (!livrosList.isEmpty()) {
            for (Livros livros : livrosList) {
                //parametro titulo 
                if (livros.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = livros;
                   //break por que so quero saber um titulo
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }
    
    public static void main(String[] args) {
        
    }
}
