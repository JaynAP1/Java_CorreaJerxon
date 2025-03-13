public class Main {

    public static void main(String[] args) {
        Carrera c1 = new Carrera();
        Carrera c2 = new Carrera();
        Carrera c3 = new Carrera();
        Carrera c4 = new Carrera();

        c1.setNombre("Jerxon");
        c2.setNombre("Luis");
        c3.setNombre("Jaime");
        c4.setNombre("Miguel");

        c1.setSiguiente(c2);
        c2.setSiguiente(c3);
        c3.setSiguiente(c4);

        System.out.println("Comienza la carrera el corredor: " + c1.getNombre());
        c1.start();

    }
}