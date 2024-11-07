package Ej3;

import Ej3.Clases.Curso;
import Ej3.Clases.Persona;
import manejoJSON.GestionJSON;
import manejoJSON.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       /* Crea una clase Curso con atributos como nombreCurso, código, y una lista
        de Personas inscritas en el curso. Implementa métodos para agregar y
        eliminar personas del curso.
        Luego crea un método que convierta un objeto Curso a JSON y guárdalo en
        un archivo curso.json.
                Implementa otro método que lea el archivo curso.json y convierta el JSON a
        un objeto Curso.
                Objetivos:
        - Trabajar con listas de objetos y su persistencia en JSON.
                - Leer y escribir JSON que contenga una estructura compleja.*/

        /*Persona p = new Persona("Alberto",25,38954123,"m");
        Persona p1 = new Persona("Ana",22,40123789,"f");
        Persona p2 = new Persona("Dani",38,32654852,"m");
        Curso c = new Curso("c1","Pintura");
        c.agregarPersonaAlCurso(p);
        c.agregarPersonaAlCurso(p1);
        c.agregarPersonaAlCurso(p2);
        System.out.println(c);*/

        //GestionJSON.pasarCursoAArchivoJson(c ,"curso.json");
        Curso c = GestionJSON.mapearCurso("curso.json");
        System.out.println(c);




    }
}
