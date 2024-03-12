package com.example;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONException;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        try {
            // Lee el contenido del archivo JSON
            String jsonString = new String(Files.readAllBytes(Paths.get("C:\\Users\\pra_msanchezs\\Desktop\\data.json")));
            
            // Parsea el JSON
            JSONObject jsonObject = new JSONObject(jsonString);
            
            // Obtiene las claves y las imprime
            for (String key : jsonObject.keySet()) {
                System.out.println("Clave: " + key);
            }
        } catch (JSONException e) {
            System.err.println("Error al parsear el JSON: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al leer el archivo JSON: " + e.getMessage());
        }
    }
}