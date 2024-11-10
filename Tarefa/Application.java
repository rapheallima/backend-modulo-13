package Tarefa;

public class Application {

	public static void main(String[] args) {
	
		PessoaFisica pessoaf = new PessoaFisica("Raphael", "Lima", "123.456.567-21");
		
		PessoaJuridica pessoaj = new PessoaJuridica("Ana", "Luísa", "12.345.678/0001-90");
		
		System.out.println(pessoaf.toString());
		System.out.println();
		System.out.println(pessoaj.toString());

	}

}
