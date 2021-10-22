package br.edu.infnet.model.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.edu.infnet.model.domain.Usuario;


public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private List<Usuario>lista;
    
    public UsuarioController() {
    	
       lista = new ArrayList<Usuario>();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("home.html").forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        Usuario usuario = new Usuario(request.getParameter("nome"), request.getParameter("email")); 	
		
	    lista.add(usuario);
	    
	    PrintWriter out = response.getWriter();
	    
	    
	    out.println(
	    		 "<!DOCTYPE html>"+
	    		 "<html>"+
	    		 "<head>"+
	    		 "<meta charset=\"ISO-8859-1\">"+
	    		 "<title>Confirmação</title>"+
	    		 "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">"+
	    		 "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">"+
	    	     "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>"+
	    		 "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>"+
	    		 "</head>"+
	    		 "<body>"+
	    		 "<form class=\"form-horizontal\"action=\"usuario\" method=\"get\">"+
	    		 "<h3>Usuario "+ usuario.getNome()+" </h3>"+
	    		 "    <div class=\"container\">"+
	    	     "    <div class=\"jumbotron\" style=\"background-color:gray clear\">"+
	    		 "    <div class=\"form-group\">"+
	    		 "	  <label class=\"control-label col-sm-20\">Usuario cadastrado com sucesso!</label>"+
	    		 "	</div>"+
	    	     "	<button type=\"submit\"class=\"btn btn-primary\">Voltar</button>"+
	    		 "    </div>"+
	    		 "</form>");
	    
	    out.println("<hr>");
	    out.println("<h5> Listagem de usuarios("+lista.size()+"):</h5>");

	    
	    for(Usuario a : lista) {
	    	
		    out.println("<h4> "+ a.getNome()+ "-" + a.getEmail()+"</h4>");
		    
	    }

	    out.println(
	    
	    "   </div>" +
	    	    "</body>"+
	    	    "</html>");
	    
	    
	    
	    
	    	    }
	    
	    

	}


