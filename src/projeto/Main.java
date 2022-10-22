package projeto;

public class Main {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("a", "123", "31", "teste");
		Cliente cliente2 = new Cliente("ab", "123", "31", "testeB");
		Hotel hotel = new Hotel();
		
		hotel.adicionarCliente(cliente2);
		hotel.adicionarCliente(cliente);
		hotel.printClientes();
	}
}
