
public class DoubleLinkedList<T> {

        private class Nodo {
            T dato;
            Nodo siguiente;
            Nodo anterior;

            public Nodo(T dato) {
                this.dato = dato;
            }

        }

        private Nodo head;
        private Nodo tail;
        private int tamanio;

        public DoubleLinkedList() {
            tamanio = 0;
        }

        // ¿Está vacía?
        public boolean estaVacia() {
            return head == null;
        }

        // Obtener tamaño de la lista
        public int getTamanio() {
            return tamanio;
        }

        // Agregar al inicio
        public void agregarAlInicio(T valor) {
            Nodo nuevo = new Nodo(valor);
            if (estaVacia()) {
                head = tail = nuevo;
            } else {
                nuevo.siguiente = head;
                head.anterior = nuevo;
                head = nuevo;
            }
            tamanio++;
        }

        // Agregar al final
        public void agregarAlFinal(T valor) {
            Nodo nuevo = new Nodo(valor);
            if (estaVacia()) {
                head = tail = nuevo;
            } else {
                tail.siguiente = nuevo;
                nuevo.anterior = tail;
                tail = nuevo;
            }
            tamanio++;
        }

        // Agregar después de un nodo referencia
        public void agregarDespuesDe(T referencia, T valor) {
            Nodo actual = head;
            while (actual != null && !actual.dato.equals(referencia)) {
                actual = actual.siguiente;
            }
            if (actual != null) {
                Nodo nuevo = new Nodo(valor);
                nuevo.siguiente = actual.siguiente;
                nuevo.anterior = actual;
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = nuevo;
                } else {
                    tail = nuevo;
                }
                actual.siguiente = nuevo;
                tamanio++;
            }
        }

        // Obtener el elemento en una posición
        public T obtener(int posicion) {
            if (posicion < 0 || posicion >= tamanio) {
                throw new IndexOutOfBoundsException("Posición fuera de rango");
            }
            Nodo actual = head;
            for (int i = 0; i < posicion; i++) {
                actual = actual.siguiente;
            }
            return actual.dato;
        }

        // Eliminar el primer nodo
        public void eliminarElPrimero() {
            if (!estaVacia()) {
                if (head == tail) {
                    head = tail = null;
                } else {
                    head = head.siguiente;
                    head.anterior = null;
                }
                tamanio--;
            }
        }

        // Eliminar el último nodo
        public void eliminarElFinal() {
            if (!estaVacia()) {
                if (head == tail) {
                    head = tail = null;
                } else {
                    tail = tail.anterior;
                    tail.siguiente = null;
                }
                tamanio--;
            }
        }

        // Eliminar por posición
        public void eliminar(int posicion) {
            if (posicion < 0 || posicion >= tamanio) {
                throw new IndexOutOfBoundsException("Posición fuera de rango");
            }
            if (posicion == 0) {
                eliminarElPrimero();
            } else if (posicion == tamanio - 1) {
                eliminarElFinal();
            } else {
                Nodo actual = head;
                for (int i = 0; i < posicion; i++) {
                    actual = actual.siguiente;
                }
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
                tamanio--;
            }
        }

        // Buscar un valor en la lista
        public int buscar(T valor) {
            Nodo actual = head;
            int posicion = 0;
            while (actual != null) {
                if (actual.dato.equals(valor)) {
                    return posicion;
                }
                actual = actual.siguiente;
                posicion++;
            }
            return -1; // Si no encuentra el valor
        }

        // Actualizar un valor
        public void actualizar(T a_buscar, T valor) {
            Nodo actual = head;
            while (actual != null && !actual.dato.equals(a_buscar)) {
                actual = actual.siguiente;
            }
            if (actual != null) {
                actual.dato = valor;
            }
        }

        // Recorrido transversal
        public void transversal(int direccion) {
            //izquierda --> derecha
            if (direccion==1) {
                Nodo actual = head;
                while (actual != null) {
                    System.out.print(actual.dato + " ");
                    actual = actual.siguiente;
                }
                //derecha --> izquierda
            } else if (direccion==0) {
                Nodo actual = tail;
                while (actual != null) {
                    System.out.print(actual.dato + " ");
                    actual = actual.anterior;
                }
            }
            System.out.println();
            System.out.println("");
        }

        }




