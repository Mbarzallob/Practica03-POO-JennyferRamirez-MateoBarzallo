/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.vista;

import java.util.Scanner;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.controlador.ControladorPersona;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Compositor;
import ec.edu.ups.practica02.ramirezjennyfer.barzallomateo.modelo.Persona;

/**
 *
 * @author SOPORTETICS
 */
public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //Creacion del controlador persona
        ControladorPersona controladorPersona = new ControladorPersona();
        // Implementación del menu en el cual se puede acceder a los comandos propuestos

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
                    //Salto de linea
                    teclado.nextLine();
                    //Se ingresan los datos del cantante por consola
                    System.out.println("Ingresar el nombre del cantante: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingresar el apellido del cantante: ");
                    String apellido = teclado.nextLine();
                    System.out.println("Ingresar la edad del cantante: ");
                    int edad = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresar la nacionalidad del cantante: ");
                    String nacionalidad = teclado.nextLine();
                    System.out.println("Ingresar el salario del cantante: ");
                    double salario = Double.parseDouble(teclado.nextLine());
                    System.out.println("Ingresar el codigo del cantante: ");
                    int codigo = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresar el nombre artistico del cantante: ");
                    String nombreArtistico = teclado.nextLine();
                    System.out.println("Ingresar el genero musical del cantante: ");
                    String generoMusical = teclado.nextLine();
                    System.out.println("Ingresar el numero de sensillos: ");
                    int nSensillos = teclado.nextInt();
                    System.out.println("Ingresar el numero de conciertos del cantante: ");
                    int nConciertos = teclado.nextInt();
                    System.out.println("Ingresar el numero de giras del cantante: ");
                    int nGiras = teclado.nextInt();

                    //Se crea un objeto de la Clase Cantante
                    Cantante cantante = new Cantante(nombreArtistico, generoMusical, nSensillos, nConciertos, nGiras, codigo, nombre, apellido, edad, nacionalidad, salario);
                    System.out.println("Ingrese el numero de discos del cantante: ");
                    //Se ingresa un numero por consola para ingresar una cantidad de discos con el bucle For
                    int cantidad = teclado.nextInt();
                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("Ingresar el codigo del disco: ");
                        int codigoCantante = teclado.nextInt();
                        System.out.println("Ingresar el año de lanzamiento:");
                        int anioDeLanzamiento = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingresar el nombre del disco: ");
                        String nombreCancion = teclado.nextLine();
                        cantante.agregarDisco(codigoCantante, nombreCancion, anioDeLanzamiento);
                    }

                    cantante.calcularSalario();
                    //Se ingresa dentro de la lista "personas" al cantante
                    controladorPersona.create(cantante);
                    break;
                case 2:
                    teclado.nextLine();
                    //Ingresar los datos del compositor por consola
                    System.out.println("Ingresar el nombre del compositor: ");
                    nombre = teclado.nextLine();
                    System.out.println("Ingresar el apellido del compositor: ");
                    apellido = teclado.nextLine();
                    System.out.println("Ingresar la edad del compositor: ");
                    edad = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresar la nacionalidad del compositor: ");
                    nacionalidad = teclado.nextLine();
                    System.out.println("Ingresar el salario del compositor: ");
                    salario = teclado.nextDouble();
                    System.out.println("Ingresar el codigo del compositor: ");
                    codigo = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresat el numero de composiciones del compositor; ");
                    int nDeComposiciones = teclado.nextInt();

                    //Se crea un objeto de la clase Compositor
                    Compositor compositor = new Compositor(nDeComposiciones, codigo, nombre, apellido, edad, nacionalidad, salario);

                    //Se pregunta cuantas canciones tiene el compositor
                    System.out.println("Ingresar las cantidades de canciones del compositor: ");
                    cantidad = teclado.nextInt();
                    teclado.nextLine();

                    for (int i = 0; i < cantidad; i++) {

                        System.out.println("Ingresar el codigo de la cancion: ");
                        int codigoCompositor = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Ingresar el titulo de la cancion: ");
                        String titulo = teclado.nextLine();
                        System.out.println("Ingresar la la letra de la canciom: ");
                        String letra = teclado.nextLine();
                        System.out.println("Ingresar el tiempo de duracion de la cancion: ");
                        double tiempoEnMinutos = Double.parseDouble(teclado.nextLine());
                        //Se agrega el objeto tipo cancion al compositor
                        compositor.agregarCancion(codigoCompositor, titulo, letra, tiempoEnMinutos);
                    }
                    //Se agrago el compositor a la lista de personas
                    controladorPersona.create(compositor);
                    break;
                case 3:

                    teclado.nextLine();
                    //Se pregunta el codigo del cantante para agragarlo al compositor
                    System.out.println("Ingresar el codigo del cantante a agregar: ");
                    codigo = teclado.nextInt();

                    //Se llama al metodo de buscarCantanteCodigo del controladorPersona el cual busca al cantante dentro de la lista y retornarlo
                    Cantante cantanteCast = (Cantante) controladorPersona.buscarCantanteCodigo(codigo);
                    //Se pide ingresar el codigo del compositor al cual se quiera agregar
                    System.out.println("Ingresar el codigo del compositor al cual se quiere agregar: ");
                    codigo = teclado.nextInt();

                    Compositor compositorCast = (Compositor) controladorPersona.buscarCompositorCodigo(codigo);
                    //Se usa el if para comprobar que el compositorCasting sea una instancia de Persona y se agrega el cantante
                    if (compositorCast instanceof Persona) {
                        compositorCast.agregarCliente(cantanteCast);
                    }
                    break;
                case 4:
                    //Es el metodo por el cual se imprime a las personas
                    controladorPersona.imprimir();
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
