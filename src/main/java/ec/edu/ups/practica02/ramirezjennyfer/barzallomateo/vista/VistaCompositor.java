/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Compositor;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SOPORTETICS
 */
public class VistaCompositor {

    private Scanner entrada;

    public VistaCompositor() {
        entrada = new Scanner(System.in);
    }

    public Compositor ingresarCompositor() {
        System.out.println("Ingresar el nombre del compositor: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingresar el apellido del compositor: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingresar la edad del compositor: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar la nacionalidad del compositor: ");
        String nacionalidad = entrada.nextLine();
        System.out.println("Ingresar el salario del compositor: ");
        double salario = entrada.nextDouble();
        System.out.println("Ingresar el codigo del compositor: ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresat el numero de composiciones del compositor; ");
        int nDeComposiciones = entrada.nextInt();

        //Se crea un objeto de la clase Compositor
        Compositor compositor = new Compositor(nDeComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);

        //Se pregunta cuantas canciones tiene el compositor
        System.out.println("Ingresar las cantidades de canciones del compositor: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < cantidad; i++) {

            System.out.println("Ingresar el codigo de la cancion: ");
            int codigoCompositor = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingresar el titulo de la cancion: ");
            String titulo = entrada.nextLine();
            System.out.println("Ingresar la la letra de la canciom: ");
            String letra = entrada.nextLine();
            System.out.println("Ingresar el tiempo de duracion de la cancion: ");
            double tiempoEnMinutos = Double.parseDouble(entrada.nextLine());
            //Se agrega el objeto tipo cancion al compositor
            compositor.agregarCancion(codigoCompositor, titulo, letra, tiempoEnMinutos);
        }
        //Se agrago el compositor a la lista de personas
        return compositor;
    }

    public Compositor eliminarCompositor() {
        System.out.println("Ingresa el codigo del compositor");
        int codigo = entrada.nextInt();
        return new Compositor(0, codigo, "", "", 0, "", 0);
    }

    public Compositor actualizarCompositor() {
        System.out.println("Ingrese el codigo del compositor");
        int codigo = entrada.nextInt();
        System.out.println("Ingrese los nuevos datos");
        String nombre = entrada.nextLine();
        System.out.println("Ingresar el apellido del compositor: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingresar la edad del compositor: ");
        int edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar la nacionalidad del compositor: ");
        String nacionalidad = entrada.nextLine();
        System.out.println("Ingresar el salario del compositor: ");
        double salario = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingresar el numero de composiciones del compositor; ");
        int nDeComposiciones = entrada.nextInt();
        return new Compositor(nDeComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);
    }
    
    public int buscarCompositor(){
        System.out.println("Ingresa el codigo del compositor a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }
    
    public void verCompositor(Compositor compositor){
        System.out.println("Datos del cliente"+compositor);
        
    }
    
    public void verCompositores(List<Compositor> compositores){
        System.out.println("Compositores: ");
           for(Compositor compositor: compositores){
               System.out.println("Datos del Compositor: "+compositor);
           }
    }
}
