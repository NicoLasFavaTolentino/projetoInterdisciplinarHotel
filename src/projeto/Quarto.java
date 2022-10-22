package projeto;

public class Quarto extends Forma{
	private int numero;
	private int quantidadePessoas;
	
	public Quarto(int numero, int quantidadePessoas) {
		super();
		this.numero = numero;
		this.quantidadePessoas = quantidadePessoas;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

	@Override
	public void print() {
		System.out.println("Número: " + this.numero);
		System.out.println("Quantidade Pessoas: " + this.quantidadePessoas);
	}
}
