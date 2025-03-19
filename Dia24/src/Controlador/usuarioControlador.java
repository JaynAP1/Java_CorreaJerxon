package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Vista.usuarioVista;

import java.util.Scanner;

//Controlador
//Me permite manejar los datos desde el modelo y la vista.
public class usuarioControlador {
    private static UsuarioDAO usuarioDAO;
    private usuarioVista UsuarioVista;
    private static Scanner scanner;

    public usuarioControlador(UsuarioDAO usuarioDAO, usuarioVista usuarioVista) {
        this.usuarioDAO = usuarioDAO;
        UsuarioVista = usuarioVista;
        this.scanner = scanner = new Scanner(System.in);
    }
    public static void iniciar(){
        boolean bucle = true;
        while (bucle){
            System.out.println("""
                    ==============Menu Principal=================
                    1).Crear usuario.
                    2).Eliminar.
                    3).Ver usuarios.
                    4).Actualizar.
                    5).Buscar usuario por id.
                    6).Salir.
                    =============================================
                    """);
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1 ->{
                    Usuario nuevoUsuario = usuarioVista.pedirUsuario();
                    usuarioDAO.insertar(nuevoUsuario);
                    System.out.println("Usuario agregado");
                }
                case 2 ->{
                    Usuario usarioEliminar = usuarioVista.usuarioEliminar();
                    UsuarioDAO.eliminar(usarioEliminar);
                    System.out.println("Usuario eliminado");
                }
                case 3 ->{
                    usuarioVista.mostrarUsuarios();
                }
                case 4 ->{
                    Usuario usuarioActualizar = usuarioVista.usuarioActualizar();
                    UsuarioDAO.actualizar(usuarioActualizar);
                    System.out.println("Usuario actualizado");
                }
                case 5 ->{
                    Usuario usuarioBuscarId = usuarioVista.usuarioBuscarId();
                    UsuarioDAO.buscarId(usuarioBuscarId);
                }
                case 6 ->{
                    bucle = false;
                }
            }
        }
    }
}
