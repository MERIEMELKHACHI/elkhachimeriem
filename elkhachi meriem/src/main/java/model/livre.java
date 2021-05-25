package model;

public class livre {
	
	public int id ;
	public String titre;
	public String auteur;
	public String type ;
	
	public livre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public livre(int id, String titre, String auteur, String type) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.type = type;
	}

	@Override
	public String toString() {
		return "livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + ", type=" + type + "]";
	}
	
	
	

}
