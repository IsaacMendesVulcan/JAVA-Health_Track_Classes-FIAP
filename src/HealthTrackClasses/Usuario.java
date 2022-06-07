package HealthTrackClasses;

import java.io.Serializable;

/**
 *Classe que gera credenciais do usu�rio 
 * @author win
 * @version 1.0
 *
 */
public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private int senha;
	
	public Usuario() {
		
	}
	
	public Usuario(String email, int senha) {
		this.email = email;
		this.senha = senha;
	}
	
	/**
	 *Verificando email do usu�rio 
	 * @return email do usu�rio
	 */
	public String getEmail() {
		System.out.println("� EMAIL:");
		return email;
	}
	
	/**
	 * Implementando credenciais de email do usu�rio
	 * @param email do usu�rio
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Verificando senha do usuario
	 * @return senha do usu�rio
	 */
	public int getSenha() {
		System.out.println("� SENHA:");
		return senha;
	}
	
	/**
	 * Implementando credenciais de senha do usu�rio
	 * @param senha do usu�rio
	 */
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
