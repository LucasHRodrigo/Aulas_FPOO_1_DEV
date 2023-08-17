/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum CantinaEnum {
    SALGADOS("Salgados"),
    DOCES_ARTESANAIS("Doces Artesanais"),
    DOCES_INDUSTRIALIZADOS("Doces Industrializados"),
    BEBIDAS("Bebidas"),
    PRATO_FEITO("Prato Feito"),
    FRUTAS("Frutas"),
    LANCHES("Lanches"),
    BALAS("Balas");
    
    private String Cantina;

    private CantinaEnum(String cantina) {
        this.Cantina = Cantina;
    }

    public String getCategoriaComida() {
        return this.Cantina;
    }
}

