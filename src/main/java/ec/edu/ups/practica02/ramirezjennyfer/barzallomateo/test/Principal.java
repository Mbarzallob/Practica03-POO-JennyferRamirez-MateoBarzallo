/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.test;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador.ControladorCompositor;
import java.util.Scanner;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador.ControladorPersona;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.dao.CantanteDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.dao.CompositorDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Compositor;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Persona;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista.VistaCantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista.VistaCompositor;

/**
 *
 * @author SOPORTETICS
 */
public class Principal {
    //hola 
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ControladorPersona controladorPersona = new ControladorPersona();

        VistaCompositor vistaComp = new VistaCompositor();
        VistaCantante vistaCan = new VistaCantante();

        CompositorDAO compositorDAO = new CompositorDAO();
        CantanteDAO cantanteDAO = new CantanteDAO();

        ControladorCompositor controladorCompositor = new ControladorCompositor(vistaCan, vistaComp, compositorDAO, cantanteDAO);
        ControladorCantante controladorCantante = new ControladorCantante(vistaCan, cantanteDAO);

        int opcion = 10;
        while (opcion != 7) {
            System.out.println("1. Ingreso de Cantante");
            System.out.println("2. Ingreso de Compositor");
            System.out.println("3. Agregar Clientes");
            System.out.println("4. Imprimir Persona");
            System.out.println("5. Busqueda de cantante por nombre de disco");
            System.out.println("6. Busqueda de compositor por nombre de cancion");
            System.out.println("7. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    controladorCantante.registrar();
                    break;
                case 2:
                    controladorCompositor.registrar();
                    break;

                case 3:
                    controladorCompositor.agregarCantante();
                    break;
                case 4:
                    controladorCantante.verCantantes();
                    controladorCompositor.verCompositores();
                    
                    break;
                case 5:
                    //Se pide ingresar el nombre del disco para buscarlo 
                    teclado.nextLine();
                    System.out.println("Ingresar el nombre del disco: ");
                    String valor = teclado.nextLine();
                    //Se llama al metodo buscarPorNombreDeDisco el cual recorre hasta encontrar
                    controladorPersona.buscarPorNombreDeDisco(valor);
                    break;
                case 6:
                    //Se pide ingresar el titulo de la cancion para buscarlo 
                    teclado.nextLine();
                    System.out.println("Ingresar el titulo de la cancion: ");
                    String titulo = teclado.nextLine();
                    //Se llama al metodo buscarPorTituloDeCancion el cual recorre hasta encontrar y retornarlo
                    controladorPersona.buscarPorTituloDeCancion(titulo);
                    break;
                case 7:
                    break;
                default:
                    while (opcion > 7 || opcion < 1) {
                        System.out.println("No es correcto");
                    }
            }
        }
    }
}
