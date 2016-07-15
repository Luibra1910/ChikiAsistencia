package entecsur.chiki.com.asistencia;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentConsulta extends Fragment {

    activityPrincipal principal;

    public FragmentConsulta() {
        // Required empty public constructor
    }

    public void setActivity(activityPrincipal activity) {
        this.principal = activity;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_consulta, container, false);
    }


}
