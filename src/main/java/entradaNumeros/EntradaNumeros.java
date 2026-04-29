package entradaNumeros;
import java.util.Scanner;
public class EntradaNumeros {
    public int x;
    public int y;

    public void lerNumeros(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE O PRIMEIRO NUMERO");
        x = scanner.nextInt();
        System.out.print("DIGITE O SEGUNDO NUMERO");
        y = scanner.nextInt();
    }
}

