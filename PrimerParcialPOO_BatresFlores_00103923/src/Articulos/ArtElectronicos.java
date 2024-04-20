package Articulos;

public  abstract class ArtElectronicos {
    private String nombre;
    private String modelo;

    //Constructor
    //Default
    public ArtElectronicos() {
    }
    //Overloaded
    public ArtElectronicos(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
