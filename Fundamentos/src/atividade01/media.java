package atividade01;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos valores serao inseridos?");
        int quantiaValores = scanner.nextInt();
        
        double soma = 0.0;
        
        for (int i = 1; i <= quantiaValores; i++) {
            System.out.println("Insira o valor #" + i + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }
        
        double media = soma / quantiaValores;
        System.out.println("A media dos valores e: " + media);
        scanner.close();
    }
}
