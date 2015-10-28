package godoy.sm_practica1;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity{
	
	private Button mbutton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mbutton = (Button) findViewById(R.id.console_button);
		
		mbutton.setOnClickListener(new OnClickListener(){
        	public void onClick(View view){
        		
        		FragmentTransaction transaction = getFragmentManager().beginTransaction();
        		
        		transaction.replace(R.id.fragment_console, new FragmentServicio());
        		
        		transaction.addToBackStack(null); 

        		transaction.commit();
        	}
        });
	}
	
}