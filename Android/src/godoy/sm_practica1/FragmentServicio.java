package godoy.sm_practica1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentServicio extends Fragment{
	
	public FragmentServicio(){
        //Definir
    }
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState){
		
		View view = inflater.inflate(R.layout.servicio, container, false);
		return view;
	}
}