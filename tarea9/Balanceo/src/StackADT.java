import java.util.EmptyStackException;
public class StackADT<T> {

        private Node<T> top;
        private int Tamanio;

        //Clase interna para un nodo
        private static class Node<T> {
            private T data;
            private Node<T> next;

            public Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        public StackADT() {
            top = null;
            Tamanio = 0;
        }

        //Metodo para agregar un elemento a la pila
        public void push(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = top;
            top = newNode;
            Tamanio++;
        }

        //Metodo para sacar un elemento de la pila
        public T pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            T data = top.data;
            top = top.next;
            Tamanio--;
            return data;
        }

        //Metodo para ver el elemento de mas arriba sin sacarlo
        public T peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return top.data;
        }

        //Verifica si la pila esta vacia
        public boolean isEmpty() {
            return top == null;
        }

        //Obtener el tamaño de la pila
        public int size() {
            return Tamanio;
        }
}
