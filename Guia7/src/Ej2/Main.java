package Ej2;

import Ej2.Clases.Persona;
import manejoJSON.GestionJSON;
import manejoJSON.JSONUtiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
       /* Utiliza la clase Persona del ejercicio anterior. Lee el archivo persona.json que
        creaste y convierte el JSON leído de nuevo a un objeto Persona.
        Objetivos:
        - Leer datos JSON desde un archivo.
                - Convertir JSON a un objeto Java.*/

Persona p = GestionJSON.ArchivoJsonAPersona("persona.json");



    }
}
