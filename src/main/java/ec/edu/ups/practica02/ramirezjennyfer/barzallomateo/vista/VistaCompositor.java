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

        Compositor compositor = new Compositor(nDeComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);

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
        entrada.nextLine();
        System.out.println("Ingrese los nuevos datos");
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
        entrada.nextLine();
        System.out.println("Ingresar el numero de composiciones del compositor; ");
        int nDeComposiciones = entrada.nextInt();
        return new Compositor(nDeComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);
    }

    public int buscarCompositor() {
        System.out.println("Ingresa el codigo del compositor a buscar");
        int codigo = entrada.nextInt();
        return codigo;
    }

    public void verCompositor(Compositor compositor) {
        System.out.println("Datos del cliente" + compositor);

    }

    public void verCompositores(List<Compositor> compositores) {
        System.out.println("Compositores: ");
        for (Compositor compositor : compositores) {
            System.out.println("Datos del Compositor: " + compositor);
        }
    }
    
    public String buscarPorCancion(){
        System.out.println("Ingrese el nombre de la cancion: ");
        String nombre = entrada.nextLine();
        return nombre;
    }
}
