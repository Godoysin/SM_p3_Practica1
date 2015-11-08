package godoy.sm_practica1;

import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentConsole extends Fragment{
	
	private EditText muser;
	private EditText mpass;
	private EditText mdom;
	private EditText mport;
	private Button mbutton;
	
	public FragmentConsole() {
        // Required empty public constructor
    }
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState){
		
		View view = inflater.inflate(R.layout.console, container, false);

		muser = (EditText)view.findViewById(R.id.console_user);
		mbutton = (Button) view.findViewById(R.id.console_button);
        mpass = (EditText)view.findViewById(R.id.console_pass);
        mdom = (EditText)view.findViewById(R.id.console_dominio);
        mport = (EditText)view.findViewById(R.id.console_puerto);
        
        
        //mbutton.setOnClickListener(new OnClickListener(){
        	//public void onClick(View view){
        		//String mensaje = "Nombre: " + muser.getText().toString() + "\r\n";
        		//mensaje = mensaje + " " + "Clave: " +mpass.getText().toString() + "\r\n";
        		//mensaje = mensaje + " " + "Dominio: " +mdom.getText().toString() + "\r\n";
        		//mensaje = mensaje + " " + "Puerto: " +mport.getText().toString() + "\r\n";
        		//mtext.setText(mensaje);
            
        	//}
        //});
		
		final FragmentManager fm = getActivity().getFragmentManager();
		
		mbutton.setOnClickListener(new OnClickListener(){
        	public void onClick(View view){
        		
        		//Monto el mensaje con la información que le voy a pasar a la nueva actividad.
        		String info = muser.getText().toString() + mpass.getText().toString() 
        				+ mdom.getText().toString() + mport.getText().toString() + "\r\n";
        		
        		//Con el intent la envio a la nueva actividad.
        		Intent intent = new Intent(getActivity(), Comunicaciones.class);
        		intent.putExtra("datos", info);
        		startActivity(intent);
        		
        		//Este codigo es correcto y permite que cuando pulsas el botón
        		//te cree un nuevo fragmento que reemplaza la que existente.
        		//FragmentTransaction ft =fm.beginTransaction();
        		//FragmentServicio f = new FragmentServicio();
				//ft.replace(R.id.fragment_console, f);
        		//ft.setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
    			//ft.addToBackStack(null);
    			//ft.commit();
        	}
        });
        return view;
	}
	
	 
}