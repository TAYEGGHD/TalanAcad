public class Livre {
   private String titre;
   private String auteur;
   private float prix;
   private int nombreDePages;
   private String genre;
public Livre(String titre,String auteur,float prix,int nombreDePages,String genre){
this.titre=titre;
this.auteur=auteur;
this.prix=prix;
this.nombredepages=nombreDePages;
this.genre=genre;
}
public void afficher(){
        System.out.println("Titre  : " + this.titre);
        System.out.println("Auteur : " + this.auteur);
        System.out.println("Prix: " + this.prix);
        System.out.println("Nombre de pages : " + this.nombreDePages);
        System.out.println("------------------------");
 
   }
}
   