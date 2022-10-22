package projeto;

import java.util.ArrayList;

public class Hotel {
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Quarto> quartos = new ArrayList<>();
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void removerCliente(int indice) {
		clientes.remove(indice);
	}
	
	public void printClientes() {
		for (Cliente cliente : clientes) {
			cliente.print();
		}
	}
	
}
