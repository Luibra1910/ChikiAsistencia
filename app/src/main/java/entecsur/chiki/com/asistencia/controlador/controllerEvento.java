package entecsur.chiki.com.asistencia.controlador;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import entecsur.chiki.com.asistencia.activityPrincipal;
import entecsur.chiki.com.asistencia.bean.Evento;

public class controllerEvento {

    static RequestQueue req;
    activityPrincipal principal;

    public void setRequest(activityPrincipal activity) {
        this.principal = activity;
        req = Volley.newRequestQueue(principal.getApplicationContext());
    }

    /*
    public static ArrayList<Evento> getAllEvent() {
        ArrayList<Evento> listEvento = new ArrayList<>();

        JsonObjectRequest jsonOb = new JsonObjectRequest(Request.Method.GET,
                "http://www.json-generator.com/api/json/get/bVeWSAAnuG?indent=2",
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("evento");
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject objetoEvento = jsonArray.getJSONObject(i);

                                String nombre = objetoEvento.getString("nombre");
                                System.out.println("Nombre "+i+": "+nombre);
                            }
                        } catch (Exception e) {
                            Log.e("VOLLEY", "ERROR: " + e);
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );
        req.add(jsonOb);


        return listEvento;
    }*/

    public static ArrayList<String> getAllString() {
        final ArrayList<String> listEvento = new ArrayList<>();

        JsonObjectRequest jsonOb = new JsonObjectRequest(Request.Method.GET,
                "http://www.json-generator.com/api/json/get/cgcfNqBXdu?indent=2",
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("evento");
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject objetoEvento = jsonArray.getJSONObject(i);

                                String nombre = objetoEvento.getString("nombre");
                                listEvento.add(nombre);
                                System.out.println("Nombre "+i+": "+nombre);
                            }
                        } catch (Exception e) {
                            Log.e("VOLLEY", "ERROR: " + e);
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );
        req.add(jsonOb);
        return listEvento;
    }
}