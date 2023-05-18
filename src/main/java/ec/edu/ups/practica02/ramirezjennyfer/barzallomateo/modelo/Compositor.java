/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author casa
 */
public class Compositor extends Persona {

    // Atributos normales de la clase Compositor
    private int numeroDeComposiciones;
    private List<Cancion> cancionesTop100Bilboard;
    private List<Cantante> clientes;

    // Constructor vacio
    public Compositor() {
        cancionesTop100Bilboard = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    // Constructor donde se encuentran los datos de la clase Compositor más los atributos de la clase padre Persona
    public Compositor(int numeroDeComposiciones, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        cancionesTop100Bilboard = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    // Getter y setter: Encapsulamiento de los atributos
    // Getter y setter del Atributo numero
    public int getNumeroDeComposiciones() {
        return numeroDeComposiciones;
    }

    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }

    // Metodo hashCode: Metodo que compara los objetos pasados devolviendo un numero entero 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + super.getCodigo();
        return hash;
    }

    // Metodo equals: Metodo que permite comparar si los objetos son del mismo tipo
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compositor other = (Compositor) obj;
        if (super.getCodigo() != other.getCodigo()) {
            return false;
        }
        return true;
    }

    // Metodo el cual agrega una cancion en la clase Compositor
    public void agregarCancion(Cancion cancion) {
        
        cancionesTop100Bilboard.add(cancion);
    }

    public void actualizarCnacion(Cancion cancion){
        if(cancionesTop100Bilboard.contains(cancion)){
            int index = cancionesTop100Bilboard.indexOf(cancion);
            cancionesTop100Bilboard.set(index, cancion);
        }
    }
    
    public void eliminarCancion(Cancion cancion){
        if(cancionesTop100Bilboard.contains(cancion)){
            int index = cancionesTop100Bilboard.indexOf(cancion);
            cancionesTop100Bilboard.remove(index);
        }
    }
    public List<Cancion> listarCanciones(){
        return cancionesTop100Bilboard;
    }
    
    public Cancion buscarCancion(int codigo){
        for(Cancion cancion: cancionesTop100Bilboard){
            if(cancion.getCodigo()==codigo){
                return cancion;
            }
        }
        return null;
    }
    // Metodo el cual agrega un cantante en la clase Compositor
    public void agregarCliente(Cantante cliente) {
        clientes.add(cliente);
    }

    public void actualizarCliente(Cantante cantante) {
        if (clientes.contains(cantante)) {
            int index = clientes.indexOf(cantante);
            clientes.set(index, cantante);
        }
    }

    public void eliminarCliente(Cantante cantante) {
        if (clientes.contains(cantante)) {
            int index = clientes.indexOf(cantante);
            clientes.remove(index);
        }
    }

    public List<Cantante> listar() {
        return clientes;
    }

    public Cantante buscar(int codigo) {

        for (Cantante cantante : clientes) {
            if (cantante.getCodigo() == codigo) {
                return cantante;
            }

        }
        return null;
    }

    
    
    // Sobrecarga del metodo calcularSalario de la clase padre Persona 
    @Override
    public double calcularSalario() {
        double salario = super.getSalario();
        double pagoExtra = 0;
        if (cancionesTop100Bilboard.size() >= 1 && cancionesTop100Bilboard.size() <= 3) {
            pagoExtra = (salario * 10.0) / 100.0;
        } else if (cancionesTop100Bilboard.size() >= 4 && cancionesTop100Bilboard.size() <= 6) {
            pagoExtra = (salario * 20.0) / 100.0;
        } else if (cancionesTop100Bilboard.size() > 6) {
            pagoExtra = (salario * 20.0) / 100.0;
        } else if (numeroDeComposiciones > 5) {
            pagoExtra = 300;
        }
        return (salario + pagoExtra);
    }

    // Metodo To String 
    @Override
    public String toString() {
        return "Compositor{" +super.toString()+ "numeroDeComposiciones=" + numeroDeComposiciones + ", /ncancionesTop100Bilboard=" + cancionesTop100Bilboard + ", \nclientes=" + clientes + '}';
    }
}
