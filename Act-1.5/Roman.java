public class Roman extends Livre{

   private int NbChapitre;
   private String description;

  public Roman(){
   

  }

 public Roman(String titre, String auteur, float prix, int nombreDePages){
   super(titre,auteur,prix,nombreDePages);
   /* this.NbChapitre = NbChapitre;
   this.description = description; */
   }

 public int getNbChapitre(){
   return NbChapitre;
   }

 public void setNbChapitre(int NbChapitre){
   this.NbChapitre = NbChapitre;
   }
 
 public String getDescription(){
   return description ;
   }

 public void setDescription(String description){
  this.description = description;
   }

 public String toString(){
   return "le nbre de chapitres est : "+this.NbChapitre + " et la description est : "+this.description;
  }

}
  