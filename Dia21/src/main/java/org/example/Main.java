package org.example;


import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        List<String> listaUsuarios = UsuarioDAO.obtenerUsuarios();
        for(String usuario : listaUsuarios){
            System.out.println(usuario);
        }




        //try (Connection conn = conexion.conectarMySQL()) {
        //            if (conn != null) {
        //                System.out.println("Conexion establecida");
        //                Funciones.GetUsuarios(conn);
        //            } else {
        //                System.out.println("No conexion");
        //            }
        //        } catch (SQLException e) {
        //            e.printStackTrace();
        //        }

    }
}