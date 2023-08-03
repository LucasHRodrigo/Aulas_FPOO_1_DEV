package atividade01;

import java.util.Scanner;

public class velocidadeCarro {
    public static void main(String[] args) {
        System.out.println("Digite a velocidade do carro: ");
        Scanner velocidade = new Scanner(System.in);
        int velocidadeCarro = velocidade.nextInt();
        
        if (velocidadeCarro > 80) {
            System.out.println("Voce foi multado");
            int multa = (velocidadeCarro-80)*5;
            System.out.println("Valor da multa: " + multa);
        } else {
            System.out.println("Dentro dos limites de velocidade");
        }   
    }
}
