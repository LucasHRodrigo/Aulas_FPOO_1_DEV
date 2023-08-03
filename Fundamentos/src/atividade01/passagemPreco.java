package atividade01;

import java.util.Scanner;

public class passagemPreco {
    public static void main(String[] args) {
        System.out.println("Digite a distancia que pretende percorrer (em Km): ");
        Scanner scannerDistancia = new Scanner(System.in);
        int distancia = scannerDistancia.nextInt();
        
        if (distancia>=200) {
            double passagem = distancia*0.45;
            System.out.println("Preco da passagem: " + passagem);
        } else {
            double passagem = distancia*0.5;
            System.out.println("Preco da passagem: " + passagem);
        }
    }
}
