package atividade01;

import java.util.Scanner;

public class emprestimo {
    public static void main(String[] args) {
        System.out.println("EMPRESTIMO");
        System.out.println("Digite o valor da casa desejada: ");
        Scanner scannerValor = new Scanner(System.in);
        double valor = scannerValor.nextDouble();
        System.out.println("Digite seu salario: ");
        Scanner scannerSalario = new Scanner(System.in);
        double salario = scannerSalario.nextDouble();
        System.out.println("Digite a quantidade de anos a pagar: ");
        Scanner scannerAnos = new Scanner(System.in);
        int anos = scannerAnos.nextInt();
        int meses = anos*12;
        double prestacao = valor / meses; 
        
        if (prestacao < 0.3 * salario) {
            System.out.println("Emprestimo aprovado");
        } else {
            System.out.println("Emprestimo negado");
        }
    }
}
