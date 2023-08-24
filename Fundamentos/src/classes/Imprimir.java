/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Imprimir {

    public static void main(String[] args) {
        Carro carro = new Carro("x", "y", "vermelho", 2017, 4, "MXS-6883");
        Carro carro2 = new Carro("a", "b", "Azul", 2021, 4, "KMS-7041");
        Aluno aluno = new Aluno("Pedro Armando Silva", "pedro.silva@gmail.com", "4253", "1 A", 8.9, 10);
        Aluno aluno2 = new Aluno("Lais Fonseca", "lais.fon08@gmail.com", "3192", "8 B", 9.5, 6);
        
        System.out.println(carro);
        System.out.println(carro2);
        System.out.println("");
        System.out.println(aluno);
        System.out.println(aluno2);
    }
}
