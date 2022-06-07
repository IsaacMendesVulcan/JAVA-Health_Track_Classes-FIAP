package HealthTrackClasses;

import java.io.Serializable;

/**
 * Classe que abstrai o alimento consumido pelo usuário
 * @author win
 * @version 1.0
 */
public class AlimentoConsumido implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String periodoRefeicao;
	private String alimento;
	private String dataConsumo;
	private int qtdAlimento;
	
	public AlimentoConsumido () {
		
	}

	public AlimentoConsumido(String periodoRefeicao, String alimento, String dataConsumo, int qtdAlimento) {
		this.periodoRefeicao = periodoRefeicao;
		this.alimento = alimento;
		this.dataConsumo = dataConsumo;
		this.qtdAlimento = qtdAlimento;
		
	}
	/**
	 * Verificando período de refeição consumida pelo usuário
	 * @return periodoRefeicao do alimento consumido pelo usuário
	 */
	public String getPeriodoRefeicao() {
		System.out.println("• PERÍODO DE REFEIÇÃO: ");
		return periodoRefeicao;
	}
	
	/**
	 * Implementando o período de refeição consumida pelo usuário
	 * @param periodoRefeicao do alimento consumido pelo usuário
	 */
	public void setPeriodoRefeicao(String periodoRefeicao) {
		this.periodoRefeicao = periodoRefeicao;
	}
	
	/**
	 * Verificando o alimento consumido pelo usuário
	 * @return alimento consumido pelo usuário
	 */
	public String getAlimento() {
		System.out.println("• ALIMENTO CONSUMIDO PELO USUÁRIO:");
		return alimento;
	}
	
	/**
	 * Implementando o alimento consumido pelo usuário
	 * @param alimento que o usuário consumiu
	 */
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	/**
	 * Verificando a data de consumo do usuário 
	 * @return dataConsumo
	 */
	public String getDataConsumo() {
		System.out.println("• DATA EM QUE CONSUMIU O ALIMENTO:");
		return dataConsumo;
	}
	
	/**
	 * Implementando a data de consumo do usuário
	 * @param dataConsumo do usuário
	 */
	public void setDataConsumo(String dataConsumo) {
		this.dataConsumo = dataConsumo;
	}
	/**
	 * Verificando quantidade de alimento consumida pelo usuário
	 * @return qtdaAlimento
	 */
	public int getQtdAlimento() {
		System.out.println("• QUANTIDADE DE ALIMENTO(S) CONSUMIDO(S): ");
		return qtdAlimento;
	}
	
	/**
	 * Implementando a quantidade de alimento consumida pelo usuário
	 * @param qtdAlimento consumida pelo usuário 
	 */
	public void setQtdAlimento(int qtdAlimento) {
		this.qtdAlimento = qtdAlimento;
	}
}
