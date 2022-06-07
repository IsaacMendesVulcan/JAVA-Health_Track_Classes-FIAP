package HealthTrackClasses;

import java.io.Serializable;
/**
 *Classe que abstrai o tipo de treino realizado pelo usuário
 * @author win
 * @version 1.0
 *
 */
public class TreinoRealizado implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String treinamento;
	private String dataAtividade;
	
	public TreinoRealizado () {
		
	}

	public TreinoRealizado(String treinamento, String dataAtividade) {
		this.treinamento = treinamento;
		this.dataAtividade = dataAtividade;
	}

	/**
	 * Verificando tipo de atividade física realizada pelo usuário
	 * @return treinamento do usuário
	 */
	public String getTreinamento() {
		System.out.println("• TIPO DE ATIVIDADE FÍSICA:");
		return treinamento;
	}

	
	/**
	 * Implementando tipo de atividade física realizada pelo usuário
	 * @param treinamento do usuário
	 */
	public void setTreinamento(String treinamento) {
		this.treinamento = treinamento;
	}

	/**
	   * Verificando a data da atividade física realizada pelo usuário
	   * @return dataAtividade realizada pelo usuário
	   */
	public String getDataAtividade() {
		System.out.println("• DATA EM QUE REALIZOU ATIVIDADE:");
		return dataAtividade;
	}

	
	/**
	 * Implementando a data da atividade física realizada pelo usuário
	 * @param dataAtividade realizada pelo usuário
	 */
	public void setDataAtividade(String dataAtividade) {
		this.dataAtividade = dataAtividade;
	}
}
