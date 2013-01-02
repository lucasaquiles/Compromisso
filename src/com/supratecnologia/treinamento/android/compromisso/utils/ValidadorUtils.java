package com.supratecnologia.treinamento.android.compromisso.utils;

import com.supratecnologia.treinamento.android.compromisso.model.Usuario;

public class ValidadorUtils {
	
	public static boolean isCampoEmBranco(String fieldName){
		
		return fieldName.trim().equals("");
	}
	
	public static boolean isUsuarioInvalido(Usuario usuario){
		
		return usuario == null;
	}
}
