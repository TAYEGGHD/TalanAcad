public class Manga extends Livre {
    public Manga(){

    public Manga(String titre, String auteur, float prix, int nombreDePages) {
        super(titre, auteur, prix, nombreDePages);
}
    public void afficher(){
    super.afficher();
   System.out.println("se lit de droite vers la gauche, les mangas sont toujours en noir et blanc");
   }

}