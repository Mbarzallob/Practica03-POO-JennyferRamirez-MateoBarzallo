/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cancion;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SOPORTETICS
 */
public class VistaCancion {

    Scanner entrada;

    public VistaCancion() {
        entrada = new Scanner(System.in);
    }

    public Cancion ingresarCancion() {
        System.out.println("Ingrese los datos de la cancion");

        System.out.println("Ingresar el codigo de la cancion: ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar el titulo de la cancion: ");
        String titulo = entrada.nextLine();
        System.out.println("Ingresar la letra de la canciom: ");
        String letra = entrada.nextLine();
        System.out.println("Ingresar el tiempo de duracion de la cancion: ");
        double tiempoEnMinutos = entrada.nextDouble();
        return new Cancion(codigo, titulo, letra, tiempoEnMinutos);

    }

    public Cancion actualizarCancion() {
        System.out.println("Ingrese el codigo de la cancion para actualizar ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar el titulo de la cancion: ");
        String titulo = entrada.nextLine();
        System.out.println("Ingresar la letra de la canciom: ");
        String letra = entrada.nextLine();
        System.out.println("Ingresar el tiempo de duracion de la cancion: ");
        double tiempoEnMinutos = entrada.nextDouble();
        return new Cancion(codigo, titulo, letra, tiempoEnMinutos);
    }
    
    public Cancion eliminarCancion(){
        System.out.println("Ingrese el codigo de la cancion a eliminar");
        int codigo = entrada.nextInt();
        return new Cancion(codigo,null,null,0);
    }
    
    public int buscarCancion(){
        System.out.println("Ingrese el codigo de la cancion a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }
    
    public void verCancion(Cancion cancion){
        System.out.println("Datos de la cancion: "+ cancion);
    }
    
    public void verCanciones(List<Cancion> canciones){
        for(Cancion cancion: canciones){
            System.out.println("Datos de la cancion: "+cancion);
        }
    }
}
