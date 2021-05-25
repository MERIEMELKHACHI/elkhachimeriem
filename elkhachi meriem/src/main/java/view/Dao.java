package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.etudiant;
import model.livre;
import view.DBinteraction;
public class Dao extends DBinteraction {
	
	public Dao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
       public void ajouterEtudiant(etudiant e)
       {
    	   connect();
    	   String sql="insert into etudiant (login,pass) values('"+e.getLogin()+"','"+e.getPass()+"')";
    	   MAJ(sql);
    	   disconnect();
       }
       public etudiant authentification(String log,String pass)
       {
    	   etudiant e=null;
    	   connect();
    	   String sql="select * from etudiant where email ='"+log+"'and pass='"+pass+"'";
    	   ResultSet res =Select(sql);
    	   
    	   try {
			if (res.next()) {
				e=new etudiant();
				e.setLogin(res.getString(1));
				e.setPass(res.getString(2));
			}
		} catch (SQLException u) {
			// TODO: handle exception
		}
    	   disconnect();
		return e;
       }
       public void ajouterliVRE(livre l)
       {
    	   connect();
    	   String sql="insert into livre(titre,auture,type) values('"+l.getTitre()+"','"+l.getAuteur()+"','"+l.getType()+"')";
    	   MAJ(sql);
    	   disconnect();
       }
}
