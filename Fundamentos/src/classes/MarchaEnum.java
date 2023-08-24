/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public enum MarchaEnum {
    PRIMEIRA("Primeira Marcha", 1),
    SEGUNDA("Segunda Marcha", 2),
    TERCEIRA("Terceira Marcha", 3),
    QUARTA("Quarta Marcha", 4),
    QUINTA("Quinta Marcha", 5),
    RE("Marcha Ré", -1),
    NEUTRO("Neutro", 0);

    private String marcha;
    private int numeroMarcha;

    private MarchaEnum(String marcha, int numeroMarcha) {
        this.marcha = marcha;
        this.numeroMarcha = numeroMarcha;
    }

    public String getMarcha() {
        return marcha;
    }

    public int getNumeroMarcha() {
        return numeroMarcha;
    }

    @Override
    public String toString() {
        return "MarchaEnum{" + "marcha=" + marcha + '}';
    }

}
