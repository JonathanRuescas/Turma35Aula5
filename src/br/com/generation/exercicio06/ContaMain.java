package br.com.generation.exercicio06;

public class ContaMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ContaAtributos conta1 = new ContaAtributos();
	
	conta1.setDonoConta("John Smith");
	conta1.setCpf("129.342.456-21");
	conta1.setSaldo(234.76);
	
	System.out.println("Nome do titular da Conta: " + conta1.getDonoConta());
	System.out.println("CPF do titular da Conta: " + conta1.getCpf());
	System.out.println("Saldo Corrente: " + conta1.getSaldo());
	

}
}