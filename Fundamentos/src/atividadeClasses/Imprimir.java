/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeClasses;

/**
 *
 * @author Aluno
 */
public class Imprimir {

    public static void main(String[] args) {
        Sala sala1 = new Sala(32, 32, 2, true, 2);
        Sala sala2 = new Sala(21, 25, 5, true, 25);
        Sala sala3 = new Sala(15, 15, 3, false, 0);

        Computador computador1 = new Computador(RAMEnum.TRINTA_E_DOIS_GB, ProcessadorEnum.Ryzen_7, 1024, "Windows");
        Computador computador2 = new Computador(RAMEnum.DEZESSEIS_GB, ProcessadorEnum.Ryzen_3, 512, "Windows");
        Computador computador3 = new Computador(RAMEnum.DEZESSEIS_GB, ProcessadorEnum.I9, 1024, "Windows");

        Curso curso1 = new Curso("Desenho Tecnico", "Curso de especializacao em Desenhos Tecnicos", CategoriaEnum.DESENHO);
        Curso curso2 = new Curso("Programacao em C++", "Curso gratuito de C++, do nivel basico ao nivel avancado", CategoriaEnum.PROGRAMACAO);
        Curso curso3 = new Curso("Tecnico em Solda", "Curso tecnico de Solda disponibilizado pelo SENAI", CategoriaEnum.TECNICO);
        
        System.out.println(".....................................................................................................................................................................................................................................");
        System.out.println(sala1);
        System.out.println(sala2);
        System.out.println(sala3);
        
        System.out.println("");
        
        System.out.println(computador1);
        System.out.println(computador2);
        System.out.println(computador3);
        
        System.out.println("");
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
    }

}
