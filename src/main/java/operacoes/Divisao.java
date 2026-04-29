package operacoes;
import entradaNumeros.EntradaNumeros;


public class Divisao {
    public static void main(String[] args) {
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        entradaNumeros.lerNumeros();

        System.out.println(entradaNumeros.x/entradaNumeros.y);
    }
}
