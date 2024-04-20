import Articulos.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<ArtElectronicos> Articulos = new ArrayList<ArtElectronicos>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            try{
                System.out.println(" ");
                System.out.println("------------------------------Sistema de inventario------------------------------");
                System.out.println("Seleccione la opcion que desea realizar: ");
                System.out.println("0. Salir");
                System.out.println("1. Agregar articulo");
                System.out.println("2. Modificar articulo");
                System.out.println("3. Consultar listado de articulos");
                opcion = sc.nextInt();
                sc.nextLine();

                if(opcion == 0){
                    System.out.println("Hatsa la proxima... ");
                    break;
                }
                switch (opcion){
                    case 1:{
                        agregarArticulo();
                        break;
                    }
                    case 2:{
                        modificarArticulo();
                        break;
                    }
                    case 3:{
                        consultarArticulos();
                        break;
                    }
                    default: {
                        System.out.println("Por favor seleccione una opcion valida.");
                        break;
                    }
                }
            }catch (Exception e){
                System.out.println("Por favor seccionar una opcion valida");
            }

        }while(opcion != 0);
    }

    private static void agregarArticulo() {
        Scanner sc = new Scanner(System.in);
        int tipo;
        System.out.println("Seleccione la clase de articulo que desea agregar: ");
        System.out.println("1. Telefono");
        System.out.println("2. Laptop");
        tipo = sc.nextInt();
        sc.nextLine();

        switch (tipo){
            case 1:{
                System.out.println("Ingrese el nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el modelo: ");
                String modelo = sc.nextLine();
                System.out.println("Agrege una descripcion");
                String descripcion = sc.nextLine();
                System.out.println("Agrege un precio");
                float precio = sc.nextFloat();
                System.out.println("Agrege la cantidad de memoria");
                int memoria = sc.nextInt();
                sc.nextLine();
                System.out.println("Agrege el numero de camaras");
                int numCamaras = sc.nextInt();
                sc.nextLine();

               Telefono telefono = new Telefono(nombre, modelo, descripcion, precio, memoria, numCamaras);

                if(Articulos.add(telefono)){
                    System.out.println("Se agrego un articulo con exito :D");
                } else System.out.println("Ocurrio un error al agregar el articulo");

                break;
            }
            case 2: {
                System.out.println("Ingrese el nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese el modelo: ");
                String modelo = sc.nextLine();
                System.out.println("Agrege una descripcion");
                String descripcion = sc.nextLine();
                System.out.println("Agrege un precio");
                float precio = sc.nextFloat();
                System.out.println("Agrege la cantidad de RAM");
                int RAM = sc.nextInt();
                sc.nextLine();
                System.out.println("Agrege el sistema operativo");
                String sistemaOperativo = sc.nextLine();

                Laptop laptop = new Laptop(nombre, modelo, descripcion, precio, RAM, sistemaOperativo);

                if(Articulos.add(laptop)){
                    System.out.println("Se agrego un articulo con exito :D");
                } else System.out.println("Ocurrio un error al agregar el articulo");

                break;
            }
            default: {
                System.out.println("Por favor seleccione una opcion valida");
                break;
            }
        }
    }

    private static void modificarArticulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el producto que quiere modificar");
        System.out.println("1. Telefono");
        System.out.println("2. Laptop");
        int tipo = sc.nextInt();
        sc.nextLine();

        switch (tipo) {
            case 1: {
                System.out.println("Ingrese el nombre del articulo");
                String nombre = sc.nextLine();

                for (int i = 0; i < Articulos.size(); i++) {
                    if (Articulos.get(i).equals(nombre)) {
                        System.out.println("Escriba un nuevo modelo");
                        String model = sc.nextLine();
                        Articulos.get(i).setModelo(model);
                    } else System.out.println("El articulo no fue encontrado");
                }
                break;
            }
            case 2: {
                System.out.println("Ingrese el nombre del articulo");
                String nombre = sc.nextLine();

                for (int i = 0; i < Articulos.size(); i++) {
                    if (Articulos.get(i).equals(nombre)) {
                        System.out.println("Escriba un nuevo nombre");
                        nombre = sc.nextLine();
                        Articulos.get(i).setNombre(nombre);
                    } else System.out.println("El articulo no fue encontrado");
                }
                break;
            }
            default: {
                System.out.println("Por favor seleccione una opcion valida");
                break;
            }

        }
    }

    private static void consultarArticulos (){
        System.out.println("Nombre | Modelo");
        for (int i = 0; i < Articulos.size(); i++){
            System.out.println(Articulos.get(i).getNombre()+" | "+Articulos.get(i).getModelo());
        }
    }
}