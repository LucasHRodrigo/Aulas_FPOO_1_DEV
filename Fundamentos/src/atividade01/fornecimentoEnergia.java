package atividade01;

import java.util.Scanner;

public class fornecimentoEnergia {
    public static void main(String[] args) {
        System.out.println("KW/h consumidos: ");
        Scanner scannerKWh = new Scanner(System.in);
        int KWh = scannerKWh.nextInt();
        System.out.println("Tipo de instalação eletrica - R para residência, I para indústria e C para comércio");
        Scanner scannerInstalacao = new Scanner(System.in);
        String instalacao = scannerInstalacao.nextLine();
        
        if (instalacao == "R") {
            if (KWh<500) {
                double valorFinal = KWh*0.4;
                System.out.println("O valor a ser pago é de " + valorFinal);
            } else {
                double valorFinal = KWh*0.65;
                System.out.println("O valor a ser pago é de " + valorFinal);
            }
        }
    }
}
