package godoy.sm_practica1;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.*;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FragmentText extends Fragment{
	
	private Button boton;
	private EditText edit;
	private TextView text;
	 
	public FragmentText() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        View view = inflater.inflate(R.layout.texto, container, false);
        
        RelativeLayout.LayoutParams params =    
                new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);

        //Nueva Regla: EL fragmento estara debajo del boton add_fragment
        params.addRule(RelativeLayout.BELOW, R.id.main_button);

        //Margenes: top:41dp
        params.setMargins(0,41,0,0);

        //Setear los parametros al view
        view.setLayoutParams(params);

        boton = (Button)view.findViewById(R.id.fragment_button);
		edit = (EditText)view.findViewById(R.id.fragment_editText);
        text = (TextView)view.findViewById(R.id.fragment_textview);
        
        boton.setOnClickListener(new OnClickListener(){
        	public void onClick(View view){
                String mensaje = edit.getText().toString();
                text.setText(String.valueOf(mensaje.length()));
            }
        });
        
        return view;
    }
}