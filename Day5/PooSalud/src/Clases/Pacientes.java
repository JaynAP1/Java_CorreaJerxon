package Clases;


/**
 *
 * @author Uniminuto Tibu
 */
public class Pacientes extends Persona{
    String fecha_ingreso;
    String fecha_nacimiento;
    int Hospital_asociado;
    int doctor_encargado;

    public Pacientes(int id, String nombre, String fecha_ingreso, String fecha_nacimiento, int Hospital_asociado, int doctor_encargado) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_nacimiento = fecha_nacimiento;
        this.Hospital_asociado = Hospital_asociado;
        this.doctor_encargado = doctor_encargado;
    }
    
    public void Irhospital(){
        System.out.println("La persona " + nombre + " Se dirige al hospital " + Hospital_asociado );
    }
   

}
