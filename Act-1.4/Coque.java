public class Coque {

 public String materiaux;
 public String longueur;
 public static final int identifiant=2;
public Coque()
{
 this.materiaux="";
 this.longueur="";
}
public Bateau(String materiaux, int longueur,int identifiant)
{
 this.materiaux=materiaux;
 this.longueur=longueur;
}
public String getMateriaux() {
return materiaux;
} 
public void setMateriaux(String materiaux) {
 this.materiaux=materiaux;
}
public String getLongueur() {
 return longueur;
}
public void setLongueur(int longueur) {
 this.longueur=longueur;
}
}