
public class Main {

        public static void main(String[] args) {
            int[] array = {38,27,43,3,9,82,10,19,50,61};
            System.out.println("Array original: ");
            printArray(array);

            MergeSort.mergeSort(array);

            System.out.println("\nArray ordenado: ");
            printArray(array);
        }

        //Metodo auxiliar para imprimir el array
        private static void printArray(int[] array) {
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }