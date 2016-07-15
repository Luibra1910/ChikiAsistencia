package entecsur.chiki.com.asistencia;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import entecsur.chiki.com.asistencia.controlador.controllerEvento;

public class FragmentEvento extends Fragment {

    ImageButton btnScanEvento;
    TextView tvEvento;
    activityPrincipal principal;
    Spinner spinEvento;
    controllerEvento ctrlEvento;

    public FragmentEvento(activityPrincipal activity){
        this.principal = activity;
        ctrlEvento = new controllerEvento();
        ctrlEvento.setRequest(principal);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_evento, container, false);
        btnScanEvento = (ImageButton) v.findViewById(R.id.btnScanEvento);
        tvEvento = (TextView) v.findViewById(R.id.tvEvento);
        spinEvento = (Spinner) v.findViewById(R.id.spinEvento);

        llenarEvento();

        spinEvento.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(principal.getApplicationContext(),"Nombre: " + id,Toast.LENGTH_SHORT).show();
                System.out.println(spinEvento.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                System.out.println("No seleccionado :(");
            }
        });

        btnScanEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                principal.iniciarScan(1);
            }
        });

        return v;
    }

    public void llenarEvento() {
        //Se pobla el Spinner del Fragmento Evento
        ArrayList<String> list = ctrlEvento.getAllString();
        /*ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");*/
        ArrayAdapter<String> spinner_adapter = new ArrayAdapter<>(principal.getApplicationContext()
                , R.layout.spin_item, list);
        spinEvento.setAdapter(spinner_adapter);

    }
}
