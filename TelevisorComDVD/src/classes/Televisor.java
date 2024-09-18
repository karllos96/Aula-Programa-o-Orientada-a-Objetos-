package classes;

public class Televisor {
	
	private String marca;
	private String modelo;
	private String cor;
	private int tamanhoDaTela;
	private String resolucao;
	
	public Televisor (String marca, String modelo, int tamanhoDaTela, String cor, String resolucao) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.tamanhoDaTela = tamanhoDaTela;
		this.resolucao = resolucao;
	}
	
	public void ImprimirInfoTV (){
		System.out.println("_________Televisor_________");
		System.out.println("*****"+ marca + "  " + modelo + "*****");
		System.out.println("Cor: " + cor);
		System.out.println("Tamanho da Tela: " + tamanhoDaTela + "  Polegadas");
		System.out.println("Resolução: " + resolucao);
	}
	
}
