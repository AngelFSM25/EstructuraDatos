import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //Contador regresivo usando recursion
        System.out.println("Contador regresivo");
        int p = 10;
        RecursividadCuentaRe.CuentaRegresiva(p);
        System.out.println("----------------------------------------------");

        //Sacar de un ADT pila el valor en la posición media con recursion
        //Creamos una pila
        Stack<String> pila = new Stack<>();
        pila.push("Rojo");
        pila.push("Verde");
        pila.push("Azul");
        pila.push("Rosa");
        pila.push("Blanco");

        System.out.println("La pila es: " + pila);

        //Obtenemos la longitud de la pila
        int tamanio = pila.size();

        // Obtenemos la mitad de la longitud de la pila
        int mitad = tamanio / 2;

        //Obtenemos el elemento en la posicion media usando recursion
        String elementoMedio = RecursividadPila.elementoMedioRe(pila, mitad);

        //Imprimimos el elemento en la posición media
        System.out.println("El elemento medios es: " + elementoMedio);

        //Imprimimos la pila después de la extraccion
        System.out.println("Pila despues de extraer el elemento medio: " + pila);
    }
}
