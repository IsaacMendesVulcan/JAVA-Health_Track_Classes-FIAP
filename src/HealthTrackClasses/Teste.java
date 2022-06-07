package HealthTrackClasses;

public class Teste {
	
	public static void main(String[] args) {
		Usuario login = new Usuario();
		login.setEmail("nina@gmail.com");
		login.setSenha(12345);
		
		System.out.println( login.getEmail() + "\n" );
		System.out.println( login.getSenha() + "\n");
	
		DadosUsuario dados = new DadosUsuario();
		dados.setNome("Nina");
		dados.setGenero("Feminino");
		dados.setDataNascimento("13/02/2001");	
		
		System.out.println(dados.getNome() + "\n");
		System.out.println(dados.getGenero() + "\n");
		System.out.println(dados.getDataNascimento() + "\n");
		
		MonitoramentoPressao monitoraPressao = new MonitoramentoPressao();
		monitoraPressao.setNumeroSistolica(80);
		monitoraPressao.setNumeroDiastolica(120);
		monitoraPressao.setDataRegistro("16/04/2022");
		
		System.out.println(monitoraPressao.getNumeroSistolica() + "\n");
		System.out.println(monitoraPressao.getNumeroDiastolica() + "\n");
		System.out.println(monitoraPressao.getDataRegistro() + "\n");
		
		MonitoramentoBiometrico monitoraBiometria = new MonitoramentoBiometrico();
		monitoraBiometria.setNumeroAltura(1.50);
		monitoraBiometria.setNumeroPeso(50);
		monitoraBiometria.setDataRegistro("16/04/2022");
		
		System.out.println(monitoraBiometria.getNumeroAltura() + "\n");
		System.out.println(monitoraBiometria.getNumeroPeso() + "\n");
		System.out.println(monitoraBiometria.getDataRegistro() + "\n");
		
		AlimentoConsumido consumido = new AlimentoConsumido();
		consumido.setPeriodoRefeicao("Tarde");
		consumido.setAlimento("Banana");
		consumido.setDataConsumo("16/04/2022");
		consumido.setQtdAlimento(2);
		
		System.out.println(consumido.getPeriodoRefeicao() + "\n");
		System.out.println(consumido.getAlimento() + "\n");
		System.out.println(consumido.getDataConsumo() + "\n");
		System.out.println(consumido.getQtdAlimento() + "\n");
		
		TreinoRealizado treino = new TreinoRealizado();
		treino.setTreinamento("Aeróbica");
		treino.setDataAtividade("16/04/2022");
		
		System.out.println(treino.getTreinamento() + "\n");
		System.out.println(treino.getDataAtividade() + "\n");
}
}