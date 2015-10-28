package godoy.sm_practica1;

import android.os.Bundle;
import android.app.Fragment;
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
	private Button mbutton;
	private TextView mtext;
	
	public FragmentConsole() {
        // Required empty public constructor
    }
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState){
		
		View view = inflater.inflate(R.layout.console, container, false);

        muser = (EditText)view.findViewById(R.id.console_user);
        mpass = (EditText)view.findViewById(R.id.console_pass);
        mbutton = (Button)view.findViewById(R.id.console_button);
        mtext = (TextView)view.findViewById(R.id.console_text);
        
        
        mbutton.setOnClickListener(new OnClickListener(){
        	public void onClick(View view){
        		String mensaje = muser.getText().toString();
        		mensaje = mensaje + " " + mpass.getText().toString();
        		mtext.setText(mensaje);
            
        	}
        });
        return view;
	}
	
	 
}