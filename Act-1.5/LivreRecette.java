import java.util.*;

public class LivreRecette extends Livre {
    ArrayList<Recette> recettes = new ArrayList<>();
    public LivreRecette(String titre, String auteur, float prix, int nombreDePages) {
        super(titre, auteur, prix, nombreDePages);
    }

    public void addRecette(Recette recette) {
        recettes.add(recette);
    }
}
