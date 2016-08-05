package entecsur.chiki.com.asistencia;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import entecsur.chiki.com.asistencia.barcode.IntentIntegrator;
import entecsur.chiki.com.asistencia.barcode.IntentResult;

public class activityPrincipal extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    FragmentEvento fragEvento;
    FragmentConsulta fragConsulta;
    int tipoConsulta = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        tabLayout       = (TabLayout) findViewById(R.id.tabLayout);
        viewPager       = (ViewPager) findViewById(R.id.viewPager);

        fragEvento      = new FragmentEvento(this);

        fragConsulta    = new FragmentConsulta();

        fragConsulta.setActivity(this);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(fragEvento, "Eventos");
        viewPagerAdapter.addFragments(fragConsulta, "Consulta");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        final IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        handleResult(scanResult);
    }

    //Manejador del resultado
    private void handleResult(IntentResult scanResult) {
        if (scanResult != null) {
            setResultados(scanResult.getContents());
        } else {
            Toast.makeText(activityPrincipal.this, "No se ha leído nada :(", Toast.LENGTH_SHORT).show();
        }
    }

    public void iniciarScan(int tipo) {
        this.tipoConsulta = tipo;
        new IntentIntegrator(activityPrincipal.this).initiateScan();
    }

    public void setResultados(String results) {
        switch (tipoConsulta) {
            case 1:
                fragEvento.consultarParticipante(results);
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

}
