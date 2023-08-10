package aulaEstruturaDecisao;

import java.util.Scanner;

public class construcao {

    public static void main(String[] args) {
        System.out.println("Digite a largura do terreno");
        Scanner scannerLargura = new Scanner(System.in);
        double Largura = scannerLargura.nextDouble();
        System.out.println("Digite o comprimento do terreno");
        Scanner scannerComprimento = new Scanner(System.in);
        double Comprimento = scannerComprimento.nextDouble();

        double areaTerreno = Largura * Comprimento;

        if (areaTerreno <= 250) {
            double valorConstrucao = areaTerreno * 8.50;
            System.out.println("O valor da construcao sera de " + valorConstrucao);
        } else if (areaTerreno <= 350) {
            double valorConstrucao = areaTerreno * 9.50;
            System.out.println("O valor da construcao sera de " + valorConstrucao);
        } else if (areaTerreno > 350) {
            double valorConstrucao = areaTerreno * 11.50;
            System.out.println("O valor da construcao sera de " + valorConstrucao);
        }
    }
}
