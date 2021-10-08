package br.com.generation.exercicio02;

public class AviaoMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	AviaoAtributos aviao1 = new AviaoAtributos();
	
	aviao1.setTipo("Airbus A320");
	aviao1.setMarca("Airbus");
	aviao1.setUtilidade("Passageiros");
	
	System.out.println("Tipo de Aeronave: " + aviao1.getTipo());
	System.out.println("Marca da Aeronave: " + aviao1.getMarca());
	System.out.println("Utilidade da Aeronave: " + aviao1.getUtilidade());
	
	}

}
