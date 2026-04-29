package operacoes;
import entradaNumeros.EntradaNumeros;



public class Adicao {
    static void main() {
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        entradaNumeros.lerNumeros();

        System.out.println(entradaNumeros.x+entradaNumeros.y);
    }
}
