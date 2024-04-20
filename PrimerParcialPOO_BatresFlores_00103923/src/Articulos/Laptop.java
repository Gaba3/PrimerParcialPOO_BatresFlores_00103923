package Articulos;

import Articulos.ArtElectronicos;

import java.util.Scanner;

public class Laptop extends ArtElectronicos implements Precio_Descripcion {
    private String descripcion;
    private float precio;
    private int RAM;
    private String sistemaOperativo;
    //Constructor
    //Default
    public Laptop() {
    }
    //Overloaded
    public Laptop(String nombre, String modelo, String descripcion, float precio, int RAM, String sistemaOperativo) {
        super(nombre, modelo);
        this.descripcion = descripcion();
        this.precio =obtenerPrecio();
        this.RAM = RAM;
        this.sistemaOperativo = sistemaOperativo;
    }
    //Methods
    @Override
    public String descripcion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Agrege una descripcion al producto");
        descripcion = sc.nextLine();
        return descripcion;
    }
    @Override
    public float obtenerPrecio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Agrege un precio al producto");
        precio = sc.nextFloat();
        return precio;
    }
}

