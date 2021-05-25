package model;

public class etudiant {
	private String login;
	private String pass;
	private  int    id;
	
	public etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "etudiant [login=" + login + ", pass=" + pass + ", id=" + id + "]";
	}

	public etudiant(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}

	public etudiant(String login, String pass, int id) {
		super();
		this.login = login;
		this.pass = pass;
		this.id = id;
	}
	
	

}
