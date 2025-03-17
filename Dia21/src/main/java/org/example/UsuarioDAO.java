package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private static String URL = "jdbc:mysql://bcmcyid34czw9kzzujff-mysql.services.clever-cloud.com:3306/bcmcyid34czw9kzzujff";
    private static String USUARIO = "utxtcwuym953zyqh";
    private static String PASSWORD = "UdooEwO8mSYpDgTFbhmg";

    static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL,USUARIO,PASSWORD);
    }

    public void agregarUsuario(String user, String email){
        String sql = "insert into usuarios (nombre,email) values (?,?)";

        try(Connection conexionInterna = conectar(); PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            solicitud.setString(1,user);
            solicitud.setString(2,email);
            solicitud.executeUpdate();
            System.out.println("Ingresado correctamente");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void buscarUsuario(int id){
        String sql = "select * from usuarios where id = ?";

        try(Connection conexionInterna = conectar(); PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            solicitud.setInt(1, id);
            ResultSet usuario = solicitud.executeQuery();

            usuario.next();
            String nombre = usuario.getString("nombre");
            System.out.printf(nombre);

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static List<String> obtenerUsuarios(){
        String sql = "select * from usuarios";
        List<String> listaUsuarios = new ArrayList<>();
        try{
            Connection conexionInterna = conectar();
            PreparedStatement solicitud = conexionInterna.prepareStatement(sql);

            ResultSet resultado = solicitud.executeQuery();
            while (resultado.next()){
                listaUsuarios.add(resultado.getInt("id")+
                        " - "+resultado.getString("nombre")+" - "+
                        resultado.getString("email"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }

    public void eliminarUsuario(int id){
        String sql = "delete from usuarios where id = ?";

        try(Connection conexionInterna = conectar(); PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            solicitud.setInt(1,id);
            solicitud.executeUpdate();
            System.out.println("Persona eliminada correctamente");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void actualizarUsuario(int id,String nombre, String email){
        String sql = "update usuarios set nombre = ?, email = ? where id = ?";

        try(Connection conexionInterna = conectar(); PreparedStatement solicitud = conexionInterna.prepareStatement(sql)) {
            solicitud.setString(1,nombre);
            solicitud.setString(2,email);
            solicitud.setInt(3,id);
            if (solicitud.executeUpdate() > 0){
                System.out.println("Actualizado correctamente");
            }
            else{
                System.out.println("No se ah actualizado");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
