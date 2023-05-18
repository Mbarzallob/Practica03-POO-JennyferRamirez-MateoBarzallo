/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.dao.CantanteDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.idao.ICantanteDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Disco;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista.VistaCantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista.VistaDisco;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public class ControladorCantante {
    private VistaCantante vistaCantante;
    private VistaDisco vistaDisco;
    private Cantante cantante;
    private ICantanteDAO cantanteDAO;

    public ControladorCantante(VistaCantante vistaCantante,VistaDisco vistaDisco, CantanteDAO cantanteDAO) {
        this.vistaCantante = vistaCantante;
        this.cantanteDAO = cantanteDAO;
        this.vistaDisco = vistaDisco;
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
    
       public void ingresarDisco(){
        Disco disco = vistaDisco.ingresarDisco();
        int codigo = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(codigo);
        cantante.agregarDisco(disco);
        cantanteDAO.update(cantante);
    }
    
    public void verDisco(){
        int codigoDisco = vistaDisco.buscarDisco();
        int codigo = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(codigo);
        Disco disco = cantante.buscarDisco(codigoDisco);
        vistaDisco.verDisco(disco);
    }
    
    public void actualizarDisco(){
        int codigo = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(codigo);
        Disco disco = vistaDisco.actualizarDisco();
        cantante.actualizarDisco(disco);
        cantanteDAO.update(cantante);
    }
    
    public void eliminarDisco(){
        Disco disco = vistaDisco.eliminarDisco();
        int codigo = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(codigo);
        cantante.eliminarDisco(disco);
        cantanteDAO.update(cantante);
    }
    
    public void verDiscos(){
        List <Disco> discografia;
        int codigo = vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(codigo);
        discografia =cantante.listarDiscos();
        vistaDisco.verDiscos(discografia);
    }
    
    
    public void buscarCantantePorDisco(){
        String nombre = vistaCantante.buscarPorDisco();
        cantante = cantanteDAO.buscarPorDisco(nombre);
        vistaCantante.verCantante(cantante);
    }

}