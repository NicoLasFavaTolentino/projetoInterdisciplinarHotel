package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int indiceClienteCpf(Hotel hotel, String cpf){
		int indice = 0;
		ArrayList<Cliente> clientes = hotel.getClientes();
		
		for (Cliente cliente : clientes){
			if (cliente.getCpf().equals(cpf)){
				indice = clientes.indexOf(cliente);
			}
		}
		
		return indice;
	}

	static boolean verificarExistenciaCpf(Hotel hotel, String cpf){
		boolean existe = false;
		ArrayList<Cliente> clientes = hotel.getClientes();

		for (Cliente cliente : clientes){
			if (cliente.getCpf().equals(cpf)){
				existe = true;
			}
		}
		
		return existe;
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		leia.useDelimiter("\\R"); //https://stackoverflow.com/questions/69680170/scanner-skipping-my-nextline-statement-in-constructor
		String escolha, opcao;
		String nome, cpf, dataNascimento, endereco, tipoQuarto = null;
		int numeroQuarto;
		int indice;
		Hotel hotel = new Hotel();
		
		do {
			System.out.println("1 - Adicionar Cliente" + "\n" +
					"2 - Remover Cliente" + "\n" +
					"3 - Pesquisar Cliente" + "\n" +
					"4 - Editar Cliente" + "\n" +
					"5 - Exibir Todos os Clientes" + "\n" +
					"6 - Exibir Todos os Quartos");
			
			System.out.print("Sua escolha: ");
			escolha = leia.next().toUpperCase();
			
			switch(escolha) {
				//adicionar cliente
				case "1":
					boolean quartoDisponivel;

					System.out.println("Dados do Cadastrante");

					System.out.print("Nome: ");
					nome = leia.next();
					
					System.out.print("CPF: ");
					cpf = leia.next();
					
					System.out.print("Data Nascimento: ");
					dataNascimento = leia.next();
					
					System.out.print("Endereço: ");
					endereco = leia.next();

					System.out.println("""
             			Tipo De quarto
             				
       					1 - Casal (1 Cama Grande)
       					2 - Familia (1 Cama Grande e Duas Pequenas)
					""");

					opcao = leia.next();

					if(opcao.equals("1")){
						System.out.print("Numero do quarto");
						numeroQuarto = leia.nextInt();

						quartoDisponivel = hotel.verificarDisponibilidadeQuarto(numeroQuarto);

						if (quartoDisponivel){
							tipoQuarto = "Casal";
						}else {
							System.out.println("Quarto já está sendo utilizado");
						}
					}else{
						System.out.print("Numero do quarto");
						numeroQuarto = leia.nextInt();

						quartoDisponivel = hotel.verificarDisponibilidadeQuarto(numeroQuarto);

						if(quartoDisponivel){
							tipoQuarto = "Familia";
						}else {
							System.out.println("Quarto já está sendo utilizado");
						}
					}
					
					Cliente cliente = new Cliente(nome, cpf, dataNascimento, endereco);
					Quarto quarto = new Quarto(numeroQuarto, tipoQuarto, cliente);

					hotel.adicionarCliente(cliente);
					hotel.adicionarQuartos(quarto);

					break;

					//remover cliente
				case "2":
					System.out.print("Insira o CPF do cliente a ser removido: ");
					cpf = leia.next();
					
					System.out.println("Encontrado: ");
					hotel.printClienteComCpf(cpf);
					
					System.out.print("Remover? S/N: ");
					opcao = leia.next().toUpperCase();
					
					if (opcao.equals("S")) {
						hotel.removerClienteComCpf(cpf);
						
						System.out.println("Removido!");
					}else {
						System.out.println("Cancelado!");
					}
					
					break;

					//pesquisar cliente
				case "3":
					System.out.print("CPF a ser procurado: ");
					cpf = leia.next();

					System.out.println("Encontrado: ");
					hotel.printClienteComCpf(cpf);

					break;

					//editar cliente
				case "4":
					System.out.print("CPF: ");
					cpf = leia.next();
					boolean cpfExiste = verificarExistenciaCpf(hotel, cpf);

					if (cpfExiste){
						indice = indiceClienteCpf(hotel, cpf);

						System.out.println("Encontrado: ");
						hotel.printClienteComCpf(cpf);

						System.out.print("Editar? S/N");
						opcao = leia.next().toUpperCase();

						if (opcao.equals("S")){
							System.out.print("Nome: ");
							nome = leia.next();
							System.out.print("CPF: ");
							cpf = leia.next();
							System.out.print("Data de Nascimento: ");
							dataNascimento = leia.next();
							System.out.print("Endereço: ");
							endereco = leia.next();

							hotel.editarCliente(indice,
									nome,
									cpf,
									dataNascimento,
									endereco);

						}else{
							System.out.println("Cancelado!");
						}

					}else {
						System.out.println("CPF não encontrado");
					}

					break;

					//exibir clientes
				case "5":
					System.out.println("Todos os clientes: ");
					hotel.printClientes();
					
					break;

				case "6":
					System.out.println("Quartos cadastrados: ");
					hotel.printQuartos();
					
		}
		}while (!escolha.equals("SAIR"));
		
		
	}
}
