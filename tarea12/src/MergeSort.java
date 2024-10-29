public class MergeSort {
    //Metodo principal
    public static void mergeSort(int[] array) {
        if (array.length <= 1) return;
        int[] tempArray = new int[array.length];
        mergeSort(array, tempArray, 0, array.length - 1);
    }

    //Metodo recursivo para dividir el array y luego fusionarlo
    private static void mergeSort(int[] array, int[] tempArray, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) return;

        int middle = (leftStart + rightEnd) / 2;
        mergeSort(array, tempArray, leftStart, middle);
        mergeSort(array, tempArray, middle + 1, rightEnd);
        mergeHalves(array, tempArray, leftStart, rightEnd);
    }

    //Metodo para fusionar las mitades divididas del array
    private static void mergeHalves(int[] array, int[] tempArray, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        //Fusiona los elementos de ambas mitades en el array temporal
        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                tempArray[index] = array[left];
                left++;
            } else {
                tempArray[index] = array[right];
                right++;
            }
            index++;
        }

        //Copia los elementos restantes de la mitad izquierda, si quedan
        System.arraycopy(array, left, tempArray, index, leftEnd - left + 1);
        //Copia los elementos restantes de la mitad derecha, si quedan
        System.arraycopy(array, right, tempArray, index, rightEnd - right + 1);
        //Copia el array temporal de vuelta al array original
        System.arraycopy(tempArray, leftStart, array, leftStart, size);
    }

}
