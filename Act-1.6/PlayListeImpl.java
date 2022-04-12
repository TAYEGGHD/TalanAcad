package Streaming;

public class PlayListeImpl implements PlayListe {
 final int MAX_MUSIQUES = 10;
 private String nom;
 private String genre;
 private int nombreTitres;
 ArrayList<MusiqueImpl> list = new ArrayList<MusiqueImpl>();


//Constructeur par défaut
  public PlayListeImpl(){
    System.out.println("PlayListe");
    nom = "Inconnu";
    genre = "Inconnu";
    nombreTitres = 0;
    
  }

  public PlayListeImpl(int MAX_MUSIQUES, String nom, String genre, int nombreTitres, ArrayList<MusiqueImpl> list){
    super();
    this.nom = nom;
    this.genre = genre;
    this.nombreTitres = nombreTitres;
    this.list = list; 
}

//********** ACCESSEURS **********
public String getNom() {
 return nom;
}
public String getGenre() {
 return genre;
}
public int getNombreTitres() {
 return nombreTitres;
}
//********** MUTATEURS **********
public void setNom(String nom)
{
nom = nom;
}
public void setGenre(String genre)
{
genre = genre;
}
public void setNombreTitres(int nombreTitres)
{
nombreTitres = nombreTitres;
}
@Override
	public String toString() {
		return "PlayListeImpl [list=" + list + "]";
}
@Override
public void afficherLesMusiquesDeLaPlayliste (){ 
 System.out.println(list.toString());
}

@Override
public void ajouterUneMusiqueALaPlayliste(MusiqueImpl music){
    System.out.println(list.size()) ;
    if (list.size() < MAX_MUSIQUE)
		{
     list.add(music);
		}
     else {
	 System.out.println("la playlist est chargée");
}
}

}