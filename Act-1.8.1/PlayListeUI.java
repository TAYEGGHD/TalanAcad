package Streaming;

import java.util.ArrayList;
import java.util.Collections;

public class PlayListeUI {
	public static void main(String[] args) {
     ArrayList<MusiqueImpl> arraylist = new ArrayList<MusiqueImpl>();
     ArrayList<PlayListeImpl> arrayPlayListe = new ArrayList<PlayListeImpl>();

		arraylist.add(new MusiqueImpl("titre1", "autheur1", "interprete1", "genre1"));
		arraylist.add(new MusiqueImpl("titre2", "autheur2", "interprete2", "genre2"));
		arraylist.add(new MusiqueImpl("titre3", "autheur3", "interprete3", "genre3"));
		arraylist.add(new MusiqueImpl("titre4", "autheur4", "interprete4", "genre4"));
		arraylist.add(new MusiqueImpl("titre5", "autheur5", "interprete5", "genre5"));	
		
		
		rechercherMusiqueParTitre(arraylist,"titre1");
		rechercherMusiqueParAutheur(arraylist,"titre2");
		SupprimerMusique(arraylist,"titre1");
		
				// Affichage playliste dans l'ordre croissant
							Collections.sort(arraylist, MusiqueImpl.ComparatorTitreCroissant);
							System.out.println("Affichage de la playliste ordonnée par titre dans l'ordre croissant : ");  
							for (MusiqueImpl e:arraylist) { 
								System.out.println(e);
							}
				
		        // Affichage playliste dans l'ordre décroissant
		         		Collections.reverse(arraylist);
		         		System.out.println("Affichage de la playliste ordonnée dans l'ordre décroissant par titre : ");
		         	
		         		
		                 
				User user = new User("Inconnu", "Inconnu", "Inconnu", arrayPlayListe);
					System.out.println("L'utilisateur " + user.getNom() + " " + user.getPrenom() + " a ses playlistes suivantes avec chacune ses musiques ");
					for (PlayListeImpl playListeImpl1 : arrayPlayListe) {
						System.out.println("* Play liste : " + playListeImpl1.getNom() + " " + playListeImpl1.getGenre() + " avec ses musiques suivantes : ");
						ArrayList<MusiqueImpl> arrayMusiques = playListeImpl1.getArray();
						for (MusiqueImpl musiqueImpl : arrayMusiques) {
							System.out.println(" - Musique : " + musiqueImpl.getTitre() + " de l'autheur : " + musiqueImpl.getAutheur());
						}
				}
							
				
				
	}
	// Rechercher la musique par titre
	private static MusiqueImpl rechercherMusiqueParTitre(ArrayList<MusiqueImpl> array, String titre) {
		for (MusiqueImpl musiqueImpl : array) {
			if (musiqueImpl.getTitre().equals(titre)) {
				return musiqueImpl;
			}
		}
		return null;
	}
	// Rechercher la musique par autheur
	private static MusiqueImpl rechercherMusiqueParAutheur(ArrayList<MusiqueImpl> array, String autheur) {
		for (MusiqueImpl musiqueImpl : array) {
			if (musiqueImpl.getTitre().equals(autheur)) {
				return musiqueImpl;
			}
		}
		return null;
	}
	// Supprimer une musique d'une Playlist
	public static void SupprimerMusique(ArrayList<MusiqueImpl> playlist, String Musique1) {
		for(MusiqueImpl m: playlist) {
		if(m.getTitre().equals(Musique1)) {
		playlist.remove(m);
		break;
		}
		}
		}
	
	       
	}