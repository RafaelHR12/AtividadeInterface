
public class Operador {

	private String nome;
	private String idOperador;
	private String cpf;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdOperador() {
		return this.idOperador;
	}

	public void setIdOperador(String idOperador) {
		this.idOperador = idOperador;
	}

	public String getHabilidades() {
		return this.cpf;
	}

	public void setHabilidades(String cpf) {
		this.cpf = cpf;
	}

	public boolean verificarCadastro(String nome, String idOperador, String cpf) {
		if (nome.contains(" ") && idOperador.length() > 0 && cpf.length() == 11) {
			return true;
		} else {
			return false;
		}
	}
}
