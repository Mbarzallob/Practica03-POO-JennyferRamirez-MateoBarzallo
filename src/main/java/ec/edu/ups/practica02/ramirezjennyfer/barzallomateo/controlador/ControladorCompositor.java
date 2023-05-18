/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.dao.CantanteDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.dao.CompositorDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.idao.ICantanteDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.idao.ICompositorDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cancion;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Compositor;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista.VistaCancion;
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
    private VistaCancion vistaCancion;

    private Compositor compositor;
    private Cantante cantante;

    private ICompositorDAO compositorDAO;
    private ICantanteDAO cantanteDAO;

    public ControladorCompositor(VistaCantante vistaCantante, VistaCompositor vistaCompositor,VistaCancion vistaCancion, CompositorDAO compositorDAO, CantanteDAO cantanteDAO) {
        this.vistaCantante = vistaCantante;
        this.vistaCompositor = vistaCompositor;
        this.compositorDAO = compositorDAO;
        this.cantanteDAO = cantanteDAO;
        this.vistaCancion= vistaCancion;
    }

    public void registrar() {
        compositor = vistaCompositor.ingresarCompositor();
        compositor.calcularSalario();
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
        int codigoComp=vistaCompositor.buscarCompositor();
        cantante = cantanteDAO.read(codigo);
        compositor = compositorDAO.read(codigoComp);
        compositor.agregarCliente(cantante);
        compositorDAO.update(compositor);
        
        
    }
       public void ingresarCancion() {
        Cancion cancion = vistaCancion.ingresarCancion();
        int codigo = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(codigo);
        compositor.agregarCancion(cancion);
        compositorDAO.update(compositor);
    }
        public void verCancion() {
        int codigoCancion = vistaCancion.buscarCancion();
        int codigo = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(codigo);
            Cancion c = compositor.buscarCancion(codigoCancion);
        vistaCancion.verCancion(c);
    }

    public void actualizarCancion() {
        int codigo = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(codigo);
        Cancion cancion = vistaCancion.actualizarCancion();
        compositor.actualizarCnacion(cancion);
        compositorDAO.update(compositor);
    }

    public void eliminarCancion() {
        Cancion disco = vistaCancion.eliminarCancion();
        int codigo = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(codigo);
        compositor.eliminarCancion(disco);
        compositorDAO.update(compositor);
    }

    public void verCanciones() {
        List<Cancion> listaCancion;
        int codigo = vistaCompositor.buscarCompositor();
        compositor = compositorDAO.read(codigo);
        listaCancion = compositor.listarCanciones();
        vistaCancion.verCanciones(listaCancion);
    }

    public void buscarCompositorPorCancion(){
        String nombre= vistaCompositor.buscarPorCancion();
        compositor = compositorDAO.buscarPorCancion(nombre);
        vistaCompositor.verCompositor(compositor);
    }
}
