package br.com.generation.exercicio07;

public class PacienteMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	PacienteAtributos paciente1 = new PacienteAtributos();
	
	paciente1.setNome("John Smith");
	paciente1.setIdade(34);
	paciente1.setDoença("Sífilis tardia");
	paciente1.setTratRecom("Injeções de Penicilína Semanalmente: 3 doses");
	
	System.out.println("Nome do Paciente: " + paciente1.getNome());
	System.out.println("Idade do Paciente: " + paciente1.getIdade());
	System.out.println("Enfermidade: " + paciente1.getDoença());
	System.out.println("Tratamento indicado: " + paciente1.getTratRecom());

}
}