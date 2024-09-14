public class GameOfLife {
    private Array2d rejilla;
    private final char VIVO = 'V';
    private final char MUERTO = '-';

    public GameOfLife(int rows, int cols) {
        rejilla = new Array2d(rows, cols);
        rejilla.clear(MUERTO);  //Inicializa la rejilla con todas las celdas muertas
    }

    //Establecer una celula viva en la posicion dada
    public void setVivos(int row, int col) {
        rejilla.setItem(row, col, VIVO);
    }

    //Obtener el estado de una celula
    public char getCell(int row, int col) {
        return rejilla.getItem(row, col);
    }

    //Calcular el numero de vecinos vivos alrededor de una celda
    private int contarVecinosVivos(int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;  //Ignora la propia celda
                int filaVecina = row + i;
                int columnaVecina = col + j;
                if (filaVecina >= 0 && filaVecina < rejilla.getRowSize() &&
                        columnaVecina >= 0 && columnaVecina < rejilla.getColSize() &&
                        rejilla.getItem(filaVecina, columnaVecina) == VIVO) {
                    count++;
                }
            }
        }
        return count;
    }

    //Aplicar las reglas del juego de la vida y avanzar una generacion
    public void generacionSigu() {
        Array2d newBoard = new Array2d(rejilla.getRowSize(), rejilla.getColSize());
        newBoard.clear(MUERTO);

        for (int i = 0; i < rejilla.getRowSize(); i++) {
            for (int j = 0; j < rejilla.getColSize(); j++) {
                int vecinosVivos = contarVecinosVivos(i, j);
                char currentState = rejilla.getItem(i, j);

                if (currentState == VIVO) {
                    //La celula vive si tiene 2 o 3 vecinos vivos
                    if (vecinosVivos == 2 || vecinosVivos == 3) {
                        newBoard.setItem(i, j, VIVO);
                    } else {
                        newBoard.setItem(i, j, MUERTO);  // Muerte por soledad o sobrepoblación
                    }
                } else {
                    //Una celula muerta revive si tiene exactamente 3 vecinos vivos
                    if (vecinosVivos == 3) {
                        newBoard.setItem(i, j, VIVO);
                    }
                }
            }
        }

        //Reemplazar la rejilla vieja con la nueva
        rejilla = newBoard;
    }

    //Imprimir el estado actual de la rejilla
    public void printRejilla() {
        System.out.println(rejilla.toString());
    }

    //Metodo para ejecutar el juego por un numero determinado de generaciones
    public void run(int generaciones) {
        for (int i = 0; i < generaciones; i++) {
            System.out.println("Generacion " + (i + 1) + ":");
            printRejilla();
            generacionSigu();
        }
    }
}

