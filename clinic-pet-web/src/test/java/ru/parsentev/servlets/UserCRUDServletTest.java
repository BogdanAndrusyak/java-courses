package ru.parsentev.servlets;

import org.junit.Test;
import org.mockito.Mockito;
import ru.parsentev.store.UserCache;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * TODO: comment.
 */
public class UserCRUDServletTest extends Mockito {
    final UserCache cache = UserCache.getInstance();

    @Test
    public void createUser() throws ServletException, IOException {

        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        when(request.getParameter("login")).thenReturn("test");
        when(request.getParameter("email")).thenReturn("test");

        assertTrue(cache.values().isEmpty());

        new UserCreateServlet().doPost(request, response);

        verify(request, atLeast(1)).getParameter("login");
        verify(request, atLeast(1)).getParameter("email");
        assertFalse(cache.values().isEmpty());

        cache.delete(cache.findByLogin("test").getId());
    }
}
