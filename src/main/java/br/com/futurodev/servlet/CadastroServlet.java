package br.com.futurodev.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Cadastro Servelt", urlPatterns = "/cadastro.do")
public class CadastroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("<h1>Usuário enviado com sucesso!</h1>");

        String nome = req.getParameter("nome");
        String  email = req.getParameter("email");
        String login = req.getParameter("login");
        String senha = req.getParameter("senha");
        String data = req.getParameter("data");

        writer.println("<ul>");
        writer.println("<li>Nome:" +nome+"</li>");
        writer.println("<li>Email: "+email +"</li>");
        writer.println("<li> Login:"+ login  +"</li>");
        writer.println("<li> Senha:"+ senha +"</li>");
        writer.println("<li>Data de cadastro "+data+"</li>");
        writer.println("</ul>");


    }
}
