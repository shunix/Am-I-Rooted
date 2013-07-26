package com.shunix.amirooted.fragments;

import com.shunix.amirooted.utils.RootChecker;
import com.shunix.androidrootchecker.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class CheckRoot extends Fragment {

	private Button chkButton;
	private Button infoButton;
	private Button aboutButton;
	private TextView chkTextView;
	private TextView suTextView;
	private TextView sudoTextView;
	private TextView busyboxTextView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View checkRootLayout = inflater.inflate(R.layout.check_root, container,
				false);
		chkButton = (Button) checkRootLayout.findViewById(R.id.button1);
		infoButton = (Button) checkRootLayout.findViewById(R.id.button2);
		aboutButton = (Button) checkRootLayout.findViewById(R.id.button3);
		chkTextView = (TextView) checkRootLayout.findViewById(R.id.textView2);
		suTextView = (TextView) checkRootLayout.findViewById(R.id.textView4);
		sudoTextView = (TextView) checkRootLayout.findViewById(R.id.textView6);
		busyboxTextView = (TextView) checkRootLayout
				.findViewById(R.id.textView8);
		chkButton.setOnClickListener(chkListener);
		infoButton.setOnClickListener(infoListener);
		aboutButton.setOnClickListener(aboutListener);
		return checkRootLayout;
	}

	OnClickListener chkListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			boolean isRooted = RootChecker.checkRootAccess();
			if (!isRooted) {
				chkTextView.setText("");
				chkTextView.setText(getResources().getString(R.string.nroot));
			} else {
				chkTextView.setText("");
				chkTextView.setText(getResources().getString(R.string.rooted));
				suTextView.setText("");
				suTextView.setText(RootChecker.getSuPath());
				sudoTextView.setText("");
				sudoTextView.setText(RootChecker.getSudoPath());
				busyboxTextView.setText("");
				busyboxTextView.setText(RootChecker.getBusyboxPath());
			}
		}
	};

	OnClickListener infoListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			AboutPhone aboutPhone = new AboutPhone();
			getActivity().getSupportFragmentManager().beginTransaction()
					.replace(R.id.container, aboutPhone).addToBackStack(null)
					.commit();
		}
	};

	OnClickListener aboutListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			AboutMe aboutMe = new AboutMe();
			getActivity().getSupportFragmentManager().beginTransaction()
					.replace(R.id.container, aboutMe).addToBackStack(null)
					.commit();
		}
	};

}
