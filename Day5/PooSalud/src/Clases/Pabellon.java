package Clases;

public class Pabellon extends Estructura{
    int id_hospital;
    public Pabellon(int id, String nombre, int Capacidad, int id_hospital) {
        this.id = id;
        this.nombre = nombre;
        this.Capacidad = Capacidad;
        this.id_hospital = id_hospital;
    }

    @Override
    public String toString() {
        return "{" +
                "id_hospital=" + id_hospital +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Capacidad=" + Capacidad +
                '}';
    }
}
