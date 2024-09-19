public class Paciente {

    private int edad;
    private String nombre;
    private String domicilio;
    private String sexo;

    public Paciente(int edad, String nombre, String domicilio, String sexo) {
        this.edad = edad;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Paciente[ " +
                "Edad = " + edad +
                ", Nombre = '" + nombre + '\'' +
                ", Domicilio = '" + domicilio + '\'' +
                ", Sexo = '" + sexo + '\'' +
                ']'+"\n";
    }
}
