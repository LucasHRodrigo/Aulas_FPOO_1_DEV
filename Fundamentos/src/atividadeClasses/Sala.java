/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeClasses;

/**
 *
 * @author Aluno
 */
public class Sala {
    private int qtdeCadeiras;
    private int qtdeMesas;
    private int numeroSala;
    private boolean temProjetor;
    private int qtdeComputadores;

    public Sala(int qtdeCadeiras, int qtdeMesas, int numeroSala, boolean temProjetor, int qtdeComputadores) {
        this.qtdeCadeiras = qtdeCadeiras;
        this.qtdeMesas = qtdeMesas;
        this.numeroSala = numeroSala;
        this.temProjetor = temProjetor;
        this.qtdeComputadores = qtdeComputadores;
    }

    @Override
    public String toString() {
        return "Sala{" + "qtdeCadeiras=" + qtdeCadeiras + ", qtdeMesas=" + qtdeMesas + ", numeroSala=" + numeroSala + ", temProjetor=" + temProjetor + ", qtdeComputadores=" + qtdeComputadores + '}';
    }
    
}
