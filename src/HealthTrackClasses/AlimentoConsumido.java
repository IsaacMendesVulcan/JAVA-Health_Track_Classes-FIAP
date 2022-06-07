package HealthTrackClasses;

import java.io.Serializable;

/**
 * Classe que abstrai o alimento consumido pelo usu�rio
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
	 * Verificando per�odo de refei��o consumida pelo usu�rio
	 * @return periodoRefeicao do alimento consumido pelo usu�rio
	 */
	public String getPeriodoRefeicao() {
		System.out.println("� PER�ODO DE REFEI��O: ");
		return periodoRefeicao;
	}
	
	/**
	 * Implementando o per�odo de refei��o consumida pelo usu�rio
	 * @param periodoRefeicao do alimento consumido pelo usu�rio
	 */
	public void setPeriodoRefeicao(String periodoRefeicao) {
		this.periodoRefeicao = periodoRefeicao;
	}
	
	/**
	 * Verificando o alimento consumido pelo usu�rio
	 * @return alimento consumido pelo usu�rio
	 */
	public String getAlimento() {
		System.out.println("� ALIMENTO CONSUMIDO PELO USU�RIO:");
		return alimento;
	}
	
	/**
	 * Implementando o alimento consumido pelo usu�rio
	 * @param alimento que o usu�rio consumiu
	 */
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	/**
	 * Verificando a data de consumo do usu�rio 
	 * @return dataConsumo
	 */
	public String getDataConsumo() {
		System.out.println("� DATA EM QUE CONSUMIU O ALIMENTO:");
		return dataConsumo;
	}
	
	/**
	 * Implementando a data de consumo do usu�rio
	 * @param dataConsumo do usu�rio
	 */
	public void setDataConsumo(String dataConsumo) {
		this.dataConsumo = dataConsumo;
	}
	/**
	 * Verificando quantidade de alimento consumida pelo usu�rio
	 * @return qtdaAlimento
	 */
	public int getQtdAlimento() {
		System.out.println("� QUANTIDADE DE ALIMENTO(S) CONSUMIDO(S): ");
		return qtdAlimento;
	}
	
	/**
	 * Implementando a quantidade de alimento consumida pelo usu�rio
	 * @param qtdAlimento consumida pelo usu�rio 
	 */
	public void setQtdAlimento(int qtdAlimento) {
		this.qtdAlimento = qtdAlimento;
	}
}
