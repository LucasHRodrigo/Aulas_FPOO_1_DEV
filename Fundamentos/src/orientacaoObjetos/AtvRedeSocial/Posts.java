/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoObjetos.AtvRedeSocial;

/**
 *
 * @author Aluno
 */
public class Posts {
    public String legenda;
    public int estrelas;
    public String horario;
    public int compartilhamentos;
    public String usuario;
   

    public Posts(String legenda, int estrelas, String horario, int compartilhamentos, String usuario) {
        this.legenda = legenda;
        this.estrelas = estrelas;
        this.horario = horario;
        this.compartilhamentos = compartilhamentos;
        this.usuario = usuario;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCompartilhamentos() {
        return compartilhamentos;
    }

    public void setCompartilhamentos(int compartilhamentos) {
        this.compartilhamentos = compartilhamentos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Posts{" + "legenda=" + legenda + ", estrelas=" + estrelas + ", horario=" + horario + ", compartilhamentos=" + compartilhamentos + ", usuario=" + usuario + '}';
    }
    
    
}
