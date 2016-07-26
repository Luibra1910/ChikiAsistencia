package entecsur.chiki.com.asistencia;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import entecsur.chiki.com.asistencia.bean.Evento;
import entecsur.chiki.com.asistencia.bean.Persona;
import entecsur.chiki.com.asistencia.controlador.controllerEvento;
import entecsur.chiki.com.asistencia.controlador.controllerEvento_Participante;

public class FragmentEvento extends Fragment {

    ImageButton btnScanEvento;
    TextView tvEvento;
    activityPrincipal principal;
    Spinner spinEvento;
    controllerEvento ctrlEvento;
    controllerEvento_Participante ctrlEventoParticipante;

    public FragmentEvento(activityPrincipal activity){
        this.principal  = activity;
        ctrlEvento      = new controllerEvento(principal, this);
        ctrlEventoParticipante      = new controllerEvento_Participante(principal, this);
        ctrlEvento.getEvents();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v          = inflater.inflate(R.layout.fragment_evento, container, false);
        btnScanEvento   = (ImageButton) v.findViewById(R.id.btnScanEvento);
        tvEvento        = (TextView) v.findViewById(R.id.tvEvento);
        spinEvento      = (Spinner) v.findViewById(R.id.spinEvento);

        btnScanEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                principal.iniciarScan(1);
            }
        });

        return v;
    }

    public void llenarEvento(ArrayList<Evento> lista) {
        //Se pobla el Spinner del Fragmento Evento
        ArrayList<Evento> list = lista;
        if(list!=null){
            ArrayList<String> nombres = new ArrayList<>();

            for (Evento x : list) { nombres.add(x.getNombreEvento());
                System.out.println("Entre: "+x.getNombreEvento());}


            ArrayAdapter<String> spinner_adapter = new ArrayAdapter<>(
                    principal.getApplicationContext(), R.layout.spin_item, nombres);
            spinEvento.setAdapter(spinner_adapter);
        }else{
            Toast.makeText(principal.getApplicationContext(), "No hay datos cargados",Toast.LENGTH_SHORT);
        }
    }

    public void consultarParticipante(String dni) {
        //Consulta si el participante tiene acceso o no a la conferencia o taller
        Persona per = ctrlEventoParticipante.verificarParticipante(dni, spinEvento.getSelectedItem().toString());
        if(per!=null){
            tvEvento.setText("Pase usted, Humano:  " + per.getNombre() + " "+per.getApeMater()
                    + " " + per.getApePater());
        }else{
            tvEvento.setText("Usted no puede entrar a estos aposentos");
        }

    }

}
