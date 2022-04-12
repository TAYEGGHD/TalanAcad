package Streaming;

import java.util.ArrayList;

public class PlayListeUI {

  public static void main(String[] args) {
		
	MusiqueImpl music1 = new MusiqueImpl("music", "author", "interprete", "Hits1");
	MusiqueImpl music2 = new MusiqueImpl("music2","author2", "interprete2", "Hits2");
	MusiqueImpl music3 = new MusiqueImpl("music3", "author3", "interprete3", "Hits3");
	ArrayList<MusiqueImpl> list = new ArrayList<>() ;
		
	PlayListe PlayListe=new PlayListeImpl("My Hits", "Hits",5,list);
	list.add(music1);
	list.add(music2);
		
        PlayListe.ajouterUneMusiqueALaPlayliste(music3);
	PlayListe.afficherLesMusiquesDeLaPlayliste();
	}
   
}
