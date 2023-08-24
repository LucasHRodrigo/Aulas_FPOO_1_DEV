/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeClasses;

/**
 *
 * @author Aluno
 */
public class Computador {
    private RAMEnum memoriaRAM;
    private ProcessadorEnum processador;
    private int memoriaHD;
    private String SO;
    private boolean placeDeVideoDedicada;
    private String fonte;

    public Computador(RAMEnum memoriaRAM, ProcessadorEnum processador, int memoriaHD, String SO, boolean placeDeVideoDedicada, String fonte) {
        this.memoriaRAM = memoriaRAM;
        this.processador = processador;
        this.memoriaHD = memoriaHD;
        this.SO = SO;
        this.placeDeVideoDedicada = placeDeVideoDedicada;
        this.fonte = fonte;
    }

    @Override
    public String toString() {
        return "Computador{" + "memoriaRAM=" + memoriaRAM + ", processador=" + processador + ", memoriaHD=" + memoriaHD + ", SO=" + SO + ", placeDeVideoDedicada=" + placeDeVideoDedicada + ", fonte=" + fonte + '}';
    }

  
    
}
