package Ej1;


import Ej3.Clases.Persona;
import manejoJSON.GestionJSON;
import manejoJSON.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static com.sun.management.HotSpotDiagnosticMXBean.ThreadDumpFormat.JSON;
import static manejoJSON.GestionJSON.pasarPersonaAJson;


public class Main {
    public static void main(String[] args) {
        /*Crea una clase Persona con los siguientes atributos: nombre, edad, dni, y
        sexo. Implementa un constructor, getters y setters para los atributos.
                Ahora, implementa un método que convierta un objeto Persona a una
        representación JSON y luego guarda la representación JSON en un archivo
        llamado persona.json. Elige y utiliza una biblioteca de tu elección para la
        serialización de objetos a JSON y la escritura en archivos.
        Objetivos:
        - Convertir un objeto Java a JSON.
                - Escribir datos JSON en un archivo.*/

        //Persona p = new Persona("Juan",50,20358984,"m");
        Persona p = new Persona();
        GestionJSON.pasarPersonaAJson(p);








    }
}
