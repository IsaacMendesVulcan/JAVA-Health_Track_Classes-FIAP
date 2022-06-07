package HealthTrackClasses;

import java.io.Serializable;
/**
 *Classe que abstrai o monitoramento de press�o do usu�rio
 * @author win
 * @version 1.0
 */
public class MonitoramentoPressao implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double numeroSistolica;
	private double numeroDiastolica;
	private String dataRegistro; 
	
	public MonitoramentoPressao() {
		
	}

	public MonitoramentoPressao(double numeroSistolica, double numeroDiastolica, String dataRegistro) {
		this.numeroSistolica = numeroSistolica;
		this.numeroDiastolica = numeroDiastolica;
		this.dataRegistro = dataRegistro;
}

	/**
	 * Verificando dados de press�o sist�lica do usu�rio
	 * @return numeroSistolica do usu�rio
	 */
	public double getNumeroSistolica() {
		System.out.println("� PRESS�O SIST�LICA: ");
		return numeroSistolica;
	}

	
	/**
	 * Implementando dados de press�o sist�lica do usu�rio 
	 * @param numeroSistolica do usu�rio
	 */
	public void setNumeroSistolica(double numeroSistolica) {
		this.numeroSistolica = numeroSistolica;
	}

	/**
	 * Verificando dados de press�o diast�lica do usu�rio
	 * @return numeroDiastolica do usu�rio
	 */
	public double getNumeroDiastolica() {
		System.out.println("� PRESS�O DIAST�LICA: ");
		return numeroDiastolica;
	}

	
	/**
	 * Implementando dados de press�o diast�lica do usu�rio 
	 * @param numeroDiastolica do usu�rio
	 */
	public void setNumeroDiastolica(double numeroDiastolica) {
		this.numeroDiastolica = numeroDiastolica;
	}

	/**
	 * Verificando data de registro da press�o do usu�rio
	 * @return dataRegistro da press�o do usu�rio
	 */
	public String getDataRegistro() {
		System.out.println("� DATA DO REGISTRO DE PRESS�O: ");
		return dataRegistro;
	}

	/**
	 * Implementando data de registro da press�o do usu�rio 
	 * @param dataRegistro de press�o do usu�rio
	 */
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
}