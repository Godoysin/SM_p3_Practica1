package godoy.sm_practica1;

import godoy.sm_practica1.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentText extends Fragment{

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState){
		
		View fragment = inflater.inflate(R.id.fragment_text, null);
		
		return fragment;
	}
	
	public void publica(CharSequence text){
		
		TextView t= (TextView) getActivity().findViewById(R.id.fragment_text);
		if(t!=null)
		{
			t.setText(text);
		}
		
	}

}