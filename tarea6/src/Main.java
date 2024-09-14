//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario el tamaño de la rejilla
        System.out.print("Ingrese el número de filas: ");
        int rows = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int cols = scanner.nextInt();

        //Crear el tamaño de la rejilla
        GameOfLife game = new GameOfLife(rows, cols);

        //Establece el patron inicial
        System.out.println("Ingrese las coordenadas de las células vivas (formato: fila columna).");
        System.out.println("Ingrese '-1 -1' para terminar.");

        while (true) {
            System.out.print("Coordenada (fila columna): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row == -1 && col == -1) {
                break; //Salir cuando el usuario ingresa -1 -1
            }

            if (row >= 0 && row < rows && col >= 0 && col < cols) {
                game.setVivos(row, col); //Coloca una celula viva en la coordenada especificada
            } else {
                System.out.println("Coordenadas fuera de rango, intenta de nuevo.");
            }
        }

        //Pedir el numero de generaciones a simular
        System.out.print("Ingrese el número de generaciones a simular: ");
        int generaciones = scanner.nextInt();

        //Imprimir el estado inicial de la rejilla
        System.out.println("\nEstado inicial:");
        game.printRejilla();

        //Ejecutar el juego el numero de generaciones dadas
        game.run(generaciones);

        scanner.close();
    }
}


