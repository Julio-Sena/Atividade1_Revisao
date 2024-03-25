import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        // Calcula e exibe a soma dos dois números
        double soma = numero1 + numero2;
        System.out.println("Soma: " + soma);
        
        // Calcula e exibe a subtração dos dois números
        double subtracao = numero1 - numero2;
        System.out.println("Subtração: " + subtracao);
        
        // Calcula e exibe a multiplicação dos dois números
        double multiplicacao = numero1 * numero2;
        System.out.println("Multiplicação: " + multiplicacao);
        
        // Verifica se o segundo número é zero para evitar divisão por zero
        if (numero2 != 0) {
            // Calcula e exibe a divisão dos dois números
            double divisao = numero1 / numero2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
        
        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}

