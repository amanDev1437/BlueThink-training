package com.aman.learnjsp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        String password = req.getParameter("password");

        Login login = new Login();

        login.setName(name);
        login.setPassword(password);

        req.setAttribute("login",login);

        boolean status = login.validate();

        if(status){
            RequestDispatcher rd = req.getRequestDispatcher("loginSuccess.jsp");
            rd.forward(req, res);
        }else {
            RequestDispatcher rd = req.getRequestDispatcher("loginError.jsp");
            rd.forward(req,res);
        }
    }

}