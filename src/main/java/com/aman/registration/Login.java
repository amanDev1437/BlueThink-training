package com.aman.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login", value = "/login")

public class Login extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        req.getRequestDispatcher("link.html").include(req,res);

        if(password.equals("Aman@123")){
            out.println("<h1>Welcome:"+userName+"</h1>");
            HttpSession session = req.getSession();
            session.setAttribute("userName",userName);
        }else {
            out.println("<h1>Sorry Wrong Password");
            req.getRequestDispatcher("login.html").include(req,res);
        }
    }
}
