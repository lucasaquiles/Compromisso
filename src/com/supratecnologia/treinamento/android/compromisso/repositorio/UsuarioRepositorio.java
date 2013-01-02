package com.supratecnologia.treinamento.android.compromisso.repositorio;

import java.util.ArrayList;
import java.util.Date;

import com.supratecnologia.treinamento.android.compromisso.model.Compromisso;
import com.supratecnologia.treinamento.android.compromisso.model.Usuario;

public class UsuarioRepositorio {

	private static ArrayList<Usuario> usuariosFake = new ArrayList<Usuario>();
	private static ArrayList<Compromisso> compromissosFake = new ArrayList<Compromisso>();
	
	private static void createUsuariosFake() {
		
		Usuario usuario1 = new Usuario("Nome do cara", "login123", "senha123", true);
		usuariosFake.add(usuario1);
		
		Usuario usuario2 = new Usuario("Derpina", "login", "senha123", true);
		usuariosFake.add(usuario2);
		
		compromissosFake.add(associarCompromissoUsuario(usuario1));
		compromissosFake.add(associarCompromissoUsuario(usuario1));
		compromissosFake.add(associarCompromissoUsuario(usuario1));
		compromissosFake.add(associarCompromissoUsuario(usuario2));
		compromissosFake.add(associarCompromissoUsuario(usuario2));
		
		usuariosFake.add(new Usuario("Herpson", "123", "senha123", true));
		usuariosFake.add(new Usuario("Derpington", "loginmaisdificildomudnoqueninguemconseguedecifrar", "asenhaehessa", true));
		usuariosFake.add(new Usuario("ForeverAlone", "loginlogin", "opaopaopa", true));
	}


	private static Compromisso associarCompromissoUsuario(Usuario usuario) {
		
		Compromisso c =  new Compromisso("Compromisso importante do "+usuario, "Descrição 1", new Date(), new Date(), true, usuario);
		usuario.getCompromissos().add(c);
		
		return c;
	}

	public static Usuario getUsuarioByLoginAndSenha(String login, String senha){
		createUsuariosFake();
		
		for(Usuario u : UsuarioRepositorio.usuariosFake){
			
			if(u.getLogin().equals(login) && u.getSenha().equals(senha)){
			
				return u;
			}
		}
		
		return null;
	}
}
