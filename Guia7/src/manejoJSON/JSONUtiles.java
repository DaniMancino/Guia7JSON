package manejoJSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONUtiles {

    public static void grabar(JSONArray array, String archivo) {
        try {
            FileWriter file = new FileWriter(archivo);
            file.write(array.toString());
            file.flush();
            file.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }


    public static JSONTokener leer(String archivo) {
        JSONTokener tokener = null;

        try {
            tokener = new JSONTokener(new FileReader(archivo));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return tokener;
    }

    //ej1
    public static void pasarObjetoAJson(JSONObject o, String nombreArchivo){
        FileWriter file = null;
        try {
            file = new FileWriter(nombreArchivo);
            file.write(o.toString());
            file.flush();
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        }



    }





