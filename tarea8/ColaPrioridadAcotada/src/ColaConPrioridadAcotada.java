import java.util.Arrays;

public class ColaConPrioridadAcotada<E> {
    private ColaADT<E> []colas;
    private int maxPrioridad;


    public ColaConPrioridadAcotada() {
        this(5);
    }

    public ColaConPrioridadAcotada(int maxPrioridad) {
        this.maxPrioridad = maxPrioridad;
        this.colas = new ColaADT[maxPrioridad +1];
        for (int i = 0; i < this.maxPrioridad +1; i++) {
            this.colas[i] = new ColaADT<>();
        }
    }

    public int longitud(){
        int total = 0;
        for (int i = 0; i < maxPrioridad+1; i++) {
            total += this.colas[i].longitud();
        }
        return total;
    }

    public boolean estaVacia(){ //
        return this.longitud() == 0;
    }

    public void encolar(int prioridad, E elemento){
        if (prioridad>= 1 && prioridad <= this.maxPrioridad){
            this.colas[prioridad].encolar(elemento);
        }
    }
    public E desEncolar() {
        for (int i = 0; i <= this.maxPrioridad; i++) {
            if (!this.colas[i].estaVacia()) {
                return this.colas[i].desEncolar(); // Desencola el primer elemento disponible
            }
        }
        throw new IllegalStateException("No hay más elementos en la cola."); // Si esta vacia
    }

    @Override
    public String toString() {
        return "Cola Con Prioridad Acotada" +
                Arrays.toString(colas) +
                ", Maxima Prioridad = " + maxPrioridad
                ;
    }
}

