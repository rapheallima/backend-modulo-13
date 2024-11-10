package Tarefa;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public PessoaJuridica(String nome, String sobrenome, String cnpj) {
		super(nome, sobrenome);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return "Pessoa Jurídica:" + "\nNome: " + getNome() + "\nSobrenome: " + getSobrenome() + "\nCNPJ: " + cnpj;
	}

}
