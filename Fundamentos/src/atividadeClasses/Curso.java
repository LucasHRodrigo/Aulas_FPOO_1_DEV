/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeClasses;

/**
 *
 * @author Aluno
 */
public class Curso {
    private String nome;
    private String descricao;
    private CategoriaEnum categoria;
    private String duracao;

    public Curso(String nome, String descricao, CategoriaEnum categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", descricao=" + descricao + ", categoria=" + categoria + ", duracao=" + duracao + '}';
    }

    
    
    
}
