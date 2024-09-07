
public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> numeros= new DoubleLinkedList<>();
        numeros.agregarAlInicio(50);
        numeros.agregarAlFinal(60);
        numeros.agregarAlFinal(65);
        numeros.agregarAlFinal(70);
        numeros.agregarAlFinal(80);
        numeros.agregarAlFinal(90);
        numeros.transversal(1);

        numeros.eliminar(1);
        numeros.transversal(1);


        numeros.actualizar(90,88);
        numeros.transversal(1);

        System.out.println("El valor se encuentra en la posicion: " +numeros.buscar(80));


    }
}