package com.supratecnologia.treinamento.android.compromisso;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.supratecnologia.treinamento.android.compromisso.model.Compromisso;
import com.supratecnologia.treinamento.android.compromisso.model.Usuario;

public class CompromissoListActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		Usuario usuario = (Usuario) getIntent().getExtras().get("usuarioLogado");
		
		ArrayAdapter<Compromisso> listaDeCompromissos = 
				new ArrayAdapter<Compromisso>(this, android.R.layout.simple_list_item_1, usuario.getCompromissos());
		
		setListAdapter(listaDeCompromissos);
	}

	private ArrayList<String> criaCompromissosFake() {
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Compromisso 1");
		lista.add("Compromisso 2");
		lista.add("Compromisso 3");
		lista.add("Compromisso 4");
		lista.add("Compromisso 5");
		lista.add("Compromisso 6");
		lista.add("Compromisso 7");
		lista.add("Compromisso 8");
		lista.add("Compromisso 9");
		lista.add("Compromisso 10");
		
		return lista;
	}
}
