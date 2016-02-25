package ru.parsentev.modelsPets;

/**
 * Реализация собаки.
 */
public class Dog implements Pet {
    /**
     * Базовая реализация питомца.
     */
    private final Pet pet;

    public Dog(final Pet pet) {
        this.pet = pet;
    }

    /**
     * {@inheritDoc}
     */
    public void makeSound() {
        this.pet.makeSound();
        System.out.println("Gav, Gav");
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return this.pet.getName();
    }
}
