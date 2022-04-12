package Streaming;

public class MusiqueImpl implements Musique {
  private String titre;
  private String auteur;
  private String interprete;
  private String genre;

//Constructeur par défaut
public MusiqueImpl() {
  titre = "";
  auteur = "";
  interprete = "";
  genre = "";
}

  public MusiqueImpl(String titre, String auteur, String interprete, String genre) {
    this.titre = titre;
    this.auteur = auteur;
    this.interprete = interprete;
    this.genre = genre;
}
//********** ACCESSEURS **********
public String getTitre() {
 return titre;
}
public String getAuteur() {
 return auteur;
}
public String getInterprete() {
 return interprete;
}
public String getGenre(){
 return genre;
}
//********** MUTATEURS **********
public void setTitre(String titre)
{
titre = titre;
}
public void setAuteur(String auteur)
{
auteur = auteur;
}
public void setInterprete(String interprete)
{
interprete = interprete;
}
public void setGenre(String genre)
{
genre = genre;
}

@Override
public String toString() {
	return "MusiqueImpl [titre=" + titre + ", auteur=" + auteur + ", interprete=" + interprete + ", genre=" + genre+ "]";
}

@Override
public void afficherLaMusique (){ 
 System.out.println(toString());
}
@Override
public boolean verifierSiDeuxInstancesDeMusiqueSontEgales(MusiqueImpl music1,MusiqueImpl music2){
   boolean verifier=false;
if ((music1.getTitre().equals(music2.getTitre() )
 & music1.getAuteur().equals(music2.getAuteur() ) 
 & music1.getInterprete().equals(music2.getInterprete())
 & music1.getGenre().equals(music2.getGenre()) ))
    verifier=true;
 System.out.println("Les Deux Instances De Musique Sont Egales");
}

}