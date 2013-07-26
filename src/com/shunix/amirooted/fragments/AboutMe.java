package com.shunix.amirooted.fragments;

import com.shunix.androidrootchecker.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AboutMe extends Fragment {

	private Button button;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View layout = inflater.inflate(R.layout.about_me_layout, container, false);
		button = (Button)layout.findViewById(R.id.button1);
		button.setOnClickListener(listener);
		return layout;
	}
	
	OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			getActivity().getSupportFragmentManager().popBackStack();
		}
	};

}
