package ru.parsentev.modelsPets;

/**
 * Реализация кота. Он умеет мяукать и ловить мышей.
 */
public class Cat extends Animal {
    /**
     * Конструстор.
     * @param name Имя животного.
     */
    public Cat(String name) {
        super(name);
    }

    public void catchMouse() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void makeSound() {
        System.out.println(String.format("May %s", this.getName()));
    }
}
