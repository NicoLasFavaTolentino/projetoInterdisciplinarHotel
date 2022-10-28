package projeto;

import java.util.ArrayList;

public class Hotel {
	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Quarto> quartos = new ArrayList<>();
	private int quantidadeQuartos = quartos.size();
	
	
	public void adicionarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void editarCliente(int indice, String nome, String cpf, String dataNascimento, String setEndereco) {
		clientes.get(indice).setNome(nome);
		clientes.get(indice).setCpf(cpf);
		clientes.get(indice).setDataNascimento(dataNascimento);
		clientes.get(indice).setEndereco(setEndereco);
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
	
	
	public void adicionarQuartos(Quarto quarto) {
		if (quantidadeQuartos <= 10) {
			quartos.add(quarto);
		}else {
			System.out.println("Quartos esgotado!");
		}
	}

	public boolean verificarDisponibilidadeQuarto(int numeroQuarto){
		boolean disponivel = true;

		for (Quarto quarto : quartos){
			if (quarto.getNumeroQuarto() == numeroQuarto){
				disponivel = false;
			}
		}

		return disponivel;
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
