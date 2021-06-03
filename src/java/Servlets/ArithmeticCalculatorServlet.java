package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 809611
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("firstnum");
        String second = request.getParameter("secondnum");

        request.setAttribute("firstNum", first);
        request.setAttribute("secondNum", second);

        if (first.isEmpty() || second.isEmpty()) {
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        } else {
            try {
                int firstNumber = Integer.parseInt(first);
                int secondNumber = Integer.parseInt(second);
                String op = request.getParameter("operation");
                switch (op) {
                    case "+":
                        request.setAttribute("result", firstNumber + secondNumber);
                        break;

                    case "-":
                        request.setAttribute("result", firstNumber - secondNumber);
                        break;

                    case "*":
                        request.setAttribute("result", firstNumber * secondNumber);
                        break;

                    case "%":
                        request.setAttribute("result", firstNumber % secondNumber);
                        break;
                }
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            } catch (NumberFormatException e) {
                request.setAttribute("result", "invalid");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
        }
    }
}
