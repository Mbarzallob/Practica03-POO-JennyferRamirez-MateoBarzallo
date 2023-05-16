/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
    // Getter y setter del Atributo cancionesTop100Bilboard de la listaCantante
    public List<Cancion> getCancionesTop100Bilboard() {
        return cancionesTop100Bilboard;
    }
    public void setCancionesTop100Bilboard(List<Cancion> cancionesTop100Bilboard) {
        this.cancionesTop100Bilboard = cancionesTop100Bilboard;
    }
    // Getter y setter del Atributo clientes de la listaCantante
    public List<Cantante> getClientes() {
        return clientes;
    }
    public void setClientes(List<Cantante> clientes) {
        this.clientes = clientes;
    }

    // Metodo hashCode: Metodo que compara los objetos pasados devolviendo un numero entero 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.numeroDeComposiciones;
        hash = 17 * hash + Objects.hashCode(this.cancionesTop100Bilboard);
        hash = 17 * hash + Objects.hashCode(this.clientes);
        return hash;
    }

    // Metodo equals: Metodo que permite comparar si los objetos son del mismo tipo
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Compositor other = (Compositor) obj;
        if (this.numeroDeComposiciones != other.numeroDeComposiciones) {
            return false;
        }
        if (!Objects.equals(this.cancionesTop100Bilboard, other.cancionesTop100Bilboard)) {
            return false;
        }
        return Objects.equals(this.clientes, other.clientes);
    }

    // Metodo el cual agrega una cancion en la clase Compositor
    public void agregarCancion(int codigo, String titulo, String letra, double tiempoEnMinutos){
        Cancion cancion = new Cancion(codigo, titulo, letra, tiempoEnMinutos);
        cancionesTop100Bilboard.add(cancion);
    }
    
    // Metodo el cual agrega un cantante en la clase Compositor
    public void agregarCliente(Cantante cliente){
        clientes.add( cliente);
    }
    
    // Sobrecarga del metodo calcularSalario de la clase padre Persona 
    @Override
    public double calcularSalario() {
        double salario = super.getSalario();
        double pagoExtra = 0;
        if(cancionesTop100Bilboard.size() >= 1 && cancionesTop100Bilboard.size() <= 3){
            pagoExtra = (salario * 10.0) / 100.0;
        } else if(cancionesTop100Bilboard.size() >= 4 && cancionesTop100Bilboard.size() <= 6){
            pagoExtra = (salario * 20.0) / 100.0;
        } else if(cancionesTop100Bilboard.size() > 6){
            pagoExtra = (salario * 20.0) / 100.0;
        } else if(numeroDeComposiciones > 5){
            pagoExtra = 300;
        }
        return(salario + pagoExtra);
    }

    // Metodo To String 
    @Override
    public String toString() {
        return "Compositor{" + "numeroDeComposiciones=" + numeroDeComposiciones + ", cancionesTop100Bilboard=" + cancionesTop100Bilboard + ", clientes=" + clientes + '}';
    }
}