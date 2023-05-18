/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.dao;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.idao.ICompositorDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cancion;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Compositor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public class CompositorDAO implements ICompositorDAO {

    List<Compositor> listaCompositores;

    public CompositorDAO() {
        listaCompositores = new ArrayList<>();
    }

    @Override
    public void create(Compositor compositor) {

        listaCompositores.add(compositor);
    }

    @Override
    public Compositor read(int codigo) {

        for (Compositor compositor : listaCompositores) {
            if (compositor.getCodigo() == codigo) {
                return compositor;
            }
        }
        return null;
    }

    @Override
    public void update(Compositor compositor) {

        for (int i = 0; i < listaCompositores.size(); i++) {
            Compositor c = listaCompositores.get(i);
            if (c.getCodigo() == compositor.getCodigo()) {
                listaCompositores.set(i, compositor);
                break;
            }
        }
    }

    @Override
    public void delete(Compositor compositor) {

        Iterator<Compositor> it = listaCompositores.iterator();
        while (it.hasNext()) {
            Compositor c = it.next();
            if (c.getCodigo() == compositor.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Compositor> findAll() {
        return listaCompositores;
    }

    @Override
    public Compositor buscarPorCancion(String valor) {
        //Se recorre la lista de personas con el forEach
        for (Compositor compositor : listaCompositores) {
            //Se pregunta si la persona es de tipo Compositor
       
                //se recorre la lista de cancionesTop100Bilboard
                for (Cancion cancion : compositor.listarCanciones()) {
                    //Se pregunta si el titulo es igual al que se ingreso como parametro
                    if (cancion.getTitulo().equals(valor)) {
                        //Se retorna el compositor y se imprime el nombre y el apellido del compositor
                        System.out.println(compositor.getNombre() + " " + compositor.getApellido());
                        return compositor;
                    }
                
            }
        }
        return null;
    }

}
