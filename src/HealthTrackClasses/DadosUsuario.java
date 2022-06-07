package HealthTrackClasses;

import java.io.Serializable;
/**
 *Classe que gera os dados do usu�rio
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
	 * Verificando o nome do usu�rio
	 * @return nomeUsuario 
	 */
	public String getNome() {
	  System.out.println("� NOME:");
      return nomeUsuario;
	}

  
	/**
	 * Implementando nome do usu�rio
	 * @param nomeUsuario do usu�rio
	 */
	public void setNome (String nomeUsuario ) {
		this.nomeUsuario = nomeUsuario; 
	}
  
	/**
	 * Verificando o g�nero do usu�rio
	 * @return g�nero do usu�rio
	 */
	public String getGenero() {
		System.out.println("� G�NERO:");
		return genero;
	}
	
	/**
	 * Implementando o g�nero do usu�rio
	 * @param genero do usu�rio
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * Verificando data de nascimento do usu�rio
	 * @return dataNascimento do usu�rio
	 */
	public String getDataNascimento() {
		System.out.println("� DATA DE NASCIMENTO: ");
		return dataNascimento;
	}
	
	/**
	 * Implementando a data de nascimento do usu�rio
	 * @param dataNascimento do usu�rio
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

  }

 
