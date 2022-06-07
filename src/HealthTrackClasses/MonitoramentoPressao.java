package HealthTrackClasses;

import java.io.Serializable;
/**
 *Classe que abstrai o monitoramento de pressão do usuário
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
	 * Verificando dados de pressão sistólica do usuário
	 * @return numeroSistolica do usuário
	 */
	public double getNumeroSistolica() {
		System.out.println("• PRESSÃO SISTÓLICA: ");
		return numeroSistolica;
	}

	
	/**
	 * Implementando dados de pressão sistólica do usuário 
	 * @param numeroSistolica do usuário
	 */
	public void setNumeroSistolica(double numeroSistolica) {
		this.numeroSistolica = numeroSistolica;
	}

	/**
	 * Verificando dados de pressão diastólica do usuário
	 * @return numeroDiastolica do usuário
	 */
	public double getNumeroDiastolica() {
		System.out.println("• PRESSÃO DIASTÓLICA: ");
		return numeroDiastolica;
	}

	
	/**
	 * Implementando dados de pressão diastólica do usuário 
	 * @param numeroDiastolica do usuário
	 */
	public void setNumeroDiastolica(double numeroDiastolica) {
		this.numeroDiastolica = numeroDiastolica;
	}

	/**
	 * Verificando data de registro da pressão do usuário
	 * @return dataRegistro da pressão do usuário
	 */
	public String getDataRegistro() {
		System.out.println("• DATA DO REGISTRO DE PRESSÃO: ");
		return dataRegistro;
	}

	/**
	 * Implementando data de registro da pressão do usuário 
	 * @param dataRegistro de pressão do usuário
	 */
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
}