package com.shunix.amirooted.ui;

import java.util.List;

import org.apache.http.message.BasicNameValuePair;

import com.shunix.androidrootchecker.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ShunixAdapter extends ArrayAdapter<BasicNameValuePair> {
	private LayoutInflater layoutInflater;
	private Context context;
	private int resourceId;
	public ShunixAdapter(Context context, int resource,
			List<BasicNameValuePair> objects) {
		super(context, resource, objects);
		this.context = context;
		this.resourceId = resource;
	}
	
	public ShunixAdapter(Context context, int resource,
			List<BasicNameValuePair> objects, LayoutInflater inflater) {
		this(context, resource, objects);
		this.layoutInflater = inflater;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		BasicNameValuePair pair = getItem(position);
		LinearLayout linearLayout = new LinearLayout(context);
		layoutInflater.inflate(resourceId, linearLayout, true);
		TextView key = (TextView)linearLayout.findViewById(R.id.textView1);
		TextView value = (TextView)linearLayout.findViewById(R.id.textView2);
		key.setText(pair.getName());
		value.setText(pair.getValue());
		return linearLayout;
	}
	
	
	
}
