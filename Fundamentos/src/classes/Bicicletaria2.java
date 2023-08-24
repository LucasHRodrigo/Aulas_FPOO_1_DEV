/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class Bicicletaria2 {

    public static void main(String[] args) {
        Bicicleta1 caloiCross = new Bicicleta1(2, true, 8, "Caloi Cross", true, "Azul");
        System.out.println(caloiCross);

        caloiCross.andar(10);
        caloiCross.andar(20);
        caloiCross.andar(30);

        System.out.println(caloiCross);
    }
}
