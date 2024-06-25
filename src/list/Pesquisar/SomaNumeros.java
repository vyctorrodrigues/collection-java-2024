package list.Pesquisar;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    //atributo

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma(){
      int soma = 0;
      for(Integer numero : numeros) {
        soma += numero;
      }
      return soma;

    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for(Integer numero : numeros){
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for(Integer numero : numeros){
                if (numero <= menorNumero) {
                    menorNumero = numero;
                } else {
                    System.out.println("Lista vazia");
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()) {
            System.out.println(numeros);
        } else {
            System.out.println("Lista vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.exibirNumeros();
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(-9);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(87);
        somaNumeros.exibirNumeros();
        System.out.println(somaNumeros.calcularSoma());
        
        
    }

    



    
}
