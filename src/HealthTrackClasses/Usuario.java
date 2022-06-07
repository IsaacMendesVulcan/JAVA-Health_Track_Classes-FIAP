package HealthTrackClasses;

import java.io.Serializable;

/**
 *Classe que gera credenciais do usuário 
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
	 *Verificando email do usuário 
	 * @return email do usuário
	 */
	public String getEmail() {
		System.out.println("• EMAIL:");
		return email;
	}
	
	/**
	 * Implementando credenciais de email do usuário
	 * @param email do usuário
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Verificando senha do usuario
	 * @return senha do usuário
	 */
	public int getSenha() {
		System.out.println("• SENHA:");
		return senha;
	}
	
	/**
	 * Implementando credenciais de senha do usuário
	 * @param senha do usuário
	 */
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
