/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Carro {

    private String modelo;
    private String marca;
    private CorEnum cor;
    private int ano;
    private int qtdePortas;
    private String placa;
    private int marcha;

    public Carro(String modelo, String marca, CorEnum cor, int ano, int qtdePortas, String placa, int marcha) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.qtdePortas = qtdePortas;
        this.placa = placa;
        this.marcha = marcha;
    }

    public void trocarDeMarcha(MarchaEnum novaMarcha) {
        int diferenca = novaMarcha.getNumeroMarcha() - this.marcha;

        if (diferenca == 1) {
            this.marcha = novaMarcha.getNumeroMarcha();
        } else {
            System.out.println("Voce nao pode pular a marcha");
        }
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", ano=" + ano + ", qtdePortas=" + qtdePortas + ", placa=" + placa + ", marcha=" + marcha + '}';
    }

}
