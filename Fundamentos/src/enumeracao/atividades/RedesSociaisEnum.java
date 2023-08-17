/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeracao.atividades;

/**
 *
 * @author Aluno
 */
public enum RedesSociaisEnum {
    INFORMACOES("Informações"),
    ENTRETENIMENTO("Entretenimento"),
    MENSAGEM("Mensagem"),
    FOTOS("Fotos"),
    VIDEOS("Vídeos");

    private String RedeSocial;

    private RedesSociaisEnum(String tiposRedesSociais) {
        this.RedeSocial = RedeSocial;
    }

    public String getCategoriaRedeSocial() {
        return this.RedeSocial;
    }
}
