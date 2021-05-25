package controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.etudiant;
import model.livre;

/**
 * Servlet implementation class accuiel
 */
@WebServlet("/accuiel")
public class accuiel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public accuiel() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  PrintWriter out =response.getWriter();
    	  HttpSession s=request.getSession();
    	  
         etudiant e=(etudiant)s.getAttribute("etd");
  	      out.print("bienvenu "+e.getLogin()+" et"+e.getPass()); 
  	    livre l=(livre)s.getAttribute(" ");
	      out.print("bienvenu "+l.getTitre()+" et"+l.getAuteur()+"et"+l.getType()); 
  	      
	
	}
  	      

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
