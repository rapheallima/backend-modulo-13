package Tarefa;

public class PessoaFisica extends Pessoa {

	private String cpf;

	public PessoaFisica(String nome, String sobrenome, String cpf) {
		super(nome, sobrenome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa Física:" + "\nNome: " + getNome() + "\nSobrenome: " + getSobrenome() + "\nCPF: " + cpf;
	}

}
