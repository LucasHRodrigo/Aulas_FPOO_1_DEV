/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca.escola;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa {

    private String RM;

    public Aluno(String RM, String nome, String email, int idade, String telefone) {
        super(nome, email, idade, telefone);
        this.RM = RM;
    }

    public boolean verificarMaiordeIdade() {
        return super.verificarMaiorIdade();
    }

    @Override
    public String toString() {
        return super.toString() + "Aluno{" + "RM=" + RM + '}';
    }
}
