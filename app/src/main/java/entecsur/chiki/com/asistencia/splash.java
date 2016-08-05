package entecsur.chiki.com.asistencia;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.ArrayList;

import entecsur.chiki.com.asistencia.bean.Evento;
import entecsur.chiki.com.asistencia.controlador.controllerEvento;

public class splash extends AppCompatActivity {

    public static final int Duracion = 7;
    public static final int miliseco = Duracion*1000;
    ProgressBar pBar;
    public static final int delay = 2;
    private ArrayList<Evento> list = new ArrayList<>();
    controllerEvento ctrlEvento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ctrlEvento = new controllerEvento(this);
        pBar = (ProgressBar) findViewById(R.id.pBar);
        if (pBar != null) {
            pBar.setMax(Duracion-delay);
        }
        cargarDatos();
    }

    public void cargarDatos() {

        new CountDownTimer(miliseco, 1000) {



            @Override
            public void onTick(long millisUntilFinished) {
                System.out.println("mil:"+ millisUntilFinished+" - "+miliseco);
                //if(miliseco-millisUntilFinished>50){
                    ctrlEvento.getEvents();
                //}

                //if (pBar != null) {
                    pBar.setProgress(establecerProgreso(millisUntilFinished));
                //}
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(splash.this, activityPrincipal.class);
                startActivity(intent);
                finish();
            }
        }.start();

    }

    public int establecerProgreso(long miliseconds){
        return (int)(miliseco - miliseconds)/1000;
    }

    /*
    public int maximoProgress() {
        return Duracion - delay;
    }*/

    public void setEvents(ArrayList<Evento> events){
        this.list = events;
        for (int i = 0; i<events.size();i++){
            System.out.println(events.get(i).getNombreEvento() + " ");
        }
    }

}
