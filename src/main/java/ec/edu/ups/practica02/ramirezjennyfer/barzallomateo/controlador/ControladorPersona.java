/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cancion;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Compositor;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Disco;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author casa
 */
public class ControladorPersona implements IControlador {

    // Atributo de la clase ControladorPersona
    private List<Persona> personas;

    // Controlador de la clase ControladorPersona
    public ControladorPersona() {
        personas = new ArrayList<>();
    }

    // CRUD
    // Metodo create el cual añade un objeto el cual se le pregunta si es instancia de la clase Persona
    @Override
    public void create(Object obj) {
        if (obj instanceof Persona) {
            personas.add((Persona) obj);
        }
    }

    // Metodo read el cual para leer un objeto tipo Persona mediante el codigo
    @Override
    public Persona read(Persona obj) {
        int codigo = obj.getCodigo();
        // for each: Persona persona (se esta declarando un objeto tipo Persona), : personas (lista de Persona)
        for (Persona persona : personas) {
            // La persona obtengo el codigo si es igual se retorna un objeto persona
            if (persona.getCodigo() == codigo) {
                return persona;
            }
        }
        return null;
    }

    // Metodo update 
    @Override
    public void update(Object obj) {
        // Comparando si el objeto es una instancia de Persona
        if (obj instanceof Persona) {
            // Casting dentro de los parentesis, una vez convertida se puede obtener la cedula y se guarda en String cedula
            String nombre = ((Persona) obj).getNombre();
            // for normal: obtengo la persona de la lista
            for (int i = 0; i < personas.size(); i++) {
                // Si el objeto que le estoy pasando en este caso persona es igual al que ya tengo obtengo la cedula
                Persona persona = personas.get(i);
                // El nombre obtenido del objeto persona se compara con el metodo equals
                if (persona.getNombre().equals(nombre)) {
                    // metodo que permite incertar una persona o objeto en una posicion especifica
                    personas.set(i, (Persona) obj);
                }
                break;
            }
        }
    }

    // Metodo delete 
    @Override
    public void delete(Object obj) {
        // Se pregunta si el objeto que pase es una instancia de la clase Persona
        if (obj instanceof Persona) {
            // 
            for (int i = 0; i < personas.size(); i++) {
                // Si el objeto que le estoy pasando en este caso persona es igual al que ya tengo obtengo la cedula
                Persona persona = personas.get(i);
                // Comparar con el equals los objetos pasados
                if (persona.equals((Persona) obj)) {
                    personas.remove(i);
                }
            }
        }
    }

    public Persona buscarPorNombreDeDisco(String valor) {
        //Se recorre la lista personas con el forEach
        for (Persona persona : personas) {
            //Se pregunta si la persona es de tipo Cantante
            if (persona instanceof Cantante) {
                //Se hace un casting de persona a cantante
                Cantante cantante = (Cantante) persona;
                // Se recorre la lista de discografias del cantante
                for (Disco disco : cantante.getDiscografia()) {
                    if (disco.getNombre().equals(valor)) {
                        //Se retorna el cantante que tiene el disco y se imprime el nombre y el apellido
                        System.out.println(cantante.getNombre() + " " + cantante.getApellido());
                        return cantante;
                    }
                }
            }
        }
        return null;

    }

    public Persona buscarPorTituloDeCancion(String valor) {
        //Se recorre la lista de personas con el forEach
        for (Persona persona : personas) {
            //Se pregunta si la persona es de tipo Compositor
            if (persona instanceof Compositor) {
                //Se hace un casting de persona a compositor
                Compositor compositor = (Compositor) persona;
                //se recorre la lista de cancionesTop100Bilboard
                for (Cancion cancion : compositor.getCancionesTop100Bilboard()) {
                    //Se pregunta si el titulo es igual al que se ingreso como parametro
                    if (cancion.getTitulo().equals(valor)) {
                        //Se retorna el compositor y se imprime el nombre y el apellido del compositor
                        System.out.println(compositor.getNombre() + " " + compositor.getApellido());
                        return compositor;
                    }
                }
            }
        }
        return null;
    }

    public Persona buscarCantanteCodigo(int codigo) {
        //Se recorre la lista de personas
        for (Persona persona : personas) {
            //Se pregunta por cada persona si es una instancia de cantante
            if (persona instanceof Cantante) {
                //Se hace casting a cantante de persona
                Cantante cantanteCasting = (Cantante) persona;
                //Se verifica si el codigo de la persona es igual al codigo que se ingreso y se lo retorna
                if (cantanteCasting.getCodigo() == codigo) {
                    return persona;
                }
            }
        }
        return null;
    }

    public Persona buscarCompositorCodigo(int codigo) {
        //Se recorre la lista de personas
        for (Persona persona : personas) {
            //Se pregunta por cada persona si es una instancia de cantante
            if (persona instanceof Compositor) {
                //Se hace casting a cantante de persona
                Compositor compositorCasting = (Compositor) persona;
                //Se verifica si el codigo de la persona es igual al codigo que se ingreso y se lo retorna
                if (compositorCasting.getCodigo() == codigo) {
                    return persona;
                }
            }
        }
        return null;
    }

    // Metodo que permite imprimir
    public void imprimir() {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    // Metodo To String
    @Override
    public String toString() {
        return "ControladorPersona{" + "personas=" + personas + '}';
    }

}
