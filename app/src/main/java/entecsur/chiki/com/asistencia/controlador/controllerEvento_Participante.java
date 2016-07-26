package entecsur.chiki.com.asistencia.controlador;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import entecsur.chiki.com.asistencia.FragmentEvento;
import entecsur.chiki.com.asistencia.activityPrincipal;
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

        JsonObjectRequest objeto = new JsonObjectRequest(Request.Method.GET,
                "http://www.json-generator.com/api/json/get/cqSDBodYEi?indent=2",
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        if(response!=null){
                            try {
                                String nombre = response.getString("nombre");
                            } catch (JSONException e) {
                                Log.d("Error Verificacion: ",e.getMessage());
                            }
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        req.add(objeto);
        return per;
    }

    public void marcarAsistencia(String id){

    }

}
