public class ClienteBanco {

    private String nombre;
    private int edad;
    private float saldo;

    public ClienteBanco(String nombre, int edad, float saldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad debe ser mayor o igual a 18 años");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
    }

    @Override
    public String toString() {
        return "Cliente Banco " +
                "{Nombre ='" + nombre + '\'' +
                ", Edad = " + edad +
                ", Saldo = " + saldo +
                '}' + "\n";
    }
}
