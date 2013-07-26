package com.shunix.amirooted.fragments;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.message.BasicNameValuePair;

import com.shunix.amirooted.ui.ShunixAdapter;
import com.shunix.amirooted.utils.RootChecker;
import com.shunix.androidrootchecker.R;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AboutPhone extends ListFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.about_phone, container, false);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LayoutInflater layoutInflater = (LayoutInflater)getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
		BasicNameValuePair board = new BasicNameValuePair("Board", RootChecker.getBoard());
		list.add(board);
		BasicNameValuePair bootloader = new BasicNameValuePair("Bootloader", RootChecker.getBootloader());
		list.add(bootloader);
		BasicNameValuePair brand = new BasicNameValuePair("Brand", RootChecker.getBrand());
		list.add(brand);
		BasicNameValuePair codeName = new BasicNameValuePair("Codename", RootChecker.getCodeName());
		list.add(codeName);
		BasicNameValuePair cpuInstructionSet = new BasicNameValuePair("CPU Instruction Set", RootChecker.getCpuInstructionSet());
		list.add(cpuInstructionSet);
		BasicNameValuePair device = new BasicNameValuePair("Device", RootChecker.getDevice());
		list.add(device);
		BasicNameValuePair display = new BasicNameValuePair("Display", RootChecker.getDisplay());
		list.add(display);
		BasicNameValuePair fingerprint = new BasicNameValuePair("Fingerprint", RootChecker.getFingerprint());
		list.add(fingerprint);
		BasicNameValuePair hardware = new BasicNameValuePair("Hardware", RootChecker.getHardware());
		list.add(hardware);
		BasicNameValuePair host = new BasicNameValuePair("Host", RootChecker.getHost());
		list.add(host);
		BasicNameValuePair id = new BasicNameValuePair("ID", RootChecker.getID());
		list.add(id);
		BasicNameValuePair incremental = new BasicNameValuePair("Incremental", RootChecker.getIncremental());
		list.add(incremental);
		BasicNameValuePair manufacturer = new BasicNameValuePair("Manufacturer", RootChecker.getManufacturer());
		list.add(manufacturer);
		BasicNameValuePair model = new BasicNameValuePair("Model", RootChecker.getModel());
		list.add(model);
		BasicNameValuePair product = new BasicNameValuePair("Product", RootChecker.getProduct());
		list.add(product);
		BasicNameValuePair radio = new BasicNameValuePair("Radio", RootChecker.getRadio());
		list.add(radio);
		BasicNameValuePair release = new BasicNameValuePair("Release", RootChecker.getRelease());
		list.add(release);
		BasicNameValuePair sdk = new BasicNameValuePair("SDK", RootChecker.getSDK());
		list.add(sdk);
		BasicNameValuePair serial = new BasicNameValuePair("Serial", RootChecker.getSerial());
		list.add(serial);
		BasicNameValuePair tags = new BasicNameValuePair("Tags", RootChecker.getTags());
		list.add(tags);
		BasicNameValuePair time = new BasicNameValuePair("Time", RootChecker.getTime());
		list.add(time);
		BasicNameValuePair type = new BasicNameValuePair("Type", RootChecker.getType());
		list.add(type);
		BasicNameValuePair user = new BasicNameValuePair("User", RootChecker.getUser());
		list.add(user);
		ShunixAdapter shunixAdapter = new ShunixAdapter(getActivity(), R.layout.row_layout, list, layoutInflater);
		setListAdapter(shunixAdapter);
	}
	
	

}
