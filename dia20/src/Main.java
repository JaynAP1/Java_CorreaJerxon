import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CrudTXT.cargarDatos();
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        boolean boleanito = true;
        while(boleanito) {
            System.out.println("""
                    =======================================
                    1).Ver datos.
                    2).Eliminar datos.
                    3).Cargar datos.
                    4).Actualizar datos.
                    5).Salir.
                    """);

            String Seleccion = sc.nextLine();
            switch(Seleccion) {
                case "1"->{
                    System.out.println("""
                            =========================
                            1).Ver objetos.
                            2).Ver personas.
                            """);
                    String Seleccion2 = sc.nextLine();
                    switch(Seleccion2) {
                        case "1"->{
                            CrudTXT.listarProducto();
                        }
                        case "2"->{
                            CrudTXT.listarPersonas();
                        }
                    }
                }
                case "2"->{
                    System.out.println("""
                            =========================
                            1).Eliminar objetos.
                            2).Elimiar personas.
                            """);
                    String Seleccion2 = sc.nextLine();

                    switch (Seleccion2){
                        case "1"->{
                            System.out.println("Ingrese el id del producto que desea eliminar");
                            int id = sc.nextInt();
                            sc.nextLine();
                            CrudTXT.eliminarProducto(id);

                        }
                        case "2"->{
                            System.out.println("Ingrese el id de la persona que desea eliminar");
                            int id = sc.nextInt();
                            sc.nextLine();
                            CrudTXT.eliminarPersona(id);
                        }
                    }

                }
                case "3"->{
                    System.out.println("""
                            =========================
                            1).Agregar objetos.
                            2).Agregar personas.
                            =========================
                            """);
                    String Seleccion2 = sc.nextLine();
                    switch (Seleccion2){
                        case "1"->{
                            System.out.println("Ingrese el id del objeto que desea agregar: ");
                            int id = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ingrese el nombre del objeto que desea agregar: ");
                            String Nombre = sc.nextLine();
                            System.out.println("Ingrese el precio del objeto que desea agregar: ");
                            double Precio = sc.nextDouble();
                            sc.nextLine();

                            CrudTXT.agregarProducto(id, Nombre, Precio);
                        }
                        case "2"->{
                            System.out.println("Ingrese el id de la persona que desea agregar: ");
                            int id = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ingrese el nombre de la persona que desea agregar: ");
                            String Nombre = sc.nextLine();
                            System.out.println("Ingrese la edad de la persona que desea agregar: ");
                            int edad = sc.nextInt();
                            sc.nextLine();

                            CrudTXT.agregarPersona(id, Nombre, edad);
                        }
                    }
                }
                case "4"->{
                    System.out.println("""
                            =========================
                            1).Actualizar objetos.
                            2).Actualizar personas.
                            =========================
                            """);
                    String Seleccion2 = sc.nextLine();
                    switch (Seleccion2){
                        case "1"->{
                            System.out.println("Ingrese el id del objeto que desea actualizar: ");
                            int id = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Ingrese el nuevo nombre del producto que desea actualizar: ");
                            String nombre = sc.nextLine();
                            System.out.println("Ingrese el nuevo precio del producto: ");
                            double precio = sc.nextDouble();
                            sc.nextLine();

                            CrudTXT.actualizarProducto(id, nombre, precio);
                        }
                        case "2"->{
                            System.out.println("Ingrese el id de la persona que desea actualizar: ");
                            int id = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Ingrese el nuevo nombre de la persona que desea actualizar: ");
                            String nombre = sc.nextLine();
                            System.out.println("Ingrese la nueva edad de la persona que desea actualizar: ");
                            int edad = sc.nextInt();
                            sc.nextLine();

                            CrudTXT.actualizarPersona(id, nombre, edad);
                        }
                    }
                }
                case "5"->{
                    boleanito = false;
                }
                default -> {

                }
            }
        }
    }
}