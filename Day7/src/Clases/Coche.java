package Clases;

public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche() {
    }

    public Coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Numero de puertas: " + numeroPuertas);
    }
}
