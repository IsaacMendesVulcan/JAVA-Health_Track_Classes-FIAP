package HealthTrackClasses;

import java.io.Serializable;
/**
 *Classe que abstrai o monitoramento biométrico do usuário 
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
	 * Verificando dados de altura do usuário
	 * @return numeroAltura do usuário
	 */
	public double getNumeroAltura() {
		System.out.println("• ALTURA: ");
		return numeroAltura;
	}
	
	/**
	 * Implementando dados de altura do usuário
	 * @param numeroAltura do usuário
	 */
	public void setNumeroAltura(double numeroAltura) {
		this.numeroAltura = numeroAltura;
	}

	/**
	 * Verificando dados de peso do usuário
	 * @return numeroPeso do usuário
	 */
	public int getNumeroPeso() {
		System.out.println("• PESO: ");
		return numeroPeso;
	}
	
	/**
	 * Implementando dados de peso do usuário
	 * @param numeroPeso do usuário 
	 */
	public void setNumeroPeso(int numeroPeso) {
		this.numeroPeso = numeroPeso;
	}

	/**
	 * Verificando data de registro do monitoramento biométrico do usuário
	 * @return dataRegistro do monitoramento biométrico do usuário
	 */
	public String getDataRegistro() {
		System.out.println("• DATA DO REGISTRO DE MONITORAMENTO BIOMÉTRICO: ");
		return dataRegistro;
	}

	
	/**
	 * Implementando data de registro do monitoramento biométrico do usuário
	 * @param dataRegistro do monitoramento biométrico do usuário
	 */
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	
}
