import java.util.Stack;

public class RecursividadPila {

    //Metodo recursivo para obtener el elemento en la posicion media
    public static String elementoMedioRe(Stack<String> pila, int mitad) {
        if (mitad == 0) {
            //Devolvemos el elemento en la posición media
            return pila.pop();
        }
        //Eliminamos el elemento superior y lo guardamos
        String elemento = pila.pop();

        //Llamamos recursivamente para llegar al medio
        String elementoMedio = elementoMedioRe(pila, mitad - 1);

        //Volvemos a poner los elementos eliminados en la pila
        pila.push(elemento);

        return elementoMedio;
    }
}
