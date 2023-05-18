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

public class Cantante extends Persona{

    // Atributos normales de la clase Cantante
    private String nombreArtistico;
    private String generoMusical;
    private int numeroDeSencillos;
    private int numeroDeConciertos;
    private int numeroDeGiras;
    private List<Disco> discografia;

    // Constructor vacio
    public Cantante() {
        discografia = new ArrayList<>();
    }

    // Constructor donde se encuentran los datos de la clase Cantante más los atributos de la clase padre Persona
    public Cantante(String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeConciertos, int numeroDeGiras, int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeConciertos = numeroDeConciertos;
        this.numeroDeGiras = numeroDeGiras;
        discografia = new ArrayList<>();
    }

    // Getter y setter: Encapsulamiento de los atributos
    // Getter y setter del Atributo nombreArtistico
    public String getNombreArtistico() {
        return nombreArtistico;
    }
    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }
    // Getter y setter del Atributo generoMusical
    public String getGeneroMusical() {
        return generoMusical;
    }
    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
    // Getter y setter del Atributo numeroDeSencillos
    public int getNumeroDeSencillos() {
        return numeroDeSencillos;
    }
    public void setNumeroDeSencillos(int numeroDeSencillos) {
        this.numeroDeSencillos = numeroDeSencillos;
    }
    // Getter y setter del Atributo numeroDeConciertos
    public int getNumeroDeConciertos() {
        return numeroDeConciertos;
    }
    public void setNumeroDeConciertos(int numeroDeConciertos) {
        this.numeroDeConciertos = numeroDeConciertos;
    }
    // Getter y setter del Atributo numeroDeGiras
    public int getNumeroDeGiras() {
        return numeroDeGiras;
    }
    public void setNumeroDeGiras(int numeroDeGiras) {
        this.numeroDeGiras = numeroDeGiras;
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
        final Cantante other = (Cantante) obj;
        if (super.getCodigo() != other.getCodigo()) {
            return false;
        }
        return true;
    }


    // Metodo el cual agrega un disco en la clase Cantante
    public void agregarDisco(Disco disco){
        discografia.add(disco);
    }
    
    public void actualizarDisco(Disco disco){
        if(discografia.contains(disco)){
            int index = discografia.indexOf(disco);
            discografia.set(index, disco);
        }
    }
            
public void eliminarDisco(Disco disco){
    if(discografia.contains(disco)){
        int index = discografia.indexOf(disco);
        discografia.remove(index);
    }
}
    public List<Disco> listarDiscos() {
        return discografia;
    }
public Disco buscarDisco(int codigo){
    for(Disco disco: discografia){
        if(disco.getCodigo()==codigo){
            return disco;
        }
    }
    return null;
}
    
    // Metodo calcularSalario valor extra 
    @Override
    public double calcularSalario() {
        double salario =super.getSalario();
        double pagoExtra = 0;
        if(numeroDeSencillos >= 1 && numeroDeSencillos <= 10){
            pagoExtra = (salario * 5.0) / 100.0;
        } else if(numeroDeGiras >= 1 && numeroDeGiras <= 3){
            pagoExtra = (salario * 3.0) / 100.0;
        } else if(numeroDeSencillos > 10 && numeroDeGiras >3 ){
            pagoExtra = 1000;
        } else if(discografia.size() >= 5){
            pagoExtra = 2000;
        }
        return(salario + pagoExtra); 
    }
    
    // Metodo To String
    @Override
    public String toString() {
        return "Cantante{" +super.toString()+ "nombreArtistico=" + nombreArtistico + ", generoMusical=" + generoMusical + ", numeroDeSencillos=" + numeroDeSencillos + ", numeroDeConciertos=" + numeroDeConciertos + ", numeroDeGiras=" + numeroDeGiras + ", /ndiscografia=" + discografia + '}';
    }
}