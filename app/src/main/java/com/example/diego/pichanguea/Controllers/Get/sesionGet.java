package com.example.diego.pichanguea.Controllers.Get;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.example.diego.pichanguea.Activities.LoginActivity;

import com.example.diego.pichanguea.Utilities.SSLTrust;
import com.example.diego.pichanguea.Utilities.JsonHandler;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class sesionGet extends AsyncTask<String, Void, String>  {
<<<<<<< HEAD
    //private SSLTrust sT;
=======
    private SSLTrust sT;
>>>>>>> a75492894cc37063a274fa55bc57dc6c5cdf9df0
    private LoginActivity login_activity;
    Toast toast;
    public sesionGet(LoginActivity login_activity){
        this.login_activity=login_activity;
    }
    @Override
    protected String doInBackground(String...url) {
        try {
            URL u = new URL(url[0]);
            //sT.trustEveryone(); //necesario para conexión ssl
            HttpURLConnection connection = (HttpURLConnection) u.openConnection();
            connection.setReadTimeout(10000);
            connection.setConnectTimeout(10000);
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
<<<<<<< HEAD
            System.out.println("aca llegue");
            connection.connect();

            return new Scanner(connection.getInputStream(), "UTF-8").useDelimiter("\\A").next();

=======
            connection.connect();
            return new Scanner(connection.getInputStream(), "UTF-8").useDelimiter("\\A").next();
>>>>>>> a75492894cc37063a274fa55bc57dc6c5cdf9df0
        } catch (MalformedURLException e) {
            Log.e("ERROR", this.getClass().toString() + " " + e.toString());
        } catch (ProtocolException e) {
            Log.e("ERROR", this.getClass().toString() + " " + e.toString());
        } catch (IOException e) {
            Log.e("ERROR", this.getClass().toString() + " " + e.toString());
        }
        return null;
    }// doInBackground(String... urls)
    protected void onPostExecute(String result) {
<<<<<<< HEAD

        System.out.println(result);
        //JsonHandler jh= new JsonHandler();

=======
        //System.out.println(result);
        JsonHandler jh= new JsonHandler();
        //String[] comentarios=jh.getComentarios(result);
>>>>>>> a75492894cc37063a274fa55bc57dc6c5cdf9df0
        login_activity.logear(result);
    }
}
