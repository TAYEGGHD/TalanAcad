package Streaming;

import java.util.ArrayList;

public class PlayListeImpl implements PlayListe {
final int MAX_MUSIQUE=50;
private String nom;
private String genre;
private int nombreTitres;
ArrayList<MusiqueImpl> arraylist = new ArrayList<MusiqueImpl>();

	
	
public PlayListeImpl(String nom, String genre, int nombreTitres, ArrayList<MusiqueImpl> list) {
	super();
	this.nom = nom;
	this.genre = genre;
	this.nombreTitres = nombreTitres;
	this.arraylist = list;
}

	@Override
	public String toString() {
		return "PlayListeImpl [list=" + arraylist + "]";
	}
	@Override
	public void afficherPlayListe() {
	System.out.println(arraylist.toString());	
	}


	@Override
	public void Ajouter(MusiqueImpl music) {
		System.out.println(arraylist.size()) ;
		if (arraylist.size() < MAX_MUSIQUE)
		{
	arraylist.add(music);
		}
	else {
	 System.out.println("la playlist est charg�e");
	}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getNombreTitres() {
		return nombreTitres;
	}

	public void setNombreTitres(int nombreTitres) {
		this.nombreTitres = nombreTitres;
	}

	public ArrayList<MusiqueImpl> getArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getList() {
		// TODO Auto-generated method stub
		return null;
	}



}
