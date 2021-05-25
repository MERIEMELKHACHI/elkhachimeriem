package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import view.Dao;
import model.etudiant;
/**
 * Servlet implementation class inscrire
 */
@WebServlet("/inscrire")
public class inscrire extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public inscrire() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect(request.getContextPath() +"/src/main/webapp/login.jsp");
	}
	Dao  d=new Dao();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  String log,pass,op;
		  op=request.getParameter("btn");
	      log=request.getParameter("email");
	      pass=request.getParameter("pass");
	      if(op.equals("inscri")) {
	    	  etudiant e=new etudiant(log, pass);
		      d.ajouterEtudiant(e);
		      
	      }else if(op.equals("auto")) {
	    	  etudiant e=d.authentification(log, pass);
	    	  HttpSession s=request.getSession();
	    	  s.setAttribute("etd", e);
	    	  response.sendRedirect("accueil");
	    	 // PrintWriter out =response.getWriter();
	    	 // out.print(e.getLogin()+" et"+e.getPass());
	    	  //response.sendRedirect("");
	      }
	      
	      
		
		
	}}
	
	
	 