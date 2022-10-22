package projeto;

import java.util.ArrayList;

public class Hotel {
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Quarto> quartos = new ArrayList<>();
	private int quantidadeQuartos = quartos.size();
	
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void removerCliente(int indice) {
		clientes.remove(indice);
	}
	
	public ArrayList<Cliente> getClientes(){
		return this.clientes;
	}
	
	public void removerClienteComCpf(String cpf) {
		int indice = 0;
		
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) {
				indice = clientes.indexOf(cliente);
			}
		}
		
		clientes.remove(indice);
	}
	
	public void printClienteComCpf(String cpf) {
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) {
				cliente.print();
			}
		}
	}
	
	public void printClientes() {
		for (Cliente cliente : clientes) {
			cliente.print();
		}
	}
	
	
	public void adicionarQuartos(Quarto quarto, Cliente cliente) {
		if (quantidadeQuartos <= 15) {
			quartos.add(quarto);
		}else {
			System.out.println("Quartos esgotado!");
		}
	}
	
	public void removerQuarto(int indice) {
		quartos.remove(indice);
	}
	
	public void printQuartos() {
		for (Quarto quarto : quartos) {
			quarto.print();
		}
	}
	
	public ArrayList<Quarto> getQuartos(){
		return this.quartos;
	}
	
}
