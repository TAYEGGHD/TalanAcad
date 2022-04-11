package bibliotheque;

public class Main{
   public static void main(String[] args) {

        Livre l1 = new Livre("Le petit prince","St Exupéry",10.40, 50) ;
        Livre l2 = new Livre("Contes","Grimm", 14.40, 254) ;
        l1.afficher();
        l2.afficher();
     
        BD b1 = new BD("Lucky Luke","Morris", 10.40, 45, true);
        b1.afficher() ;

        
        Manga m2 = new Manga("Death Note","Tsugumi Oba",7.40, 75) ;
        m2.Afficher() ;

        Roman r1 = new Roman("Dora","Dora", 300, 3.5) ;
        r1.setNbChapitre(12);
        r1.setDescription("Une description quelconque");

        LivreRecette lrc1 = new LivreRecette("Marmiton", "Philippe Etchebest", 15.98, 110);
        Recette rc1 = new Recette("Les pâtes crues", "Comment réaliser de délicieuses pâtes crues.", 3);
        rc1.addAstuce("Ne pas les faire cuire.");
        rc1.addEtape("Sortir les pâtes de leur emballage");
        lrc1.addRecette(rc1);
     }

}
 