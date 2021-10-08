package br.com.generation.exercicio05;

public class PatineteMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	PatineteAtributos patinete1 = new PatineteAtributos();
	
	patinete1.setMarca("Multilaser");
	patinete1.setModelo("es-205");
	patinete1.setPreco(950.00);
	
	System.out.println("Marca do Patinete: " + patinete1.getMarca());
	System.out.println("Modelo do Patinete: " + patinete1.getModelo());
	System.out.println("Preço do Patinete...R$ " + patinete1.getPreco());
}
	
}
