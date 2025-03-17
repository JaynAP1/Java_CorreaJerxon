package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Funciones {

    public static void GetUsuarios(Connection conn) throws SQLException {
        String sql = "select * from usuarios";

        try(PreparedStatement Search = conn.prepareStatement(sql)){
            ResultSet Users = Search.executeQuery();

            if (Users.next()){
                System.out.println("Hay usuarios");
            }
            else {
                System.out.println("No hay usuarios");
            }
        }
    }

}
