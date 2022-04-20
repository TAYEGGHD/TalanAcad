package bibliothèque;

public class Rent {
	private int id;
	private User User;
	private Book Book;
	private String DatePret;
	private String DateFin;
	public Rent(int id, bibliothèque.User user, bibliothèque.Book book, String datePret, String dateFin) {
		super();
		this.id = id;
		User = user;
		Book = book;
		DatePret = datePret;
		DateFin = dateFin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return User;
	}
	public void setUser(User user) {
		User = user;
	}
	public Book getBook() {
		return Book;
	}
	public void setBook(Book book) {
		Book = book;
	}
	public String getDatePret() {
		return DatePret;
	}
	public void setDatePret(String datePret) {
		DatePret = datePret;
	}
	public String getDateFin() {
		return DateFin;
	}
	public void setDateFin(String dateFin) {
		DateFin = dateFin;
	}
	@Override
	public String toString() {
		return "Rent [getDatePret()=" + getDatePret() + "]";
	}
	

}
