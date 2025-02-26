package Clases;

public class Motocicleta extends Vehiculo{
    private String tipoManubrio;

    public Motocicleta(){
    }

    public Motocicleta(String tipoManubrio){
        this.tipoManubrio = tipoManubrio;
    }

    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    public Motocicleta(String marca, String modelo, String tipoManubrio) {
        super(marca, modelo);
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tipo Manubrio: " + tipoManubrio);
    }
}
