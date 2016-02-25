package ru.parsentev.modelsPets;

/**
 * Базовый класс для животных.
 */
public class Animal implements Pet {
    /**
     * Имя.
     */
    private final String name;

    /**
     * Конструстор.
     * @param name Имя животного.
     */
    public Animal(final String name) {
        this.name = name;
    }

    /**
     * Подать голос.
     */
    public void makeSound() {
        System.out.println(
                String.format("%s say : %s", this.name, "beep")
        );
    }

    /**
     * Получить имя животного.
     * @return Имя.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Голодный питомец или нет.
     * @return true если голодный.
     */
    private boolean isHungry() {
        //todo добавить алгоритм вычисление состояния.
        return true;
    }
}
