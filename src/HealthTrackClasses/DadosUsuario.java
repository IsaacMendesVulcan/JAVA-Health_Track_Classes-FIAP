package HealthTrackClasses;

import java.io.Serializable;
/**
 *Classe que gera os dados do usuário
 * @author win
 * @version 1.0
 
 */
public class DadosUsuario implements Serializable {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nomeUsuario;
	private String genero;
	private String dataNascimento;
  
	public DadosUsuario() {
 
	}
	public DadosUsuario(String nomeUsuario, String genero,  String dataNascimento) { 
	  this.nomeUsuario = nomeUsuario;
	  this.genero = genero;
	  this.dataNascimento= dataNascimento;	  
	}
  
	/**
	 * Verificando o nome do usuário
	 * @return nomeUsuario 
	 */
	public String getNome() {
	  System.out.println("• NOME:");
      return nomeUsuario;
	}

  
	/**
	 * Implementando nome do usuário
	 * @param nomeUsuario do usuário
	 */
	public void setNome (String nomeUsuario ) {
		this.nomeUsuario = nomeUsuario; 
	}
  
	/**
	 * Verificando o gênero do usuário
	 * @return gênero do usuário
	 */
	public String getGenero() {
		System.out.println("• GÊNERO:");
		return genero;
	}
	
	/**
	 * Implementando o gênero do usuário
	 * @param genero do usuário
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * Verificando data de nascimento do usuário
	 * @return dataNascimento do usuário
	 */
	public String getDataNascimento() {
		System.out.println("• DATA DE NASCIMENTO: ");
		return dataNascimento;
	}
	
	/**
	 * Implementando a data de nascimento do usuário
	 * @param dataNascimento do usuário
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

  }

 
