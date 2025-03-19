package Modelo;

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

    public void insertar(Usuario nuevoUsuario) {
        String sql = "insert into usuarios (nombre,email) values (?,?)";

        try(Connection conexionInterna = conectar(); PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            solicitud.setString(1, nuevoUsuario.getNombre());
            solicitud.setString(2, nuevoUsuario.getEmail());
            solicitud.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void eliminar(Usuario usuarioEliminar){
        String sql = "delete from usuarios where id = ?";

        try(Connection conexionInterna = conectar(); PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            solicitud.setInt(1,usuarioEliminar.getId());
            solicitud.executeUpdate();
            System.out.println("Persona eliminada correctamente");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void actualizar(Usuario usuarioActualizar){
        String sql = "update usuarios set nombre = ?, email = ? where id = ?";

        try(Connection conexionInterna = conectar(); PreparedStatement solicitud = conexionInterna.prepareStatement(sql)) {
            solicitud.setString(1,usuarioActualizar.getNombre());
            solicitud.setString(2,usuarioActualizar.getEmail());
            solicitud.setInt(3,usuarioActualizar.getId());
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
    public static void buscarId(Usuario usuarioBuscarId){
        String sql = "select * from usuarios where id = ?";

        try(Connection conexionInterna = conectar(); PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            solicitud.setInt(1, usuarioBuscarId.getId());
            ResultSet usuario = solicitud.executeQuery();

            usuario.next();
            int id = usuario.getInt("id");
            String nombre = usuario.getString("nombre");
            String email = usuario.getString("email");
            System.out.printf(id +" - "+ nombre + " - "+ email);

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static List<String> mostrar(){
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
}
