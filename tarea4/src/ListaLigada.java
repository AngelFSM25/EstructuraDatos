public class ListaLigada<T> {
    private Nodo <T> head;

    //Constructor
    public ListaLigada() {
    }

    //Verificar si esta vacia
    public boolean estaVacia(){
        if (this.head == null) {
            System.out.println("esta vacia");
            return true;
        }
        System.out.println("no esta vacia");
        return false;
    }

    //Obtener el tamanio de la lista
    public int getTamanio(){
        Nodo aux = this.head;
        int contador = 0;
        while (aux!=null){
            contador++;
            aux = aux.getSiguiente();
        }
        return contador;
    }

    //Agregar al final
    public void agregarAlFinal(T dato){
        Nodo<T> nuevo = new Nodo<>(dato);
        if(head == null){
            head = nuevo;
        }else {
            Nodo<T> aux = this.head;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    //Inserta un nodo al inicio
    public void insertarAlInicio(T dato){
        this.head = new Nodo<>(dato, this.head);
    }

    //Eliminar el primer nodo
    public void eliminarElPrimero(){
        this.head = head.getSiguiente();
    }

    //Eliminar
    public void eliminar(int posicion) {
        if (head == null) {
            System.out.println("Lista vacía");
            return;
        }
        if (posicion == 0) {
            // Eliminar el primer nodo
            head = head.getSiguiente();
            return;
        }
        Nodo<T> aux = this.head;
        int contador = 0;
        while (aux != null && contador < posicion - 1) {
            aux = aux.getSiguiente();
            contador++;
             }
                if (aux != null && aux.getSiguiente() != null) {
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
             } else {
             System.out.println("Posición fuera de los límites");
        }
    }

    //Eliminar el nodo final
    public void eliminarElFinal(){
        if (head == null) {
            System.out.println("Lista vacia");
            return;
        }
        if (head.getSiguiente() == null) {
            // Si solo hay un nodo, la lista se vacía
            head = null;
        } else {
            // Recorremos la lista hasta encontrar el penúltimo nodo
            Nodo<T> aux = head;
            while (aux.getSiguiente().getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            // Apuntamos a null el ultimo nodo
            aux.setSiguiente(null);
        }
    }

    //Recorrido transversal
    public void transversal(){
        Nodo<T> aux = this.head;
        while (aux != null){
            System.out.print(aux.getDato() + "\n");
            aux = aux.getSiguiente();
        }
        System.out.println("");
    }

    //Busca un elemento en la lista
    public int buscar (int elemento){
        Nodo aux = this.head;
        int contador = 0;
        while (aux!=null){
            if(aux.getDato().equals(elemento)){
                return contador;
            }
            aux = aux.getSiguiente();
            contador++;
        }
        return -1;
    }

    //Actualizar dato
    public boolean actualizar (T a_buscar,T elemento){
        Nodo aux = this.head;
        while (aux!=null){
            if(aux.getDato().equals(a_buscar)){
                aux.setDato(elemento);
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    //Agregar nodo despues de
    public boolean agregarDespues(T referencia, T valor) {
        Nodo aux = this.head;
        while (aux!=null){
            if(aux.getDato().equals(referencia)){
                Nodo<T> nuevo = new Nodo<>(valor);
                nuevo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(nuevo);
            }
            aux = aux.getSiguiente();
        }
        return false;
    }
}

