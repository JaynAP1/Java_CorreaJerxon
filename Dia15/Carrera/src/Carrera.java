public class Carrera extends Thread {
    static Object testigo = new Object();
    private Carrera siguiente;
    private String Nombre;

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setSiguiente(Carrera siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void run() {
        synchronized (testigo) {
            try {
                if (siguiente != null) {
                    int tiempo = (int) (Math.random() * 2000) + 9000;
                    Thread.sleep(tiempo);
                    System.out.println("Entrega en el segundo " + tiempo / 1000.0 + " y el siguiente corredor " + siguiente.getNombre() + " sale");
                    siguiente.start();
                    testigo.wait();
                } else {
                    int tiempoTerminado = (int) (Math.random() * 3000) + 9000;
                    Thread.sleep(tiempoTerminado);
                    System.out.println("El corredor " + Nombre + " Carrera terminada en: " + tiempoTerminado / 1000 + "s");
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            testigo.notify();
        }
    }

}
