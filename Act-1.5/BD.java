public class BD extends Livre{
   private boolean couleur;
   private String sensDeLecture;
   
 public BD(){
  this.couleur = true;
  this.sensDeLecture = "de gauche à droite"
  }

 public BD(String titre, String auteur, float prix, int nombreDePages, boolean couleur, boolean sensDeLecture){
  super(titre,auteur,prix,nombreDePages);
  this.couleur = couleur;
  this.sensDeLecture = sensDeLecture;
  }

 public void afficher(){
  
  super.afficher();
  if(couleur == true){
  System.out.println("les pages sont en couleur");
   }
  else{
  System.out.println("les pages sont en noir et blanc");
   }}
 
}