import Persistencia.PersintenciaFile;

public class Main {
    public static void main(String[] args) {
        PersintenciaFile.guardarDatos("Hola soy un mensaje");
        PersintenciaFile.leerDatos();
    }
}