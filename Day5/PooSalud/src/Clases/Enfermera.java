package Clases;

public class Enfermera extends Persona {
    String Fecha_vinculacion;

    public Enfermera(int id, String nombre, String fecha_vinculacion) {
        this.id = id;
        this.nombre = nombre;
        Fecha_vinculacion = fecha_vinculacion;
    }

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", Fecha_vinculacion='" + Fecha_vinculacion + '\'' +
                '}';
    }
}
