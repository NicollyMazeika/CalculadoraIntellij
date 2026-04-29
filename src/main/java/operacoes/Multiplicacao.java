package operacoes;
import entradaNumeros.EntradaNumeros;


public class Multiplicacao {
    static void main() {
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        entradaNumeros.lerNumeros();

        System.out.println(entradaNumeros.x*entradaNumeros.y);
    }
}
