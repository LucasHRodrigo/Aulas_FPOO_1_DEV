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
    PRIMEIRA("Primeira Marcha"),
    SEGUNDA("Segunda Marcha"),
    TERCEIRA("Terceira Marcha"),
    QUARTA("Quarta Marcha"),
    QUINTA("Quinta Marcha"),
    RE("Marcha Ré"),
    NEUTRO("Neutro");

    private String marcha;

    private MarchaEnum(String marcha) {
        this.marcha = marcha;
    }

    public String getMarcha() {
        return marcha;
    }

}
