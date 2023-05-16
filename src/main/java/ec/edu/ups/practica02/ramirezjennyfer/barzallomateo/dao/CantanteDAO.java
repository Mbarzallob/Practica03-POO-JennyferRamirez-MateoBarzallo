/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.dao;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.idao.ICantanteDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cantante;
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

        for (int i = 0; i<listaCantantes.size();i++){
            Cantante c =listaCantantes.get(i);
            if(c.getCodigo()==cantante.getCodigo()){
                listaCantantes.set(i, cantante);
                break;
            }
        }
    }

    @Override
    public void delete(Cantante cantante) {

        Iterator<Cantante> it= listaCantantes.iterator();
        while( it.hasNext()){
            Cantante c = it.next();
            if(c.getCodigo()==cantante.getCodigo()){
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cantante> findAll() {

        return listaCantantes;
    }

    
    
}
