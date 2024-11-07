package Ej4.Clases;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombreBiblioteca;
    private List<Libro> libros;

    public Biblioteca() {
    }

    public Biblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libros = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    //metodos


    @Override
    public String toString() {
        return "Biblioteca{" +
                "nombreBiblioteca='" + nombreBiblioteca + '\'' +
                ", libros=" + libros +
                '}';
    }

    public void agregarLibro(Libro l){
        libros.add(l);
    }

    public void eliminarLibro(int i){libros.remove(i);
    }
}
