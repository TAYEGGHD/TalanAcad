import java.util.Scanner;
public class chaine {
public static void main(String[] args) {
        int nbr;
        String tmp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de chaines de caractere que vous souhaitez saisir : ");
        nbr = scanner.nextInt();
    
        String noms[] = new String[nbr];
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Entrez la liste des noms:");
    
        for(int i=0; i < nbr; i++)
        {
            noms[i] = scanner1.nextLine();
        }
        for (int i=0; i < nbr; i++) 
        {
            for (int j=i+1; j < nbr; j++) 
            {
                if (noms[i].compareTo(noms[j]) > 0) 
                {
                    tmp = noms[i];
                    noms[i] = noms[j];
                    noms[j] = tmp;
                }
            }
        }
        System.out.print("Liste de noms dans l'ordre trié est : ");
        for (int i=0; i < nbr-1; i++) 
        {
            System.out.print(noms[i] + ",");
        }
        System.out.print(noms[nbr - 1]);
    }
}