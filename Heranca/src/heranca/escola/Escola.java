/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Escola {

    public static void main(String[] args) {
        Professor p1 = new Professor(true, "Pedro Nobile", "pedro@gmail.com", 30, "19 995953883");
        System.out.println("Professor " + p1);
        System.out.println("gmail: " +p1.verificarDominioEmailGmail(""));
        System.out.println("Yahoo: " +p1.verificarDominioEmailYahoo(""));
        System.out.println("Dedicacao Exclusiva: " + p1.isDedicacaoExclusiva());
        System.out.println("");
        
        Professor p2 = new Professor(false, "Fernando Pereira", "fernando.per97@yahoo.com", 26, "19 98983891");
        System.out.println("Professor " + p2);
        System.out.println("Gmail: " +p2.verificarDominioEmailGmail(""));
        System.out.println("Yahoo: " +p2.verificarDominioEmailYahoo(""));
        System.out.println("Dedicacao Exclusiva: " + p2.isDedicacaoExclusiva());
        System.out.println("");
        
        Aluno a1 = new Aluno("4253", "Lucas Herculano", "lucas.he@gmail.com", 17, "19 940028922");
        System.out.println("Aluno " + a1);
        System.out.println("Gmail: " +a1.verificarDominioEmailGmail(""));
        System.out.println("Yahoo: " +a1.verificarDominioEmailYahoo(""));
        System.out.println("Caracteres RA: " + a1.getRM().length());
        System.out.println("");
        
        Aluno a2 = new Aluno("3881", "Matheus Giovanni", "matheusgiovanni@yahoo.com", 19, "19 973499798");
        System.out.println("Aluno " + a2);
        System.out.println("Gmail: " +a2.verificarDominioEmailGmail(""));
        System.out.println("Yahoo: " +a2.verificarDominioEmailYahoo(""));
        System.out.println("Caracteres RA: " + a2.getRM().length());
        System.out.println("");
    }
}
