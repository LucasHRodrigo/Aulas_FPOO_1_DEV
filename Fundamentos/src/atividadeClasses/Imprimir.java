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
        Sala salaAula = new Sala(32, 32, 2, true, 2, false, true);
        Sala salaInformatica = new Sala(21, 25, 5, true, 25, true, true);
        Sala salaReuniao = new Sala(15, 15, 3, true, 2, false , true);

        Computador computadorJogos = new Computador(RAMEnum.TRINTA_E_DOIS_GB, ProcessadorEnum.Ryzen_7, 1024, "Windows", true, "700w");
        Computador computadorEscritorio = new Computador(RAMEnum.OITO_GB, ProcessadorEnum.Ryzen_3, 512, "Windows", false, "500w");
        Computador computadorJogos2 = new Computador(RAMEnum.DEZESSEIS_GB, ProcessadorEnum.I9, 1024, "Windows", true, "600w");

        
        Curso cursoDesenhoTecnico = new Curso("Desenho Tecnico", "Curso de especializacao em Desenhos Tecnicos", CategoriaEnum.DESENHO, "35h", true);
        Curso cursoProgramacao = new Curso("Programacao em C++", "Curso gratuito de C++, do nivel basico ao nivel avancado", CategoriaEnum.INFORMATICA, "60h", false);
        Curso cursoSolda = new Curso("Tecnico em Solda", "Curso tecnico de Solda disponibilizado pelo SENAI", CategoriaEnum.TECNICO, "1200h", true);
        
        System.out.println(".....................................................................................................................................................................................................................................");
        System.out.println(salaAula);
        System.out.println(salaInformatica);
        System.out.println(salaReuniao);
        
        System.out.println("");
        
        System.out.println(computadorJogos);
        System.out.println(computadorEscritorio);
        System.out.println(computadorJogos2);
        
        System.out.println("");
        
        System.out.println(cursoDesenhoTecnico);
        System.out.println(cursoProgramacao);
        System.out.println(cursoSolda);

}
