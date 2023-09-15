package atividadeEstruturaDecisao1509;

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {
        System.out.println("HOTEL");
        System.out.println("Planos de hospedagem:");
        System.out.println("SEGUNDA A SEXTA FEIRA:");
        Diaria basico = new Diaria(89.90, false, false, true, 1);
        Diaria superflex = new Diaria(109.90, true, false, true, 2);
        Diaria premium = new Diaria(199.90, true, true, false, 3);
        Diaria master = new Diaria(259.90, true, true, true, 4);
        System.out.println("Basico: " + basico);
        System.out.println("Superflex: " + superflex);
        System.out.println("Premium: " + premium);
        System.out.println("Master: " + master);
        System.out.println("");
        System.out.println("SABADO A DOMINGO");
        Diaria basico2 = new Diaria(109.90, false, false, true, 5);
        Diaria superflex2 = new Diaria(139.90, true, false, true, 6);
        Diaria premium2 = new Diaria(229.90, true, true, false, 7);
        Diaria master2 = new Diaria(299.90, true, true, true, 8);
        System.out.println("Basico: " + basico2);
        System.out.println("Superflex: " + superflex2);
        System.out.println("Premium; " + premium2);
        System.out.println("Master: " + master2);
        System.out.println("");

        System.out.println("Escolha seu pacote (pelo ID)");
        Scanner pacoteScanner = new Scanner(System.in);
        int pacote = pacoteScanner.nextInt();
        System.out.println("Quantos dias voce pretende alugar o quarto?");
        int dias = pacoteScanner.nextInt();
        
        double precoCafe = 29.99;
        double precoAlmoco = 69.99;
        double precoJantar = 59.99;

        if (pacote == 1) {
            double valorTotal = basico.getValor() * dias;
            System.out.println("O valor total sera de " + valorTotal);
            System.out.println("Gostaria de adicionar Cafe (1) ou Almoco (2)? Digite (3) se não quiser nenhum");
            Scanner respostaScanner = new Scanner(System.in);
            int resposta = respostaScanner.nextInt();
            
            if (resposta == 1) {
                double valorFinal = valorTotal + precoCafe;
                System.out.println("O valor final e de "+ valorFinal);
            } else if (resposta == 2) {
                double valorFinal = valorTotal + precoCafe;
                System.out.println("O valor final e de "+ valorFinal);
            } else if (resposta == 3) {
                System.out.println("O valor final e de" + valorTotal);
            }
            
           } else if (pacote == 2) {
            double valorTotal = superflex.getValor() * dias;
            System.out.println("O valor total sera de " + valorTotal);
            System.out.println("Gostaria de adicionar Almoco (1)? Digite (2) se não quiser nenhum");
            Scanner respostaScanner = new Scanner(System.in);
            int resposta = respostaScanner.nextInt();
            
            if (resposta == 1) {
                double valorFinal = valorTotal + precoCafe;
                System.out.println("O valor final e de "+ valorFinal);
            } else if (resposta == 2) {
                System.out.println("O valor final e de" + valorTotal);
            }
            
        } else if (pacote == 3) {
            double valorTotal = premium.getValor() * dias;
            System.out.println("O valor total sera de " + valorTotal);
            System.out.println("Gostaria de adicionar Jantar (1)? Digite (2) se não quiser nenhum");
            Scanner respostaScanner = new Scanner(System.in);
            int resposta = respostaScanner.nextInt();
            
            if (resposta == 1) {
                double valorFinal = valorTotal + precoCafe;
                System.out.println("O valor final e de "+ valorFinal);
            } else if (resposta == 2) {
                System.out.println("O valor final e de" + valorTotal);
            }
        } else if (pacote == 4) {
            double valorTotal = master.getValor() * dias;
            System.out.println("O valor total sera de " + valorTotal);
            
        } else if (pacote == 5) {
            double valorTotal = basico2.getValor() * dias;
            System.out.println("O valor total sera de " + valorTotal);
            System.out.println("Gostaria de adicionar Cafe (1) ou Almoco (2)? Digite (3) se não quiser nenhum");
            Scanner respostaScanner = new Scanner(System.in);
            int resposta = respostaScanner.nextInt();
            
            if (resposta == 1) {
                double valorFinal = valorTotal + precoCafe;
                System.out.println("O valor final e de "+ valorFinal);
            } else if (resposta == 2) {
                double valorFinal = valorTotal + precoCafe;
                System.out.println("O valor final e de "+ valorFinal);
            } else if (resposta == 3) {
                System.out.println("O valor final e de" + valorTotal);
            }
        } else if (pacote == 6) {
            double valorTotal = superflex2.getValor() * dias;
            System.out.println("O valor total sera de " + valorTotal);
            System.out.println("Gostaria de adicionar Almoco (1)? Digite (2) se não quiser nenhum");
            Scanner respostaScanner = new Scanner(System.in);
            int resposta = respostaScanner.nextInt();
            
            if (resposta == 1) {
                double valorFinal = valorTotal + precoCafe;
                System.out.println("O valor final e de "+ valorFinal);
            } else if (resposta == 2) {
                System.out.println("O valor final e de" + valorTotal);
            }
        } else if (pacote == 7) {
            double valorTotal = premium2.getValor() * dias;
            System.out.println("O valor total sera de " + valorTotal);
            System.out.println("Gostaria de adicionar Jantar (1)? Digite (2) se não quiser nenhum");
            Scanner respostaScanner = new Scanner(System.in);
            int resposta = respostaScanner.nextInt();
            
            if (resposta == 1) {
                double valorFinal = valorTotal + precoCafe;
                System.out.println("O valor final e de "+ valorFinal);
            } else if (resposta == 2) {
                System.out.println("O valor final e de" + valorTotal);
            }
        } else if (pacote == 8) {
            double valorTotal = master2.getValor() * dias;
            System.out.println("O valor total sera de " + valorTotal);
        }
    }
}
