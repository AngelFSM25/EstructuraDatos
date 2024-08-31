
public class SmartPhone {
    private String marca;
    private String modelo;
    private String color;
    private int año;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String color, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        SmartPhone that = (SmartPhone) obj;

        return año == that.año &&
                marca.equals(that.marca) &&
                color.equals(that.color) &&
                modelo.equals(that.modelo);
    }

    @Override
    public String toString() {
        return "SmartPhone[" +
                "marca ='" + marca + '\'' +
                ", modelo ='" + modelo + '\'' +
                ", color ='" + color + '\'' +
                ", año = " + año +
                ']';
    }
}
