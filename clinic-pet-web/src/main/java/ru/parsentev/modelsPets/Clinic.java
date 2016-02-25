package ru.parsentev.modelsPets;

/**
*	Класс описывает клинику.
*/
public class Clinic {
	/**
	*	Список клиентов.
	*/
	private final Client[] clients;

	public Clinic(final int size) {
		this.clients = new Client[size];
	}

	/**
	*	Добавить клиента.
	*	@param position Позиция.
	*	@param client Клиент.
	*/
	public void addClient (final int position, final Client client) {
		this.clients[position] = client;
	}

	public Client[] findClientByPetName (final String name) {
		//TODO реализивать
		return new Client[]{};
	}
}