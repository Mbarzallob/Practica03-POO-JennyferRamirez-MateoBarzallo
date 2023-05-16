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

public class Disco {
    
    // Atributos normales de la clase Disco
    private int codigo;
    private String nombre;
    private int anioDeLanzamiento;

    // Constructor vacio de la clase
    public Disco() {
    }

    // Constructor donde se encuentran los datos de la clase Disco
    public Disco(int codigo, String nombre, int anioDeLanzamiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioDeLanzamiento = anioDeLanzamiento;
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
    // Getter y setter del Atributo anioDeLanzamiento
    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }
    public void setAnioDeLanzamiento(int anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento;
    }

    // Metodo hashCode: Metodo que compara los objetos pasados devolviendo un numero entero 
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.codigo;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + this.anioDeLanzamiento;
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
        final Disco other = (Disco) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.anioDeLanzamiento != other.anioDeLanzamiento) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    // Metodo To String
    @Override
    public String toString() {
        return "Disco{" + "codigo=" + codigo + ", nombre=" + nombre + ", anioDeLanzamiento=" + anioDeLanzamiento + '}';
    }   
}