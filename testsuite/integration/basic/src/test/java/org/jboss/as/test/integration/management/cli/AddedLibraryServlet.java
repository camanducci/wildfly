package org.jboss.as.test.integration.management.cli;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Stuart Douglas
 */
@WebServlet(urlPatterns = "/AddedLibraryServlet")
public class AddedLibraryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Added Library Servlet");
    }
}
