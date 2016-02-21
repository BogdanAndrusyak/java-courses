package ru.lesson.lessons.clinic;

public class CatDog implements Pet {
    private final Cat cat;
    private final Dog dog;

    public CatDog(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    /**
     * {@inheritDoc}
     */
    public void makeSound() {
        this.cat.makeSound();
        this.dog.makeSound();
    }

    /**
     * {@inheritDoc}
     * @return Name.
     */
    public String getName() {
        return String.format("%s%s", this.cat.getName(), this.dog.getName());
    }
}
