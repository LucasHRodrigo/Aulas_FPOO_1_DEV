package atividade01;

import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) {
        System.out.println("CALCULO DA AREA DO CIRCULO");
        System.out.println("Escreva o raio do circulo: ");
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextInt();
        double area = raio*raio*3.14 ;
        
        System.out.println("A area do circulo e " + area);
    }
}
