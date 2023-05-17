/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.idao.ICantanteDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista.VistaCantante;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public class ControladorCantante {
    private VistaCantante vistaCantante;
    private Cantante cantante;
    private ICantanteDAO cantanteDAO;

    public ControladorCantante(VistaCantante vistaCantante, ICantanteDAO cantanteDAO) {
        this.vistaCantante = vistaCantante;
        this.cantanteDAO = cantanteDAO;
    }

    public void registrar(){
        cantante = vistaCantante.ingresarCantante();
        cantanteDAO.create(cantante);
    }
   
    public void verCantante(){
        int codigo = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(codigo);
        vistaCantante.verCantante(cantante);
    }
    
    public void actualizar(){
        cantante = vistaCantante.actualizarCantante();
        cantanteDAO.update(cantante);
    }
    
    public void eliminar(){
        cantante= vistaCantante.eliminarCantante();
        cantanteDAO.delete(cantante);
    }
    
    
    public void verCantantes(){
        List<Cantante> cantantes;
        cantantes = cantanteDAO.findAll();
        vistaCantante.verCantantes(cantantes);
    }
}