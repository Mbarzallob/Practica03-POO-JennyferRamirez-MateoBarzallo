/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.test;

import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador.ControladorCompositor;
import java.util.Scanner;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.dao.CantanteDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.dao.CompositorDAO;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista.VistaCancion;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista.VistaCantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista.VistaCompositor;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista.VistaDisco;

/**
 *
 * @author SOPORTETICS
 */
public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        VistaCompositor vistaComp = new VistaCompositor();
        VistaCantante vistaCan = new VistaCantante();
        VistaCancion vistaCancion = new VistaCancion();
        VistaDisco vistaDisco = new VistaDisco();

        CompositorDAO compositorDAO = new CompositorDAO();
        CantanteDAO cantanteDAO = new CantanteDAO();

        ControladorCompositor controladorCompositor = new ControladorCompositor(vistaCan, vistaComp, vistaCancion, compositorDAO, cantanteDAO);
        ControladorCantante controladorCantante = new ControladorCantante(vistaCan, vistaDisco, cantanteDAO);

        int opcion = 10;
        while (opcion != 5) {
            System.out.println("1.Cantante");
            System.out.println("2. Compositor");
            System.out.println("3. Disco");
            System.out.println("4. Cancion");
            System.out.println("5. Salir");

            opcion = teclado.nextInt();
            switch (opcion) {

                case 1:
                    do {
                        System.out.println("1. Registrar cantante:");
                        System.out.println("2. Ver cantante");
                        System.out.println("3. Actualizar cantante");
                        System.out.println("4. Eliminar cantante");
                        System.out.println("5. Ver cantantes");
                        System.out.println("6. Menu principal");

                        opcion = teclado.nextInt();
                        switch (opcion) {
                            case 1:
                                controladorCantante.registrar();
                                break;
                            case 2:
                                controladorCantante.verCantante();
                                break;
                            case 3:
                                controladorCantante.actualizar();
                                break;
                            case 4:
                                controladorCantante.eliminar();
                                break;
                            case 5:
                                controladorCantante.verCantantes();
                                break;
                        }
                    } while (opcion != 6);
                    break;
                case 2:
                    do {
                        System.out.println("1. Registrar compositor:");
                        System.out.println("2. Ver compositor");
                        System.out.println("3. Actualizar compositor");
                        System.out.println("4. Eliminar compositor");
                        System.out.println("5. Ver compositores");
                        System.out.println("6. Agregar cantante");
                        System.out.println("7. Menu principal");

                        opcion = teclado.nextInt();
                        switch (opcion) {
                            case 1:
                                controladorCompositor.registrar();
                                break;
                            case 2:
                                controladorCompositor.verCompositor();
                                break;
                            case 3:
                                controladorCompositor.actualizar();
                                break;
                            case 4:
                                controladorCompositor.eliminar();
                                break;
                            case 5:
                                controladorCompositor.verCompositores();
                                break;
                            case 6:
                                controladorCompositor.agregarCantante();
                        }
                    } while (opcion != 7);
                    break;
                case 3:
                    do {
                        System.out.println("1. Registrar disco");
                        System.out.println("2. Ver disco");
                        System.out.println("3. Actualizar disco");
                        System.out.println("4. Eliminar disco");
                        System.out.println("5. Ver discos de un cantante");
                        System.out.println("6. Buscar cantante por nombre del disco");
                        System.out.println("7. Menu principal");
                        opcion = teclado.nextInt();
                        switch (opcion) {
                            case 1:
                                controladorCantante.ingresarDisco();
                                break;
                            case 2:
                                controladorCantante.verDisco();
                                break;
                            case 3:
                                controladorCantante.actualizarDisco();
                                break;
                            case 4:
                                controladorCantante.eliminarDisco();
                                break;
                            case 5:
                                controladorCantante.verDiscos();
                                break;
                            case 6:
                                controladorCantante.buscarCantantePorDisco();
                                break;
                        }
                    } while (opcion != 7);
                    break;
                case 4:
                    do {
                        System.out.println("1. Registrar cancion");
                        System.out.println("2. Ver cancion");
                        System.out.println("3. Actualizar cancion");
                        System.out.println("4. Eliminar cancion");
                        System.out.println("5. Ver canciones de un compositor");
                        System.out.println("6. Buscar compositor por nombre de la cancion");
                        System.out.println("7. Menu principal");
                        opcion = teclado.nextInt();
                        switch (opcion) {
                            case 1:
                                controladorCompositor.ingresarCancion();
                                break;
                            case 2:
                                controladorCompositor.verCancion();
                                break;
                            case 3:
                                controladorCompositor.actualizarCancion();
                                break;
                            case 4:
                                controladorCompositor.eliminarCancion();
                                break;
                            case 5:
                                controladorCompositor.verCanciones();
                                break;
                            case 6:
                                controladorCompositor.buscarCompositorPorCancion();
                                break;
                        }
                    } while (opcion != 7);
                    break;
                case 5:
                    System.out.println("Salio del programa :)");
                    break;
            }
        }
        
    }
}
