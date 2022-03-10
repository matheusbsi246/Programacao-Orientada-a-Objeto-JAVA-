import java.util.Date;

public abstract class Funcionario {

	private int funcao;
	private String nome;
	private String cpf;
	private double salario;
	// dependentes;
	private Date dataContratacao;
	private Agencia agencia;

	public int getFuncao() {
		return funcao;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public double getSalario() {
		return salario;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public Agencia getAgencia() {
		return agencia;
	}
}
