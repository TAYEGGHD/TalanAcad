package bibliothèque;

import java.util.ArrayList;

public class Library {
	private int id;
	private String name;
	private String adress;
	private int numTel;
	ArrayList<Book> tabBook = new ArrayList<Book>();
	ArrayList<Rent> tabRent = new ArrayList<Rent>();
	public Library(int id, String name, String adress, int numTel, ArrayList<Book> tabBook, ArrayList<Rent> tabRent) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
		this.numTel = numTel;
		this.tabBook = tabBook;
		this.tabRent = tabRent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getNumTel() {
		return numTel;
	}
	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}
	public ArrayList<Book> getTabBook() {
		return tabBook;
	}
	public void setTabBook(ArrayList<Book> tabBook) {
		this.tabBook = tabBook;
	}
	public ArrayList<Rent> getTabRent() {
		return tabRent;
	}
	public void setTabRent(ArrayList<Rent> tabRent) {
		this.tabRent = tabRent;
	}



}



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}



	public int getNumTel() {
		return numTel;
	}



	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}



	public ArrayList<String> getTabBook() {
		return tabBook;
	}



	public void setTabBook(ArrayList<String> tabBook) {
		this.tabBook = tabBook;
	}



	public ArrayList<String> getTabRent() {
		return tabRent;
	}



	public void setTabRent(ArrayList<String> tabRent) {
		this.tabRent = tabRent;
	}

}
