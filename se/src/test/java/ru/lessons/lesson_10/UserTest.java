package ru.lessons.lesson_10;

import org.junit.Test;
import ru.lessons.lesson_10.User;

import static org.junit.Assert.*;

/**
 * Зависимость equals = true то hashCode = true.
 * Обратная зависимость несправедлива. hashCode = true то equals = ?
 */
public class UserTest {
    /**
     * x.equals(x)
     */
    @Test
    public void reflexive() {
        User pit = new User("1", "1");
        assertEquals(pit, pit);
    }

    /**
     * x.equals(y) y.equals(x)
     */
    @Test
    public void symmetric() {
        User pit = new User("1", "1");
        User dis = new User("1", "1");
        assertEquals(pit, dis);
        assertEquals(dis, pit);
    }

    /**
     * x.equals(y) y.equals(z) x.equals(z)
     */
    @Test
    public void transitive() {
        User pit = new User("1", "1");
        User dis = new User("1", "1");
        User max = new User("1", "1");
        assertEquals(pit, dis);
        assertEquals(dis, max);
        assertEquals(pit, max);
    }

    /**
     * multi x.equals(y) consistently
     */
    @Test
    public void consistent() {
        User pit = new User("1", "1");
        User dis = new User("1", "1");
        for (int i = 0; i != 10; ++i) {
            assertEquals(pit, dis);
        }
    }
}