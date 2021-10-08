package br.com.generation.exercicio03;

public class ProdutoMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ProdutoAtributos produto1 = new ProdutoAtributos();
	
	produto1.setGadget("Iphone 13");
	produto1.setMarca("Apple");
	produto1.setMemoria("1 TB");
	
	System.out.println("Nome do Aparelho: " + produto1.getGadget());
	System.out.println("Marca do Aparelho: " + produto1.getMarca());
	System.out.println("Capacidade do Aparelho: " + produto1.getMemoria());
	
	}

}
