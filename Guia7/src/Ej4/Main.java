package Ej4;

import Ej4.Clases.Biblioteca;
import Ej4.Clases.Libro;
import manejoJSON.GestionJSON;
import manejoJSON.JSONUtiles;

public class Main {
    public static void main(String[] args) {

       /* Crea una clase Biblioteca con atributos como nombreBiblioteca y una lista
        de libros e implementa métodos para agregar y eliminar libros.
        Guarda el estado actual de la biblioteca en un archivo biblioteca.json.
                Lee el archivo biblioteca.json, realiza cambios en la lista de libros (añade o
        elimina algunos) y guarda los cambios de nuevo en el archivo.
                Objetivos:
        - Manipular datos en JSON para actualizar información existente.
                - Leer y escribir JSON con modificaciones.*/
        Libro l1 = new Libro("La isla del tesoro");
        Libro l2 = new Libro("Harry Potter");
        Libro l3 = new Libro("Crepusculo");
        Libro l4 = new Libro("Tangaroa");
        Libro l5 = new Libro("Ella y su gato");
        Biblioteca b = new Biblioteca("BiblioMDP");
        b.agregarLibro(l1);
        b.agregarLibro(l2);
        b.agregarLibro(l3);
        b.agregarLibro(l4);
        b.agregarLibro(l5);
        //System.out.println(b);
        GestionJSON.pasarBibliotecaAJson(b, "biblioteca.json");
        b= GestionJSON.mapearBiblioteca("biblioteca.json");
        System.out.println(b);
        b.eliminarLibro(2);
        b.eliminarLibro(3);
        System.out.println(b);
       GestionJSON.pasarBibliotecaAJson(b, "biblioteca2.json");
        b= GestionJSON.mapearBiblioteca("biblioteca2.json");
        Libro l6 = new Libro("El Secreto");
        Libro l7 = new Libro("El Alquimista");
        b.agregarLibro(l6);
        b.agregarLibro(l7);
        GestionJSON.pasarBibliotecaAJson(b, "biblioteca3.json");
       // System.out.println(b);

    }
}
