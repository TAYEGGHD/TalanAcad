package Streaming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lecteur {

	public static void main(String[] args) {
		File file= new File("Ma play list.doc");
		 BufferedReader bufferreader = null;
        try {
			FileReader fileReader=new FileReader(file);
			bufferreader = new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			System.err.printf("le fichier %s n'a pas été trouvé",file.toString());
			
		}
        try {
		try {
			bufferreader.close();
		} catch (IOException e) {
			System.err.printf("Impossible de fermer le fichier",file.toString());
		}
        } catch(NullPointerException e) {
        	System.err.printf("Impossible d'ouvrir le fichier",file.toString());}
	}
}
        


        
	
	
