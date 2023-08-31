package orientacaoObjetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Locadora {
    public static void main(String[] args) throws UnsupportedEncodingException {
       System.setOut(new  PrintStream(System.out, true, "UTF-8"));
       
       Cliente cliente1 = new Cliente("Pedro"); 
       double valorLocacao = cliente1.calcularLocacao(3, false);
       System.out.println(cliente1);  
        System.out.println("O valor para sua locação é " + valorLocacao);
    
       Cliente cliente2 = new Cliente("Mariana", "mariana.87@gmail.com");
       double valorLocacao2 = cliente2.calcularLocacao(5, true);
        System.out.println(cliente2);
        System.out.println("O valor para sua locação é " + valorLocacao2);
    }
}
