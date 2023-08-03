package atividade01;

import java.awt.BorderLayout;
import java.util.Scanner;

public class compra {
    public static void main(String[] args) {
        System.out.println("Digite o produto: ");
        Scanner scannerProduto = new Scanner(System.in);
        String produto = scannerProduto.nextLine();
        System.out.println("Digite o valor: ");
        Scanner scannerValor = new Scanner(System.in);
        double valor = scannerValor.nextDouble();
        System.out.println("Digite a quantidade de itens: ");
        Scanner scannerItens = new Scanner(System.in);
        int itens = scannerItens.nextInt();
        System.out.println("Digite a quantidade de parcelas: ");
        Scanner scannerParcelas = new Scanner(System.in);
        int parcelas = scannerParcelas.nextInt();
        
        double valorTotal = valor*itens;
        if (valorTotal<=100) {
            double valorT = valorTotal-(valorTotal*0.05);
            System.out.println("Credito (c) ou Debito (d)? ");
            Scanner scannerCD = new Scanner(System.in);
            String creditoDebito = scannerCD.nextLine();
            double valorFinal = valorT/parcelas;
            System.out.println("Produto: " + produto);
            System.out.println("Quantidade: " + itens);
            System.out.println("Valor: " + valorFinal);
        } else {
            double valorT = valorTotal-(valorTotal*0.03);
            System.out.println("Credito (c) ou Debito (d)? ");
            Scanner scannerCD = new Scanner(System.in);
            String creditoDebito = scannerCD.nextLine();
            double valorFinal = valorT/parcelas;
            System.out.println("Produto: " + produto);
            System.out.println("Quantidade: " + itens);
            System.out.println("Valor: " + valorFinal);
        }
    }
}
