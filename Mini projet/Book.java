package bibliothèque;

public class Book {
	//variables d'instances
  private int id;
  private String title;
  private String author;
  private String editor;
  private int pageNb;
  private String summary;
  private Library Library;
  


public Book(int id, String title, String author, String editor, int pageNb, String summary,
		bibliothèque.Library library) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
	this.editor = editor;
	this.pageNb = pageNb;
	this.summary = summary;
	Library = library;
}



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getTitle() {
	return title;
}



public void setTitle(String title) {
	this.title = title;
}



public String getAuthor() {
	return author;
}



public void setAuthor(String author) {
	this.author = author;
}



public String getEditor() {
	return editor;
}



public void setEditor(String editor) {
	this.editor = editor;
}



public int getPageNb() {
	return pageNb;
}



public void setPageNb(int pageNb) {
	this.pageNb = pageNb;
}



public String getSummary() {
	return summary;
}



public void setSummary(String summary) {
	this.summary = summary;
}



public Library getLibrary() {
	return Library;
}



public void setLibrary(Library library) {
	Library = library;
}



@Override
public String toString() {
	return "Book [getId()=" + getId() + ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor() + ", getEditor()="
			+ getEditor() + ", getPageNb()=" + getPageNb() + ", getSummary()=" + getSummary() + ", getLibrary()="
			+ getLibrary() + "]";
}



}