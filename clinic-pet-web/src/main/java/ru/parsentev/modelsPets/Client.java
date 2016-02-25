package ru.parsentev.modelsPets;

/**
*	Клиент. 
*/
public class Client {
	private final String id;
	private final Pet pet;

	public Client(String id, Pet pet) {
		this.id = id;
		this.pet = pet;
	}
}