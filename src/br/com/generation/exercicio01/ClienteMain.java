package br.com.generation.exercicio01;

public class ClienteMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ClienteAtributos cliente1 = new ClienteAtributos();
	
	cliente1.setNome("John Smith");
	cliente1.setCpf("129.342.456-21");
	cliente1.setIdade(34);
	
	System.out.println("Nome do Cliente: " + cliente1.getNome());
	System.out.println("CPF do Cliente: " + cliente1.getCpf());
	System.out.println("Idade do Cliente: " + cliente1.getIdade());
}
}