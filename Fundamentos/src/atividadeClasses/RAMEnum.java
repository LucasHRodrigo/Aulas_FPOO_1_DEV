/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeClasses;

import classes.CorEnum;

/**
 *
 * @author Aluno
 */
public enum RAMEnum {
    QUATRO_GB("4gb"),
    OITO_GB("8gb"),
    DOZE_GB("12gb"),
    DEZESSEIS_GB("16gb"),
    TRINTA_E_DOIS_GB("32gb");
    
    private String memoria;

    private RAMEnum(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "MemoriaEnum{" + "memoria=" + memoria + '}';
    }
    
    
}


