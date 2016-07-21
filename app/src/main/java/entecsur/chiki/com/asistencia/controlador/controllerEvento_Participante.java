package entecsur.chiki.com.asistencia.controlador;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import entecsur.chiki.com.asistencia.FragmentEvento;
import entecsur.chiki.com.asistencia.activityPrincipal;
import entecsur.chiki.com.asistencia.bean.Evento;
import entecsur.chiki.com.asistencia.bean.Evento_Participante;
import entecsur.chiki.com.asistencia.bean.Persona;

public class controllerEvento_Participante {

    RequestQueue req;
    activityPrincipal principal;

    FragmentEvento fragEvento;

    public controllerEvento_Participante(activityPrincipal activity, FragmentEvento fragEvento){
        this.fragEvento = fragEvento;
        this.principal = activity;
        req = Volley.newRequestQueue(principal.getApplicationContext());
    }

    public Persona verificarParticipante(String dni, String evento){
        Persona per = null;
        JsonArrayRequest array = new JsonArrayRequest(Request.Method.GET,
                "http://www.json-generator.com/api/json/get/cqSDBodYEi?indent=2",
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        try {
                            if (response.length() > 0) {
                                ArrayList<Evento> events = new ArrayList<>();
                                Evento evento = null;
                                for (int i = 0; i < response.length(); i++) {
                                    JSONObject object   = response.getJSONObject(i);

                                    String idEvento     = object.getString("idEvento");
                                    String hora         = object.getString("hora");
                                    String fecha        = object.getString("fecha");
                                    String precio       = object.getString("precio");
                                    String categoria    = object.getString("categoria");
                                    String nombre       = object.getString("nombre");
                                    String ambiente     = object.getString("ambiente");

                                    evento = new Evento(idEvento, hora, fecha, precio,
                                            categoria, nombre, ambiente);
                                    System.out.println("Name: "+ evento.getNombreEvento());
                                    events.add(evento);
                                }
                                //marcarAsistencia(events);
                            }
                        } catch (Exception e) {
                            Log.d("Excepetion", e.getMessage());
                        }
                    }

                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

        req.add(array);
        return per;
    }

    public void marcarAsistencia(String id){

    }

}
