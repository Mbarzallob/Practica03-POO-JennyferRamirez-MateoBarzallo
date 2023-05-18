/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.idao;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cantante;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public interface ICantanteDAO {
    public void create (Cantante cantante);
    public  Cantante read(int codigo);
    public void update(Cantante cantante);
    public void delete(Cantante cantante);
    public List<Cantante> findAll();
    public Cantante buscarPorDisco(String nombre);
    
}
