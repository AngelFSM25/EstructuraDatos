//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Practicar con arboles");
        //Arbol 1
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        NodoArbol<String> raiz = new NodoArbol<>("10");
        raiz.setHijoIzquierdo(new NodoArbol<>("5"));
        raiz.getHijoIzquierdo().setHijoIzquierdo(new NodoArbol<>("1"));
        raiz.setHijoDerecho(new NodoArbol<>("15"));
        raiz.getHijoDerecho().setHijoDerecho(new NodoArbol<>("25"));
        System.out.println("Arbol 1:" + raiz);

        //Arbol 2
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        NodoArbol<String> raiz2 = new NodoArbol<>("Diego");
        raiz2.setHijoIzquierdo(new NodoArbol<>("Pedro"));
        raiz2.getHijoIzquierdo().setHijoIzquierdo(new NodoArbol<>("Susan"));
        raiz2.getHijoIzquierdo().setHijoDerecho(new NodoArbol<>("Diana"));
        raiz2.setHijoDerecho(new NodoArbol<>("Mario"));
        System.out.println("Arbol 2:" + raiz2);

    }
}