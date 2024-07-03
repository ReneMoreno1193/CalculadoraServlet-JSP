package cl.praxis.desafioevaluado3servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Calculadora", value = "/Calculadora")
public class Calculadora extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        float number1 = Float.parseFloat(request.getParameter("number1"));
        float number2 = Float.parseFloat(request.getParameter("number2"));
        String option = request.getParameter("operator");
        response.getWriter().append(calculator(number1, number2, option));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    public String calculator(float number1, float number2, String operator) {
        switch (operator) {
            case "1":
                return "La suma es: " + (int)(number1 + number2);
            case "2":
                return "La resta es: " + (int)(number1 - number2);
            case "3":
                return "La multiplicacion es: " + (int)(number1 * number2);
            case "4":
                if (number2 == 0) {
                    return "No es posible dividir por cero";
                }
                return "La división es: " + (number1 / number2);
            case "5":
                int menor = (int) Math.min(number1, number2);
                int mayor = (int) Math.max(number1, number2);
                return "Los numeros ordenados son: " + menor + ", " + mayor;
            case "6":
                int numero1 = (int) number1;
                int numero2 = (int) number2;
                if (number1 % 2 == 0 && number2 % 2 == 0) {
                    return numero1 + " y " + numero2 + " son pares";
                } else if (number1 % 2 == 0 && number2 % 2 == 1) {
                    return numero1 + " es par y " + numero2 + " es impar";
                } else if (number1 % 2 == 1 && number2 % 2 == 0) {
                    return numero1 + " es impar y " + numero2 + " es par";
                } else {
                    return numero1 + " y " + numero2 + " son impares";
                }
            default:
                return "Opción invalida";
        }
    }
}
