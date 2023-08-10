package aulaEstruturaDecisao;

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        System.out.println("Qual o seu cargo dentro da empresa?");
        Scanner scannerCargo = new Scanner(System.in);
        String Cargo = scannerCargo.nextLine();
        
        double salarioGerente = 5590.00;
        double salarioSupervisor = 4128.00;
        double salarioTecnico = 3789.00;
        double salarioAuxiliar = 2345.00;
        
        if (null != Cargo) switch (Cargo) {
            case "Gerente":
                double salarioFinalGerente = salarioGerente-(salarioGerente*0.08)-289;
                System.out.println("Seu salario final e de " + salarioFinalGerente);
                break;
            case "Supervisor":
                double salarioFinalSupervisor = salarioSupervisor-(salarioSupervisor*0.07)-239;
                System.out.println("Seu salario final e de " + salarioFinalSupervisor);
                break;
            case "Tecnico":
                double salarioFinalTecnico = salarioSupervisor-(salarioTecnico*0.04)-189;
                System.out.println("Seu salario final e de " + salarioFinalTecnico);    
                break;
            case "Auxiliar":
                double salarioFinalAuxiliar = salarioAuxiliar-(salarioAuxiliar*0.02)-156;
                System.out.println("Seu salario final e de " + salarioFinalAuxiliar);
                break;
            default:
                break;
        }
    }
}
