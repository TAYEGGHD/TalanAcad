package bibliothèque;

import java.util.ArrayList;

public class User {
	private int id;
	private String prenom;
	private String nom;
	private String adress;
	private int numTel;
	private String mail;
	ArrayList<Rent> tabRent = new ArrayList<Rent>();
	

	public User(int id, String prenom, String nom, String adress, int numTel, String mail, ArrayList<Rent> tabRent) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.adress = adress;
		this.numTel = numTel;
		this.mail = mail;
		this.tabRent = tabRent;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public int getNumTel() {
		return numTel;
	}


	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}

	public ArrayList<Rent> getTabRent() {
		return tabRent;
	}


	public void setTabRent(ArrayList<Rent> tabRent) {
		this.tabRent = tabRent;
	}


	@Override
	public String toString() {
		return "User [getId()=" + getId() + ", getPrenom()=" + getPrenom() + ", getNom()=" + getNom() + ", getAdress()="
				+ getAdress() + ", getNumTel()=" + getNumTel() + ", getMail()=" + getMail() + "]";
	}
	

}
