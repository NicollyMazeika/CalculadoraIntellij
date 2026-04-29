package operacoes;
import entradaNumeros.EntradaNumeros;


public class Subtracao {
    static void main() {
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        entradaNumeros.lerNumeros();

        System.out.println(entradaNumeros.x-entradaNumeros.y);
    }
}
