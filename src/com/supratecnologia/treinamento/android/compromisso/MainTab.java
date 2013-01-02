package com.supratecnologia.treinamento.android.compromisso;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabWidget;

public class MainTab extends Activity{
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.tabs_main);
		
		TabHost tabhost = (TabHost) findViewById(R.id.tabHost);
		TabWidget tab = (TabWidget) findViewById(R.id.tabs);
		
		
		tabhost.setup();
		
		TabHost.TabSpec spec = tabhost.newTabSpec("tag1");
		spec.setIndicator("Compromissos");
		spec.setContent(new Intent(this, CompromissoListActivity.class));
		
		tabhost.addTab(spec);
		
	}
}
