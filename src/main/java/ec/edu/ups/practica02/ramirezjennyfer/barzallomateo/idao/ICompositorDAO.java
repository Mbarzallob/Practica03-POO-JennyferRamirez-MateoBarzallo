/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.idao;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Compositor;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public interface ICompositorDAO {
    public void create(Compositor compositor);
    public Compositor read(int codigo);
    public void update(Compositor compositor);
    public void delete(Compositor compositor);
    public List<Compositor> findAll();
}
