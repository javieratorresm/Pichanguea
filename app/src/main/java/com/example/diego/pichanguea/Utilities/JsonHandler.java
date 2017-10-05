package com.example.diego.pichanguea.Utilities;

import android.util.Log;

import com.example.diego.pichanguea.Models.Usuario;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JsonHandler {
    /*
    public Usuario getInformacion(String datos, Usuario usuario){
        try{
            JSONObject ja = new JSONObject();
            System.out.println("lenghth"+ja.length());
            return usuario;
        }
        catch (JSONException e) {
            Log.e("ERROR", this.getClass().toString() + " " + e.toString());
        }
        return null;
    } no pescar aun!!!
    */


    /**
     * Método que recibe un JSONArray en forma de String y devuelve un String[] con los actores

     public String[] getPublicacion(String publicaciones){
     try {
     JSONArray ja = new JSONArray(publicaciones);
     String[] result = new String[ja.length()];
     String actor;
     for (int i = 0; i < ja.length(); i++) {
     JSONObject row = ja.getJSONObject(i);
     actor =row.getJSONObject("usuario").getString("nombreusuario")+" "+row.getJSONObject("usuario").getString("apellidousuario")
     +" publicó:\n"+row.getString("nombrepublicacion");
     result[i] = actor;
     }
     return result;
     } catch (JSONException e) {
     Log.e("ERROR", this.getClass().toString() + " " + e.toString());
     }
     return null;

     }

    public String[] getUsuario(String usuario) {
        try {
            JSONArray ja = new JSONArray(usuario);
            String[] result = new String[ja.length()];
            String actor;
            for (int i = 0; i < ja.length(); i++) {
                JSONObject row = ja.getJSONObject(i);
                actor = " " + row.getString("nombre") + " " + row.getString("apellido");
                result[i] = actor;
            }
            return result;
        } catch (JSONException e) {
            Log.e("ERROR", this.getClass().toString() + " " + e.toString());
        }
        return null;
    }// getActors(String actors)

    public JSONObject setUsuario(Usuario usuario) {
        // build jsonObject
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.accumulate("apellidousuario", usuario.getAPELLIDOUSUARIO());
            jsonObject.accumulate("celularusuario", usuario.getCELULARUSUARIO());
            jsonObject.accumulate("emailusuario", usuario.getEMAILUSUARIO());
            jsonObject.accumulate("nicknameusuario", usuario.getNICKNAMEUSUARIO());
            jsonObject.accumulate("nombreusuario", usuario.getNOMBREUSUARIO());
            jsonObject.accumulate("passwordusuario", usuario.getPASSWORDUSUARIO());
            return jsonObject;

        } catch (JSONException je) {
            Log.e("ERROR", this.getClass().toString() + " - " + je.getMessage());
        }
        return null;
    }



*/
}// JsonHandler