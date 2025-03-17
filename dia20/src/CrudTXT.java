import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CrudTXT {
    private static String archivo = "C:\\Users\\Correa\\Documents\\Java_CorreaJerxon\\dia20\\src\\data.txt";
    private static List<Persona> personas = new ArrayList<>();
    private static List<Producto> productos = new ArrayList<>();

    public static void cargarDatos(){
        personas.clear();
        productos.clear();
        try(BufferedReader reader = new BufferedReader(new FileReader(archivo))){
            String linea;
            while ((linea=reader.readLine())!=null){

                if (linea.startsWith("P,")){
                    personas.add(Persona.fromString(linea));
                }else if (linea.startsWith("Pr,")){
                    productos.add(Producto.fromString(linea));
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void guardarDatos() {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (Persona p : personas) {
                writer.write(p.toString() + "\n");
            }
            for (Producto p : productos) {
                writer.write(p.toString() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error al guardar datos: " + e.getMessage());
        }
    }
    public static void agregarPersona(int id, String nombre, int edad) {
        personas.add(new Persona(id, nombre, edad));
        guardarDatos();
        System.out.println("Agregado con exito");
    }

    public static void agregarProducto(int id, String nombre, double precio){
        productos.add(new Producto(id, nombre, precio));
        guardarDatos();
        System.out.println("Agregado con exito");
    }
    public static void actualizarPersona(int id, String nuevoNombre, int nuevaEdad) {
        for (Persona p : personas) {
            if (p.getId() == id) {
                p.setNombre(nuevoNombre);
                p.setEdad(nuevaEdad);
                guardarDatos();
                return;
            }
        }
        System.out.println("Persona con ID " + id + " no encontrada.");
    }
    public static void actualizarProducto(int id, String nombre, double precio) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                p.setNombre(nombre);
                p.setPrecio(precio);
                guardarDatos();
                return;
            }
        }
    }

    public static void eliminarPersona(int id) {
        personas.removeIf(p -> p.getId() == id);
        guardarDatos();
        System.out.println("Eliminado con exito");
    }

    public static void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
        guardarDatos();
        System.out.println("Eliminado con exito");

    }

    public static void listarPersonas(){
        if (personas.isEmpty()){
            System.out.println("No se puede listar personas por que no hay");
        }else{
            for (Persona persona: personas){
                System.out.println(persona);
            }
        }
    }
    public static void listarProducto(){
        if (productos.isEmpty()){
            System.out.println("No se puede listar productos por que no hay");
        }else{
            for (Producto producto: productos){
                System.out.println(producto);
            }
        }
    }
}
