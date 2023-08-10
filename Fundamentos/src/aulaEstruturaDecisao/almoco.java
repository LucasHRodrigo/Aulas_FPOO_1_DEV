package aulaEstruturaDecisao;

import java.util.Scanner;

public class almoco {

    public static void main(String[] args) {
        System.out.println("ESCOLHA O SEU PRATO (Digite o valor da opcao)");
        System.out.println("Opcao 1: Arroz, Feijao, Bife Acebolado");
        System.out.println("Opcao 2: Arroz, Feijao, File de Frango");
        System.out.println("Opcao 3: Arroz, Feijao, Brajola");
        Scanner scannerPrato = new Scanner(System.in);
        int Prato = scannerPrato.nextInt();

        System.out.println("Digite a quantidade");
        Scanner scannerQuantidade = new Scanner(System.in);
        int Quantidade = scannerQuantidade.nextInt();

        if (Prato == 1) {
            double valorOpcao1 = 19.99;
            double valorTotal = Quantidade * valorOpcao1;
            System.out.println("O valor total sera " + valorTotal);
        } else if (Prato == 2) {
            double valorOpcao2 = 18.99;
            double valorTotal = Quantidade * valorOpcao2;
            System.out.println("O valor total sera " + valorTotal);
        } else if (Prato == 3) {
            double valorOpcao3 = 23.99;
            double valorTotal = Quantidade * valorOpcao3;
            System.out.println("O valor total sera " + valorTotal);
        }

    }
}
