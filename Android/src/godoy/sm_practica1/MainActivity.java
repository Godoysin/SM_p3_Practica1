package godoy.sm_practica1;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity{
	
	private Button main_button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Obteniendo la instancia del botón add_fragment
        main_button = (Button)findViewById(R.id.main_button);

        //Seteando la escucha del botón
        main_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Paso 1: Obtener la instancia del administrador de fragmentos
                FragmentManager fragmentManager = getFragmentManager();

                //Paso 2: Crear una nueva transacción
                FragmentTransaction transaction = fragmentManager.beginTransaction();

                //Paso 3: Crear un nuevo fragmento y añadirlo
                FragmentText fragment = new FragmentText();
                transaction.add(R.id.contenedor, fragment);

                //Paso 4: Confirmar el cambio
                transaction.commit();


            }
        });
		
	}
}
