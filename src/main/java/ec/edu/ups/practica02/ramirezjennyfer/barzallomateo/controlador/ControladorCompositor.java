/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.idao.ICantanteDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.idao.ICompositorDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Compositor;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista.VistaCantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista.VistaCompositor;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public class ControladorCompositor {

    private VistaCantante vistaCantante;
    private VistaCompositor vistaCompositor;

    private Compositor compositor;
    private Cantante cantante;

    private ICompositorDAO compositorDAO;
    private ICantanteDAO cantanteDAO;

    public ControladorCompositor(VistaCantante vistaCantante, VistaCompositor vistaCompositor, ICompositorDAO compositorDAO, ICantanteDAO cantanteDAO) {
        this.vistaCantante = vistaCantante;
        this.vistaCompositor = vistaCompositor;
        this.compositorDAO = compositorDAO;
        this.cantanteDAO = cantanteDAO;
    }

    public void registrar() {
        compositor = vistaCompositor.ingresarCompositor();
        compositorDAO.create(compositor);
    }
    
    public void verCompositor(){
        int codigo = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(codigo);
        vistaCompositor.verCompositor(compositor);
    }
    
    public void actualizar(){
        compositor = vistaCompositor.actualizarCompositor();
        compositorDAO.update(compositor);
    }
    
    public void eliminar(){
        compositor = vistaCompositor.eliminarCompositor();
        compositorDAO.delete(compositor);
    }
    public void verCompositores(){
        List<Compositor> compositores;
        compositores = compositorDAO.findAll();
        vistaCompositor.verCompositores(compositores);
    }
    
    public void agregarCantante(){
        int codigo =vistaCantante.buscarCantante();
        cantante = cantanteDAO.read(codigo);
        compositor.agregarCliente(cantante);
        compositorDAO.update(compositor);
    }
}
