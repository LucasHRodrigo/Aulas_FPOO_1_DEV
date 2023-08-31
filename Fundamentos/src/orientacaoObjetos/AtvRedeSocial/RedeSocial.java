/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoObjetos.AtvRedeSocial;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Aluno
 */
public class RedeSocial implements ClassificacaoPost{
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new  PrintStream(System.out, true, "UTF-8"));
        
         Posts post1 = new Posts("Vendo Celta 2005 1.4 Spirit. Preço Inbox", COMUM, "12:43", 40, "Marcelo Souza");
         System.out.println(post1.usuario + "          " +  post1.horario);
         System.out.println(post1.legenda);
         System.out.println("");
         System.out.println("Classificação: " + post1.estrelas + "          " + "Compartilhamentos: " +post1.compartilhamentos);
         
         System.out.println("..........................................................................................................................................................................................................");
         
          Posts post2 = new Posts("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", MUITO_RUIM, "11:14", 3, "Amanda Nascimento");
         System.out.println(post2.usuario + "          " +  post2.horario);
         System.out.println(post2.legenda);
         System.out.println("");
         System.out.println("Classificação: " + post2.estrelas + "          " + "Compartilhamentos: " +post2.compartilhamentos);
         
         System.out.println("..........................................................................................................................................................................................................");
         
          Posts post3 = new Posts("VAGA DE EMPREGO no setor da Engenharia Civil. Salário: 7.000 (sujeito a negociações). Compartilhem.", SUPER_LEGAL, "19:51", 191, "Daniel Ramos");
         System.out.println(post3.usuario + "          " +  post3.horario);
         System.out.println(post3.legenda);
         System.out.println("");
         System.out.println("Classificação: " + post3.estrelas + "          " + "Compartilhamentos: " +post3.compartilhamentos);
         
         System.out.println("..........................................................................................................................................................................................................");
         
          Posts post4 = new Posts("Olha só quanto charme!! <3", SUPER_LEGAL, "14:55", 412, "Juliana Monique");
         System.out.println(post4.usuario + "          " +  post4.horario);
         System.out.println(post4.legenda);
         System.out.println("");
         System.out.println("Classificação: " + post4.estrelas + "          " + "Compartilhamentos: " +post4.compartilhamentos);
         
         System.out.println("..........................................................................................................................................................................................................");
    }
}
