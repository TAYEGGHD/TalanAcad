package Streaming;

import java.util.Comparator;

public class MusiqueImpl implements Musique {
private String titre;
private String autheur;
private String interprete;
private String genre;

public MusiqueImpl(String titre, String autheur, String interprete, String genre) {
	this.titre = titre;
	this.autheur = autheur;
	this.interprete = interprete;
	this.genre = genre;
}

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}

public String getAutheur() {
	return autheur;
}

public void setAutheur(String autheur) {
	this.autheur = autheur;
}

public String getInterprete() {
	return interprete;
}

public void setInterprete(String interprete) {
	this.interprete = interprete;
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}


@Override
public String toString() {
	return "MusiqueImpl [titre=" + titre + ", autheur=" + autheur + ", interprete=" + interprete + ", genre=" + genre + "]";
}

@Override
public void afficherMusique () { 
 	System.out.println(toString());
}

@Override
public Boolean Verifier(MusiqueImpl music1,MusiqueImpl music2) {
	Boolean verif = false;
if (music1.getTitre().equals(music2.getTitre()) & music1.getAutheur().equals(music2.getAutheur())  & music1.getInterprete().equals(music2.getInterprete()) & music1.getGenre().equals(music2.getGenre()));
{	 
verif = true; 
	 System.out.println("les deux titres sont �gaux");
}
return verif;
}


//Comparator pour le tri par ordre croissant

public static Comparator<MusiqueImpl> ComparatorTitreCroissant = new Comparator<MusiqueImpl>() {

	@Override
	public int compare(MusiqueImpl e1, MusiqueImpl e2) {
		return e1.getTitre().compareTo(e2.getTitre());
	}
};

// Comparator pour le tri par ordre d�croissant

public static Comparator<MusiqueImpl> ComparatorTitreDecroissant = new Comparator<MusiqueImpl>() {

	@Override
	public int compare(MusiqueImpl e1, MusiqueImpl e2) {
		return e2.getTitre().compareTo(e1.getTitre());
	}
};

}
