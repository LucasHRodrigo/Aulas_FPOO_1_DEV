/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeClasses;

/**
 *
 * @author Aluno
 */
public enum CategoriaEnum {
        PROGRAMACAO("Programacao"),
        DESENHO("Desenho"),
        CULINARIA("Culinaria"),
        TECNICO("Tecnico"),;
        
        private String categoria;

    private CategoriaEnum(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "CategoriaEnum{" + "categoria=" + categoria + '}';
    }
        
}
