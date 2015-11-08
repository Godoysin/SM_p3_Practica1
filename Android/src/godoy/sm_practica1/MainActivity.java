package godoy.sm_practica1;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity{
	
	FragmentManager fm = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Con esto se crea el fragmento de manera dinámica.
		fm = getFragmentManager();
		//Lo creo en fragment_console
		Fragment fragment = fm.findFragmentById(R.id.fragment_console);
		//Lo creo solo si no hay otro fragmento en fragment_console
		if (fragment == null) {
			FragmentTransaction ft = fm.beginTransaction();
			FragmentConsole console = new FragmentConsole();
			ft.add(R.id.fragment_console, console);
			ft.commit();
		}
		
	}
	
}