package com.shunix.amirooted.activities;

import com.shunix.amirooted.fragments.CheckRoot;
import com.shunix.androidrootchecker.R;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		CheckRoot checkRoot = new CheckRoot();
		setContentView(R.layout.container_layout);
		getSupportFragmentManager().beginTransaction()
				.add(R.id.container, checkRoot).addToBackStack(null).commit();
	}

}
