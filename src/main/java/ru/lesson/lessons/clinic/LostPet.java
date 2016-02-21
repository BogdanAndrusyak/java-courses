package ru.lesson.lessons.clinic;

/**
 * Описывает потерянного питомца.
 */
public abstract class LostPet {
    /**
     * Опасен питомец или нет.
     * @return true если опасен.
     */
    public boolean isDanger() {
        return true;
    }

    /**
     * Вернуть адрес, где поймали питомца.
     * @return Адрес.
     */
    abstract String getWhereCatch();
}
