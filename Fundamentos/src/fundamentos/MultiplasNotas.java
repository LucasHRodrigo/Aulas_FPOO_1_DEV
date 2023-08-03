

package fundamentos;


public class MultiplasNotas {
    public static void main(String[] args) {
        int rs = somar(8, 9, 6, 10, 9);
        System.out.println("A soma e: " + rs);
    }
    
    public static int somar (int ... valores) {
        int resultado = 0;
        for (int i = 0; i < valores.length; i++) {
            int valor = valores[i];
            resultado += valor;
        }
        return resultado;
    }
}
