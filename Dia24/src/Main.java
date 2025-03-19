import Controlador.usuarioControlador;
import Modelo.UsuarioDAO;
import Vista.usuarioVista;

public class Main {
    public static void main(String[] args) {
        usuarioVista usuarioVista = new usuarioVista();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioControlador UsuarioControlador = new usuarioControlador(usuarioDAO, usuarioVista);

        usuarioControlador.iniciar();

    }
}