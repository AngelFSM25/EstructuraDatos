
package listasenlazadas;

public class ListasEnlazadas {

    public static void main(String[] args) {

        Nodo<Integer> head = new Nodo<>(100,new Nodo<>(200, new Nodo<>(300, new Nodo<>(400, new Nodo<>(600)))));
        head.getSiguiente().getSiguiente().setDato(333);
        head.getSiguiente().getSiguiente().getSiguiente().getSiguiente().setSiguiente(new Nodo<>(700,null));
        
        //Agregar un nodo al inicio de la lista
        head = new Nodo<>(50,head);
       
        Nodo<Integer> aux = head;
        System.out.print("|");
        while (aux != null){
            System.out.print(aux.getDato() + "| -> |");
            aux = aux.getSiguiente();
        }
        System.out.print("null|");

    }
}
