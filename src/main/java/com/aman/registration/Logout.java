package com.aman.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Logout", value = "/logout")

public class Logout extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        req.getRequestDispatcher("link.html").include(req,res);
        HttpSession session = req.getSession();
        session.invalidate();
        out.println("<h1>You are logged out</h1>");
    }
}
