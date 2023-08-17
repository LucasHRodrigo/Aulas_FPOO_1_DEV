/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum LivrosEnum {
        ROMANCE("Romance"),
        SUSPENSE("Suspense"),
        COMEDIA("Comedia"),
        TECNICO("Tecnico"),
        FICCAO_CIENTIFICA("Ficcao Cientifica");

        private String generoLivro;

        private LivrosEnum(String livro) {
           this.generoLivro = generoLivro;
        }

        public String getCategoriaLivro() {
            return this.generoLivro;
        }
    }
