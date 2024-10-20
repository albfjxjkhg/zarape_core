/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm403.zarape.core.bd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion{
    private static Connection connection = null;

    // Bloque estático para inicializar el driver
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // Aquí se podría mejorar la gestión de errores
        }
    }

    // Constructor privado para prevenir la instanciación
    private conexion() {
    }

    // Método público estático para obtener la instancia de conexión
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            String url = "jdbc:mysql://localhost:3306/zarapeaw?useSSL=false&useUnicode=true&characterEncoding=utf-8";
            String user = "usuario";
            String password = " Legalizenla123";
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }
}


