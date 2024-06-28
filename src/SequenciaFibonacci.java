


public class SequenciaFibonacci {

    public static void main(String[] args) {
        int n = 10;

        int num1 = 0, num2 = 1;
        
        System.out.println("Sequencia de Fibonacci até " + n + "termos: ");

        for (int i = 1; i <= n; i++) {
            System.out.println(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }    
}