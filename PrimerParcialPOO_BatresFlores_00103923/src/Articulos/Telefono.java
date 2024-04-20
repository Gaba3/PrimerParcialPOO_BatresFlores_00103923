package Articulos;

import Articulos.ArtElectronicos;
import Articulos.Precio_Descripcion;

import java.util.Scanner;

public class Telefono extends ArtElectronicos implements Precio_Descripcion {
    private String descripcion;
    private float precio;
    private int memoria;
    private int numCamaras;
    //Constructor
    //Default
    public Telefono() {
    }
    //Overloaded
    public Telefono(String nombre, String modelo, String descripcion, float precio, int memoria, int numCamaras) {
        super(nombre, modelo);
        this.descripcion = descripcion();
        this.precio =obtenerPrecio();
        this.memoria = memoria;
        this.numCamaras = numCamaras;
    }
    //Methods
    @Override
    public String descripcion(){
        Scanner sc = new Scanner(System.in);
        descripcion = sc.nextLine();
        return descripcion;
    }
    @Override
    public float obtenerPrecio() {
        Scanner sc = new Scanner(System.in);
        precio = sc.nextFloat();
        return precio;
    }

    //Getters and Setters

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getNumCamaras() {
        return numCamaras;
    }

    public void setNumCamaras(int numCamaras) {
        this.numCamaras = numCamaras;
    }
}
