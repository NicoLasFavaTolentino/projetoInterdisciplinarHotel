package projeto;

public class Quarto extends Forma{
	private int numero;
	private int quantidadeCamas;
	
	public Quarto(int numero, int quantidadePessoas) {
		this.numero = numero;
		this.quantidadeCamas = quantidadePessoas;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getQuantidadePessoas() {
		return quantidadeCamas;
	}

	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadeCamas = quantidadePessoas;
	}

	@Override
	public void print() {
		System.out.println("N�mero: " + this.numero);
		System.out.println("Quantidade Pessoas: " + this.quantidadeCamas);
	}
}
