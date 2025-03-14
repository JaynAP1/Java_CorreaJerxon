

public class Main {
    public static void main(String[] args) {
        CrudTXT.cargarDatos();

        CrudTXT.listarProducto();
        CrudTXT.agregarPersona(10,"john",40);

        CrudTXT.listarPersonas();
    }
}