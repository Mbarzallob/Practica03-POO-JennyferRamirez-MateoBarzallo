/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Disco;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SOPORTETICS
 */
public class VistaDisco {

    private Scanner entrada;

    public VistaDisco() {
        entrada = new Scanner(System.in);
    }

    public Disco ingresarDisco() {
        System.out.println("Ingresar el codigo del disco: ");
        int codigo = entrada.nextInt();
        System.out.println("Ingresar el año de lanzamiento:");
        int anioDeLanzamiento = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar el nombre del disco: ");
        String nombreCancion = entrada.nextLine();
        return new Disco(codigo, nombreCancion, anioDeLanzamiento);
    }

    public Disco actualizarDisco() {
        System.out.println("Ingresar el codigo del disco para actualizar: ");
        int codigo = entrada.nextInt();
        System.out.println("Ingresar el año de lanzamiento:");
        int anioDeLanzamiento = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar el nombre del disco: ");
        String nombreCancion = entrada.nextLine();
        return new Disco(codigo, nombreCancion, anioDeLanzamiento);
    }

    public Disco eliminarDisco() {
        System.out.println("Ingresar el codigo del disco para eliminar: ");
        int codigo = entrada.nextInt();

        return new Disco(codigo, null, 0);
    }

    public int buscarDisco() {
        System.out.println("Ingrese el codigo del disco a buscar: ");
        int codigo = entrada.nextInt();
        return codigo;
    }

    public void verDisco(Disco disco) {
        System.out.println("Datos del disco: " + disco);
    }

    public void verDiscos(List<Disco> discos) {
        for (Disco disco : discos) {
            System.out.println("Datos del disco: " + disco);
        }
    }
}
