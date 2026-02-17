/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.rmi.server.Dispatcher;
import za.ac.tut.model.ArithmeticLogic;

/**
 *
 * @author castr
 */
public class ArithmeticServlet extends HttpServlet {
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String sign = request.getParameter("sign");
        ArithmeticLogic al= new ArithmeticLogic();
        al.setNum1(num1);
        al.setNum2(num2);
        al.setSign(sign);
        
        int total=al.calculate();
        
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("total", total);
        request.setAttribute("sign", sign);
        
        RequestDispatcher disp= request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);
        
    }

    
}
