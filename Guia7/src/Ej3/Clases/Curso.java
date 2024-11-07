package Ej3.Clases;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    //atrib
    private String nombreCurso;
    private String codigo;
    private List<Persona> personas;

    //construc


    public Curso() {
    }

    public Curso(String codigo, String nombreCurso) {
        this.codigo = codigo;
        this.nombreCurso = nombreCurso;
        this.personas = new ArrayList<>();
    }

    //get y set

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    //metodos

    public void agregarPersonaAlCurso(Persona p) {
        personas.add(p);
    }

    public void eliminarPersonaDelCurso(Persona p){
        personas.remove(p);
    }

    public void eliminarPersonaDelCursoConDni(int dni) {
        if (!personas.isEmpty()) {
            for (int i = 0; i < personas.size(); i++) {
                Persona p = personas.get(i);
                if (p.getDni() == dni) {
                    personas.remove(p);
                }
            }
        } else {
            System.out.println("/nERROR La lista esta vacia.");
        }
    }



    @Override
    public String toString () {
        return "Curso{" +
                            "codigo='" + codigo + '\'' +
                            ", nombreCurso='" + nombreCurso + '\'' +
                            ", personas=" + personas +
                            '}';
                }

}

