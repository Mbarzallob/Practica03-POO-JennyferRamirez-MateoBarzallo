/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.dao;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.idao.ICantanteDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Disco;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public class CantanteDAO implements ICantanteDAO {

    private List<Cantante> listaCantantes;

    public CantanteDAO() {
        listaCantantes = new ArrayList<>();
    }

    @Override
    public void create(Cantante cantante) {

        listaCantantes.add(cantante);
    }

    @Override
    public Cantante read(int codigo) {

        for (Cantante cantante : listaCantantes) {
            if (cantante.getCodigo() == codigo) {
                return cantante;
            }

        }
        return null;
    }

    @Override
    public void update(Cantante cantante) {

        for (int i = 0; i < listaCantantes.size(); i++) {
            Cantante c = listaCantantes.get(i);
            if (c.getCodigo() == cantante.getCodigo()) {
                listaCantantes.set(i, cantante);
                break;
            }
        }
    }

    @Override
    public void delete(Cantante cantante) {

        Iterator<Cantante> it = listaCantantes.iterator();
        while (it.hasNext()) {
            Cantante c = it.next();
            if (c.getCodigo() == cantante.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cantante> findAll() {

        return listaCantantes;
    }

    @Override
    public Cantante buscarPorDisco(String valor) {
        //Se recorre la lista personas con el forEach
        for (Cantante cantante : listaCantantes) {
            //Se pregunta si la persona es de tipo Cantante

            // Se recorre la lista de discografias del cantante
            for (Disco disco : cantante.listarDiscos()) {
                if (disco.getNombre().equals(valor)) {
                    //Se retorna el cantante que tiene el disco y se imprime el nombre y el apellido
                    System.out.println(cantante.getNombre() + " " + cantante.getApellido());
                    return cantante;
                }
            }

        }
        return null;

    }

}
