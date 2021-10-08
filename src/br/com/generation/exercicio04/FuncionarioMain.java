package br.com.generation.exercicio04;

public class FuncionarioMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	FuncionarioAtributos funcionario1 = new FuncionarioAtributos();
	
	funcionario1.setNome("Pedro da Silva");
	funcionario1.setHorasTrabalho(200);
	funcionario1.setSalario(3300);
	
	System.out.println("Nome do Funcionário: " + funcionario1.getNome());
	System.out.println("Horas trabalhadas no mês: " + funcionario1.getHorasTrabalho());
	System.out.println("Salário.......... R$" + funcionario1.getSalario());
	
	}

}
