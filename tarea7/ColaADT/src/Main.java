//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ColaADT<Paciente> pacientesHos = new ColaADT<>();
        // perrosVet.encolar(new Perro(4, "Pit bull", "Destroyer"));
        pacientesHos.encolar(new Paciente(56, "Elizabeth Romero Garcia","Cdad. Nezahualcóyotl, Méx.","Mujer" ));
        pacientesHos.encolar(new Paciente(24, "Juan Roman Riquelme","Cdad. Nezahualcóyotl, Méx.","Hombre" ));
        pacientesHos.encolar(new Paciente(53, "Javier Gerardo Milei ","Cdad. Nezahualcóyotl, Méx.","Hombre" ));

        //Mostrar el contenido de la cola
        System.out.println(pacientesHos);

        //Mostrar al paciente que sigue sin sacarlo de la cola
        System.out.println("El primer paciente de la lista es: \n"+pacientesHos.frente());

        //Atender al siguiente paciente
        pacientesHos.desEncolar();
        System.out.println("Pacientes en la lista: \n"+pacientesHos);

        //Agregar dos nuevos pacientes
        pacientesHos.encolar(new Paciente(115, "Albus Percival Wulfric Brian Dumbledore","Hogwarts Escocia,Reino Unido","Hombre" ));
        pacientesHos.encolar(new Paciente(37, "Lionel Andrés Messi Cuccittini","Cdad. Nezahualcóyotl, Méx.","Hombre" ));
        //Mostrar el contenido de la cola
        System.out.println(pacientesHos);

        //Atender al siguiente paciente
        pacientesHos.desEncolar();
        System.out.println(pacientesHos);

    }
}