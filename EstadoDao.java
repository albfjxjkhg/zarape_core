/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm403.zarape.core.dao;

import org.utl.dsm403.zarape.model.Estado;
import org.utl.dsm403.zarape.core.bd.conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstadoDao {
    public List<Estado> obtenerTodos() {
        List<Estado> estados = new ArrayList<>();
        try (Connection conn = conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, nombre FROM estados")) {
            while (rs.next()) {
                Estado estado = new Estado(rs.getInt("id"), rs.getString("nombre"));
                estados.add(estado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estados;
    }
}
