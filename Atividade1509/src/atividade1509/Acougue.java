/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1509;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Acougue {

    /**
     * Mostre uma mensagem no início com pelo menos 5 itens disponíveis;
     * O usuário escolhe um item pelo seu código 
     * Depois o usuário vai dizer a quantidade em quilos do item escolhido;
     * Caso o valor do item seja maiorque 150,00 deverá aplicar um desconto de 15%;
     * Ao final o programa deve mostrar o valor total do item;
     * 
     * O diferencial são os amigos que fizemos ao longo do caminho
     */
    public static void main(String[] args) {
        System.out.println("AÇOUGUE");
        System.err.println("Cortes:");
        System.out.println("Picanha (1) - 45,99Kg");
        System.out.println("Contrafile (2) - 38.99Kg");
        System.out.println("Coxão Duro (3) - 22.99Kg");
        System.out.println("Coxão Mole (4) - 34.99Kg");
        System.out.println("Bisteca (5) - 18.99Kg");
        System.out.println("");

        System.out.println("Escolha o corte:");
        Scanner corteScanner = new Scanner(System.in);
        int corte = corteScanner.nextInt();

        System.out.println("Digite a quantidade em kg: ");
        Scanner kgScanner = new Scanner(System.in);
        double kgqtde = kgScanner.nextDouble();

        if (corte == 1) {
            double picanhaPreco = 45.99;
            double precoTotal = picanhaPreco * kgqtde;
            if (precoTotal >150.00) {
                double precoFinal = precoTotal  * 0.15 + precoTotal;
                System.out.println("A compra deu R$" + precoFinal);
            } else {
                System.out.println("A compra deu R$" + precoTotal);
            }
        } else if (corte == 2) {
            double contrafilePreco = 38.99;
            double precoTotal = contrafilePreco * kgqtde;
            if (precoTotal >150.00) {
                double precoFinal = precoTotal  * 0.15 + precoTotal;
                System.out.println("A compra deu R$" + precoFinal);
            } else {
                System.out.println("A compra deu R$" + precoTotal);
            }
        } else if (corte == 3) {
            double coxaoduroPreco = 22.99;
            double precoTotal = coxaoduroPreco * kgqtde;
            if (precoTotal >150.00) {
                double precoFinal = precoTotal  * 0.15 + precoTotal;
                System.out.println("A compra deu R$" + precoFinal);
            } else {
                System.out.println("A compra deu R$" + precoTotal);
            }
        } else if (corte == 4) {
            double coxaomolePreco = 34.99;
            double precoTotal = coxaomolePreco * kgqtde;
            if (precoTotal >150.00) {
                double precoFinal = precoTotal  * 0.15 + precoTotal;
                System.out.println("A compra deu R$" + precoFinal);
            } else {
                System.out.println("A compra deu R$" + precoTotal);
            }
        } else if (corte == 5) {
            double bistecaPreco = 18.99;
            double precoTotal = bistecaPreco * kgqtde;
            if (precoTotal >150.00) {
                double precoFinal = precoTotal  * 0.15 + precoTotal;
                System.out.println("A compra deu R$" + precoFinal);
            } else {
                System.out.println("A compra deu R$" + precoTotal);
            }
        }
    }
}
