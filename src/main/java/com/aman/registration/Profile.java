package com.aman.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Profile", value = "/profile")

public class Profile extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        req.getRequestDispatcher("link.html").include(req,res);

        HttpSession session = req.getSession(false);

        if(session!=null){
            String userName = (String) session.getAttribute("userName");
            out.println("<h1>Hello "+userName+", Welcome to your Profile</h1>");
        }else {
            out.println("<h1>Please login first</h1>");
            req.getRequestDispatcher("login.html").include(req,res);
        }
    }
}
