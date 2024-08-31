
public class ListaADTMain {
    public static void main(String[] args) {

        //Se agregan cinco smartphones
        SmartPhone smartPhone1 = new SmartPhone("Oppo","Reno7","azul",2022);
        SmartPhone smartPhone2 = new SmartPhone("Samsung","GalaxyS22","negro",2022);
        SmartPhone smartPhone3 = new SmartPhone("Huawei","P8","negro",2017);
        SmartPhone smartPhone4 = new SmartPhone("Motorola","Z2","dorado",2017);
        SmartPhone smartPhone5 = new SmartPhone("Xiaomi","RedMiNote10","gris",2021);

        ListaLigada<SmartPhone> smartPhonesList = new ListaLigada<>();
        smartPhonesList.insertarAlInicio(smartPhone5);
        smartPhonesList.insertarAlInicio(smartPhone4);
        smartPhonesList.insertarAlInicio(smartPhone3);
        smartPhonesList.insertarAlInicio(smartPhone2);
        smartPhonesList.insertarAlInicio(smartPhone1);

        //Imprimir lista
        System.out.println("Se imprime la lista SmartPhone");
        smartPhonesList.transversal();
        System.out.println("<------------------------------------------------------------------------------->");

        //Eliminar el de la posicion dos
        smartPhonesList.eliminar(2);
        //Imprimir lista
        System.out.println("Se elimino la posicion 2");
        smartPhonesList.transversal();
        System.out.println("<------------------------------------------------------------------------------->");


        //Actualizar el segundo elemento
        SmartPhone buscar = new SmartPhone("Samsung","GalaxyS22","negro",2022);
        SmartPhone actualizado = new SmartPhone("Iphone", "15", "blanco", 2023);
        smartPhonesList.actualizar(buscar, actualizado);
        //Imprimir lista
        System.out.println("Actualizar el segundo elemento");
        smartPhonesList.transversal();
        System.out.println("<------------------------------------------------------------------------------->");


        //Agregar elemento al inicio
        SmartPhone agreInicio = new SmartPhone("BlackBerry", "Prive", "negro", 2015);
        smartPhonesList.insertarAlInicio(agreInicio);
        //Agregar elemento al final
        SmartPhone agreFinal = new SmartPhone("Nokia", "G400", "negro", 2022);
        smartPhonesList.agregarAlFinal(agreFinal);
        //Imprimir lista
        System.out.println("Se agregaron nuevos elementos al principo y al final de la lista");
        smartPhonesList.transversal();
        System.out.println("<------------------------------------------------------------------------------->");


        //Eliminar el primer elemento
        smartPhonesList.eliminarElPrimero();
        System.out.println("Se elimino el primer elemento");
        smartPhonesList.transversal();
    }
}