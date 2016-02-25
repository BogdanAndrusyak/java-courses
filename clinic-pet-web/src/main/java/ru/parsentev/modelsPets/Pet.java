package ru.parsentev.modelsPets;

/**
 * Описывает поведение питомца.
 */
public interface Pet {
    /**
     * Извать звук.
     */
    void makeSound();

    /**
     * @return Имя питомца.
     */
    String getName();
}
