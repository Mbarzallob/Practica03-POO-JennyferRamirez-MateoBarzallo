/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cantante;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SOPORTETICS
 */
public class VistaCantante {

    private Scanner entrada;

    public VistaCantante() {
        entrada = new Scanner(System.in);
    }

    public Cantante ingresarCantante() {
        entrada.nextLine();
        //Se ingresan los datos del cantante por consola
        System.out.println("Ingresar el nombre del cantante: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingresar el apellido del cantante: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingresar la edad del cantante: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar la nacionalidad del cantante: ");
        String nacionalidad = entrada.nextLine();
        System.out.println("Ingresar el salario del cantante: ");
        double salario = entrada.nextDouble();
        System.out.println("Ingresar el codigo del cantante: ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar el nombre artistico del cantante: ");
        String nombreArtistico = entrada.nextLine();
        System.out.println("Ingresar el genero musical del cantante: ");
        String generoMusical = entrada.nextLine();
        System.out.println("Ingresar el numero de sensillos: ");
        int nSensillos = entrada.nextInt();
        System.out.println("Ingresar el numero de conciertos del cantante: ");
        int nConciertos = entrada.nextInt();
        System.out.println("Ingresar el numero de giras del cantante: ");
        int nGiras = entrada.nextInt();

        //Se crea un objeto de la Clase Cantante
        Cantante cantante = new Cantante(nombreArtistico, generoMusical, nSensillos, nConciertos, nGiras, codigo, nombre, apellido, edad, nacionalidad, salario);

        return cantante;
    }

    public Cantante actualizarCantante() {
        System.out.println("Ingrese el codigo del cantante a actualizar");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese los nuevos datos del compositor");
        System.out.println("Ingresar el nombre del cantante: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingresar el apellido del cantante: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingresar la edad del cantante: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar la nacionalidad del cantante: ");
        String nacionalidad = entrada.nextLine();
        System.out.println("Ingresar el salario del cantante: ");
        double salario = entrada.nextDouble();

        entrada.nextLine();
        System.out.println("Ingresar el nombre artistico del cantante: ");
        String nombreArtistico = entrada.nextLine();
        System.out.println("Ingresar el genero musical del cantante: ");
        String generoMusical = entrada.nextLine();
        System.out.println("Ingresar el numero de sensillos: ");
        int nSensillos = entrada.nextInt();
        System.out.println("Ingresar el numero de conciertos del cantante: ");
        int nConciertos = entrada.nextInt();
        System.out.println("Ingresar el numero de giras del cantante: ");
        int nGiras = entrada.nextInt();
        return new Cantante(nombreArtistico, generoMusical, nSensillos, nConciertos, nGiras, codigo, nombre, apellido, edad, nacionalidad, salario);
    }

    public Cantante eliminarCantante() {
        System.out.println("Ingrese el codigo del cantante a eliminar");
        int codigo = entrada.nextInt();
        return new Cantante("", "", 0, 0, 0, codigo, "", "", 0, "", 0);

    }
    public int buscarCantante(){
        System.out.println("Ingrese el codigo del cantante a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }
    
    public void verCantante(Cantante cantante){
        System.out.println("Datos del cantante"+cantante);
    }
    
    public void verCantantes(List<Cantante> cantantes){
        System.out.println("Cantantes: ");
        for(Cantante cantante: cantantes){
            System.out.println("Datos del cantante: "+ cantante);
        }
        
    }
    
    public String buscarPorDisco(){
        System.out.println("Ingrese el nombre del disco");
        String nombre = entrada.nextLine();
        return nombre;
    }
}
