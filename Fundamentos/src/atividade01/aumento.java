package atividade01;

import java.util.Scanner;

public class aumento {
    public static void main(String[] args) {
        System.out.println("Digite seu salario");
        Scanner scannerSalario = new Scanner(System.in);
        double salario = scannerSalario.nextDouble();
        
        if (salario>=1350.00) {
            double novoSalario = salario+(salario*0.10);
            System.out.println("Seu novo salario e de R$" + novoSalario);
        } else {
            double novoSalario = salario+(salario*0.15);
            System.out.println("Seu novo salario e de R$" + novoSalario);
        }
    }
}
