package projeto;

public class Quarto extends Forma{
	private int numeroQuarto;
	private String tipoQuarto;
	private Cliente cliente;
	
	public Quarto(int numeroQuarto, String tipoQuarto, Cliente cliente) {
		this.numeroQuarto = numeroQuarto;
		this.tipoQuarto = tipoQuarto;
		this.cliente = cliente;
	}
	
	public int getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public String getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public void print() {
		System.out.println("N�mero: " + this.numeroQuarto);
		System.out.println("Tipo quarto: " + this.tipoQuarto);
		cliente.print();
	}
}
