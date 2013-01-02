package com.supratecnologia.treinamento.android.compromisso;

import com.supratecnologia.treinamento.android.compromisso.model.Usuario;
import com.supratecnologia.treinamento.android.compromisso.repositorio.UsuarioRepositorio;
import com.supratecnologia.treinamento.android.compromisso.utils.ValidadorUtils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

	EditText editTextLogin;
	EditText editTextSenha;
	Button buttonLogar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_main);
		
		getFieldsOnLayout();
		
		buttonLogar.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		if(v.getId() == buttonLogar.getId()){
			
			boolean campoLoginEmBranco = ValidadorUtils.isCampoEmBranco(editTextLogin.getText().toString());
			boolean campoSenhaEmBranco = ValidadorUtils.isCampoEmBranco(editTextSenha.getText().toString());
			
			if(!campoLoginEmBranco && !campoSenhaEmBranco){
				
				Usuario u = UsuarioRepositorio.getUsuarioByLoginAndSenha(editTextLogin.getText().toString(), 
						editTextSenha.getText().toString());
				
				if(u != null){
				
					Intent  i = new Intent(this, CompromissoListActivity.class);
					
					i.putExtra("usuarioLogado", u);
					startActivity(i);
				}else{
					
					Toast.makeText(this, "nenhum usuário encontrado", Toast.LENGTH_LONG).show();
				}
			}
		}
	}
	
	private void getFieldsOnLayout() {
		
		editTextLogin = (EditText) findViewById(R.id.editTextLogin);
		editTextSenha = (EditText) findViewById(R.id.editTextSenha);
		buttonLogar = (Button) findViewById(R.id.buttonLogar);
	}
}
