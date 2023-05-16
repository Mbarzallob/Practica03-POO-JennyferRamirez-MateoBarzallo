/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo;
import java.util.Objects;
/**
 *
 * @author casa
 */

// Cuando se utiliza un metodo abstarcto en una clase toda la clase pasa a ser abstarcta como lo es en esta ocasión
public abstract class Persona {
    
    // Atributos normales de la clase Abstracta Persona
    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private double salario;

    // Constructor vacio 
    public Persona() {
    }
    
    // Constructor donde se encuentran los datos de la clase persona 
    public Persona(int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.salario = salario;
    }

    // Getter y setter: Encapsulamiento de los atributos
    // Getter y setter del Atributo código
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    // Getter y setter del Atributo nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Getter y setter del Atributo apellido
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    // Getter y setter del Atributo edad
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    // Getter y setter del Atributo nacionalidad
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    // Getter y setter del Atributo salario
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Metodo hashCode: Metodo que compara los objetos pasados devolviendo un numero entero 
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.codigo;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.apellido);
        hash = 71 * hash + this.edad;
        hash = 71 * hash + Objects.hashCode(this.nacionalidad);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
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
        final Persona other = (Persona) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.nacionalidad, other.nacionalidad);
    }
    
    // Metodo abstracto calcularSalario 
    public abstract double calcularSalario();

    // Metodo To String 
    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", salario=" + salario + '}';
    }
    
    
}