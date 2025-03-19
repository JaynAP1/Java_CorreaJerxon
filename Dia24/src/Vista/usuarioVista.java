package Vista;

import Modelo.Usuario;
import Modelo.UsuarioDAO;

import java.util.List;
import java.util.Scanner;

public class usuarioVista {
    public void mostrarUsuarios(List<Usuario> usuario){
        System.out.println("Lista de usuarios");
        for (Usuario u : usuario){
            System.out.println(u);
        }
    }
    public static Usuario pedirUsuario(){
        System.out.println("Datos para nuevo usuario");
        System.out.println("Nombre:");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        return new Usuario(nombre,email);
    }

    public static Usuario usuarioEliminar(){
        System.out.println("Ingres el id del usuario a eliminar");
        System.out.println("ID:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        return new Usuario(id);
    }
    public static Usuario usuarioActualizar(){
        System.out.println("Datos para actualizar usuario");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el id del usuario actualizar:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        return new Usuario(id,nombre,email);
    }
    public static Usuario usuarioBuscarId(){
        System.out.println("Ingres el id del usuario a eliminar");
        System.out.println("ID:");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        return new Usuario(id);
    }
    public static void mostrarUsuarios(){
        List<String> listaUsuarios = UsuarioDAO.mostrar();
        for(String usuario : listaUsuarios){
            System.out.println(usuario);
        }
    }
}
