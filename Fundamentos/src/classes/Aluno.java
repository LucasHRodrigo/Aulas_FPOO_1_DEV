/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Aluno {
    private String nome;
    private String email;
    private String RA;
    private String classe;
    private double nota;
    private int sala;

    public Aluno(String nome, String email, String RA, String classe, double nota, int sala) {
        this.nome = nome;
        this.email = email;
        this.RA = RA;
        this.classe = classe;
        this.nota = nota;
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", email=" + email + ", RA=" + RA + ", classe=" + classe + ", nota=" + nota + ", sala=" + sala + '}';
    }
    
    
}
