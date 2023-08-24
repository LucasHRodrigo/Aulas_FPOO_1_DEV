/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeClasses;

/**
 *
 * @author Aluno
 */
public enum ProcessadorEnum {
    Ryzen_7("Ryzen 7"),
    Ryzen_5("Ryzen 5"),
    Ryzen_3("Ryzen 3"),
    I9("I9"),
    I7("I7"),
    I5("I5"),
    I3("I3");
    
    private String processador;

    private ProcessadorEnum(String processador) {
        this.processador = processador;
    }

    @Override
    public String toString() {
        return "ProcessadorEnum{" + "processador=" + processador + '}';
    }
    
}

