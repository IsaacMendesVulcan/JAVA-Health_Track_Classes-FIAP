package HealthTrackClasses;

import java.io.Serializable;
/**
 *Classe que abstrai o tipo de treino realizado pelo usu�rio
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
	 * Verificando tipo de atividade f�sica realizada pelo usu�rio
	 * @return treinamento do usu�rio
	 */
	public String getTreinamento() {
		System.out.println("� TIPO DE ATIVIDADE F�SICA:");
		return treinamento;
	}

	
	/**
	 * Implementando tipo de atividade f�sica realizada pelo usu�rio
	 * @param treinamento do usu�rio
	 */
	public void setTreinamento(String treinamento) {
		this.treinamento = treinamento;
	}

	/**
	   * Verificando a data da atividade f�sica realizada pelo usu�rio
	   * @return dataAtividade realizada pelo usu�rio
	   */
	public String getDataAtividade() {
		System.out.println("� DATA EM QUE REALIZOU ATIVIDADE:");
		return dataAtividade;
	}

	
	/**
	 * Implementando a data da atividade f�sica realizada pelo usu�rio
	 * @param dataAtividade realizada pelo usu�rio
	 */
	public void setDataAtividade(String dataAtividade) {
		this.dataAtividade = dataAtividade;
	}
}
