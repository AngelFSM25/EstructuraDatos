//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ColaConPrioridadAcotada<ClienteBanco> bancoHoy = new ColaConPrioridadAcotada<>(5);

        /* No es cliente: Prioridad muy baja (5)
           Cliente nuevo: Prioridad baja (4)
           Cliente frecuente: Prioridad media (3)
           Cliente premium: Prioridad alta (2)
           Celebridades: Prioridad muy alta (1) */

        // Llegan 2 clientes nuevos
        bancoHoy.encolar(4, new ClienteBanco("Alberto", 54, 5000.0f));
        bancoHoy.encolar(4, new ClienteBanco("María", 30, 2000.0f));

        // Llegan 3 personas que no son clientes
        bancoHoy.encolar(5, new ClienteBanco("Javier", 68, 4000.0f));
        bancoHoy.encolar(5, new ClienteBanco("Sandra", 59, 8900.0f));
        bancoHoy.encolar(5, new ClienteBanco("Andrea", 25, 3200.0f));

        // Llega una celebridad
        bancoHoy.encolar(1, new ClienteBanco("Andres Manuel", 70, 25000.0f));

        // Imprime el estado de la cola con prioridad acotada
        System.out.println("La cola: " + bancoHoy);

        //Atender al siguiente cliente y realizar el retiro
        ClienteBanco clienteAtendido = atender(bancoHoy);
        if (clienteAtendido != null) {
            realizarRetiro(clienteAtendido, 10000.0f);
        }
        //Imprime el saldo actualizado del cliente atendido
        System.out.println("Cliente atendido: " + clienteAtendido.getNombre() +
                " - Saldo actual: $" + clienteAtendido.getSaldo() + "\n");

        //Llegan dos clientes más, uno frecuente y uno premium.
        bancoHoy.encolar(3, new ClienteBanco("Gabriel", 50, 3000.0f));
        bancoHoy.encolar(2, new ClienteBanco("Ximena", 30, 7600.0f));

        //Atender al siguiente cliente
        bancoHoy.desEncolar();

        // Imprime el estado de la cola con prioridad acotada
        System.out.println("La cola: " + bancoHoy);

        //Atender todos los clientes restantes.
        atenderTodos(bancoHoy);

        //Imprime el estado de la cola con prioridad acotada
        System.out.println("Cola: " + bancoHoy);

    }

    //Metodo para atender al siguiente cliente según su prioridad
    public static ClienteBanco atender(ColaConPrioridadAcotada<ClienteBanco> bancoHoy) {
        if (!bancoHoy.estaVacia()) {
            ClienteBanco cliente = bancoHoy.desEncolar();
            System.out.println("Atendiendo al cliente: " + cliente.getNombre());
            return cliente;
        } else {
            System.out.println("No hay mas clientes en la cola.");
            return null;
        }
    }

    //Metodo para realizar un retiro de saldo en la cuenta del cliente
    public static void realizarRetiro(ClienteBanco cliente, float cantidad) {
        if (cliente.getSaldo() >= cantidad) {
            cliente.setSaldo(cliente.getSaldo() - cantidad);
            System.out.println("Se retiraron $" + cantidad + " de la cuenta de " + cliente.getNombre());
        } else {
            System.out.println("No hay suficiente saldo en la cuenta de " + cliente.getNombre());
        }
    }
    //Metodo para atender a todos los clientes en la cola
    public static void atenderTodos(ColaConPrioridadAcotada<ClienteBanco> bancoHoy) {
        while (!bancoHoy.estaVacia()) {
            ClienteBanco cliente = bancoHoy.desEncolar();
            System.out.println("Atendiendo al cliente: " + cliente.getNombre());
        }
        System.out.println("No hay mas clientes en la cola.");
    }
}

