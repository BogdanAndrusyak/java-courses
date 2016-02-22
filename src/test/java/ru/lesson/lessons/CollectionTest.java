package ru.lesson.lessons;

import org.junit.Test;
import ru.lesson.lessons.lesson_10.User;

import java.util.*;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * TODO: comment.
 */
public class CollectionTest {
    @Test
    public void arrayContains() {
        List<User> users = new ArrayList<User>();
        users.add(new User("1", "first"));
        users.add(new User("2", "second"));

        assertTrue(users.contains(new User("1", "first")));
    }

    /**
     * Зависимость {@link java.util.Set#add} от методов hashCode equals.
     */
    @Test
    public void setAdd() {
        Set<User> users = new HashSet<User>();
        users.add(new User("1", "first"));
        users.add(new User("2", "second"));

        assertEquals(2, users.size());
    }

    /**
     * Зависимость {@link java.util.Map#put} от методов hashCode equals.
     */
    @Test
    public void mapPut() {
        Map<User, User> users = new HashMap<User, User>();
        users.put(new User("1", "first"), new User("1", "first"));
        users.put(new User("2", "second"), new User("2", "second"));
        users.put(new User("1", "first"), new User("1", "first"));

        assertEquals(2, users.size());
    }
}
