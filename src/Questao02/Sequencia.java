package Questao02;

import java.util.Scanner;

public class Sequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean pertenceFibonacci(int numero) {
        int a = 0, b = 1;
        while (a < numero) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == numero;
    }
}
