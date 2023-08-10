package aulaEstruturaDecisao;

import java.util.Scanner;

public class economia {

    public static void main(String[] args) {
        System.out.println("CALCULADORA ECONOMIA");
        System.out.println("Notebook - R$ 3299,00 - 5%");
        System.out.println("Celular - R$ 1789,00 - 10%");
        System.out.println("Carro - R$ 68000,00 - 2%");
        System.out.println("Apartamento - R$ 180000,00 - 1%");
        System.out.println("Escolha o produto");
        Scanner scannerProduto = new Scanner(System.in);
        String produto = scannerProduto.nextLine();

        if (null != produto) switch (produto) {
            case "Notebook":{
                double notebookParcela = 3299 * 0.05;
                int meses = 20;
                System.out.println("O produto sera pago em " + meses + " meses e cada parcela custara " + notebookParcela);
                    break;
                }
            case "Celular":{
                double notebookParcela = 1789 * 0.1;
                int meses = 10;
                System.out.println("O produto sera pago em " + meses + " meses e cada parcela custara " + notebookParcela);
                    break;
                }
            case "Carro":{
                double notebookParcela = 68000 * 0.02;
                int meses = 50;
                System.out.println("O produto sera pago em " + meses + " meses e cada parcela custara " + notebookParcela);
                    break;
                }
            case "Apartamento":{
                double notebookParcela = 180000 * 0.01;
                int meses = 100;
                System.out.println("O produto sera pago em " + meses + " meses e cada parcela custara " + notebookParcela);
                    break;
                }
            default:
                break;
        }

    }
}
