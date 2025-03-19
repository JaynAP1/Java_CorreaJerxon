
package mvc.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import mvc.Controller.Usuario;


public class Conexion {
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
            JOptionPane.showMessageDialog(null, "Persona ingresada correctamente");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    public Usuario buscarUsuario(int id){
        String sql = "select * from usuarios where id = ?";

        try(Connection conexionInterna = conectar(); PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            solicitud.setInt(1, id);
            ResultSet usuario = solicitud.executeQuery();
            usuario.next();
            int ids = usuario.getInt("id");
            String nombre = usuario.getString("nombre");
            String email = usuario.getString("email");
            return new Usuario (ids, nombre, email);

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public void eliminarUsuario(int id){
        String sql = "delete from usuarios where id = ?";

        try(Connection conexionInterna = conectar(); PreparedStatement solicitud = conexionInterna.prepareStatement(sql)){
            solicitud.setInt(1,id);
            solicitud.executeUpdate();
            JOptionPane.showMessageDialog(null, "Persona eliminada correctamente");
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
                JOptionPane.showMessageDialog(null, "Persona actualizada correctamente");
            }
            else{
                JOptionPane.showMessageDialog(null, "No se a actualizado");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
    
}
