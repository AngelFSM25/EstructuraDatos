import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce la expresion a evaluar \n");
        String texto = teclado.nextLine();

        if (Balanceo.estanBalanceados(texto)) {
            System.out.println("La expresion esta balanceada.");
        } else {
            System.out.println("La expresion NO esta balanceada.");
        }
    }
}