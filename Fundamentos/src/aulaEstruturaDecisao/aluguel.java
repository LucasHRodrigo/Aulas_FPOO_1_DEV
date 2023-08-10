package aulaEstruturaDecisao;

import java.util.Scanner;

public class aluguel {

    public static void main(String[] args) {
        System.out.println("ALUGUEL DE VEICULOS");
        System.out.println("Fiat Argo - Diaria R$98.00 + 2.39 por Km rodado");
        System.out.println("Fiat Mobi - Diaria R$79.00 + 1.99 por Km rodado");
        System.out.println("Hyundai HB20 - Diaria R$102.00 + 2.99 por Km rodado");
        System.out.println("Escolha seu veiculo:");

        Scanner scannerCarro = new Scanner(System.in);
        String Carro = scannerCarro.nextLine();

        if (null != Carro) switch (Carro) {
            case "Fiat Argo":{
                System.out.println("Quantos dias pretende alugar o carro?");
                Scanner scannerDiasAluguel = new Scanner(System.in);
                int diasAluguel = scannerDiasAluguel.nextInt();
                System.out.println("Quantos KM pretende percorrer?");
                Scanner scannerKMRodados = new Scanner(System.in);
                int kmRodados = scannerKMRodados.nextInt();
                double valor = (diasAluguel * 98) + (kmRodados * 2.39);
                System.out.println("O valor total sera de " + valor);
                    break;
                }
            case "Fiat Mobi":{
                System.out.println("Quantos dias pretende alugar o carro?");
                Scanner scannerDiasAluguel = new Scanner(System.in);
                int diasAluguel = scannerDiasAluguel.nextInt();
                System.out.println("Quantos KM pretende percorrer?");
                Scanner scannerKMRodados = new Scanner(System.in);
                int kmRodados = scannerKMRodados.nextInt();
                double valor = (diasAluguel * 79) + (kmRodados * 1.99);
                System.out.println("O valor total sera de " + valor);
                    break;
                }
            case "Hyundai HB20":{
                System.out.println("Quantos dias pretende alugar o carro?");
                Scanner scannerDiasAluguel = new Scanner(System.in);
                int diasAluguel = scannerDiasAluguel.nextInt();
                System.out.println("Quantos KM pretende percorrer?");
                Scanner scannerKMRodados = new Scanner(System.in);
                int kmRodados = scannerKMRodados.nextInt();
                double valor = (diasAluguel * 102) + (kmRodados * 2.99);
                System.out.println("O valor total sera de " + valor);
                    break;
                }
            default:
                break;
        }
    }
}
