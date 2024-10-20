/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm403.zarape.core.controller;


import org.utl.dsm403.zarape.core.dao.EstadoDao;
import org.utl.dsm403.zarape.model.Estado;
import java.util.List;

public class EstadoController {
    public static List<Estado> obtenerEstados() {
        EstadoDao dao = new EstadoDao();
        return dao.obtenerTodos();
    }
}


