import java.until.*;

public class Recette {
    String nom, description;
    int nivDiff;
    ArrayList<String> astuces = new ArrayList<>();
    ArrayList<String> etapes = new ArrayList<>();


    public Recette(String nom, String description, int niveaudedifficulte) {
        this.nom = nom;
        this.description = description;
        this.niveaudedifficulte = niveaudedifficulte;
    }

    public void addAstuce(String astuce) {
        astuces.add(astuce);
    }

    public void addEtape(String etape) {
        etapes.add(etape);
    }

}