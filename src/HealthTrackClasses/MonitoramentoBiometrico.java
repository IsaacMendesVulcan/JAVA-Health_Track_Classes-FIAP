package HealthTrackClasses;

import java.io.Serializable;
/**
 *Classe que abstrai o monitoramento biom�trico do usu�rio 
 * @author win
 * @version 1.0
 */
public class MonitoramentoBiometrico implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double numeroAltura;
	private int numeroPeso;
	private String dataRegistro;

	public MonitoramentoBiometrico() {
		
	}

	public MonitoramentoBiometrico(double numeroAltura, int numeroPeso , String dataRegistro) {
		this.numeroAltura = numeroAltura;
		this.numeroPeso = numeroPeso;
		this.dataRegistro = dataRegistro;
		
	}

	/**
	 * Verificando dados de altura do usu�rio
	 * @return numeroAltura do usu�rio
	 */
	public double getNumeroAltura() {
		System.out.println("� ALTURA: ");
		return numeroAltura;
	}
	
	/**
	 * Implementando dados de altura do usu�rio
	 * @param numeroAltura do usu�rio
	 */
	public void setNumeroAltura(double numeroAltura) {
		this.numeroAltura = numeroAltura;
	}

	/**
	 * Verificando dados de peso do usu�rio
	 * @return numeroPeso do usu�rio
	 */
	public int getNumeroPeso() {
		System.out.println("� PESO: ");
		return numeroPeso;
	}
	
	/**
	 * Implementando dados de peso do usu�rio
	 * @param numeroPeso do usu�rio 
	 */
	public void setNumeroPeso(int numeroPeso) {
		this.numeroPeso = numeroPeso;
	}

	/**
	 * Verificando data de registro do monitoramento biom�trico do usu�rio
	 * @return dataRegistro do monitoramento biom�trico do usu�rio
	 */
	public String getDataRegistro() {
		System.out.println("� DATA DO REGISTRO DE MONITORAMENTO BIOM�TRICO: ");
		return dataRegistro;
	}

	
	/**
	 * Implementando data de registro do monitoramento biom�trico do usu�rio
	 * @param dataRegistro do monitoramento biom�trico do usu�rio
	 */
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	
}
