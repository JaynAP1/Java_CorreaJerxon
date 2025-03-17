package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public String database = "bcmcyid34czw9kzzujff";
    public String hostname = "bcmcyid34czw9kzzujff-mysql.services.clever-cloud.com";
    public String port = "3306";
    public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";
    public String username = "utxtcwuym953zyqh";
    public String password = "UdooEwO8mSYpDgTFbhmg";

    public Connection conectarMySQL() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }


}