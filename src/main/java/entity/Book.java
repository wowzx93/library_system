package entity;

public class Book {
	private int bookId;
	private String isbn;
	private short status;
	private String position;
	private BookInf bookInfo;
	
	
	public Book(int bookId, String isbn, short status, String position) {
		super();
		this.bookId = bookId;
		this.isbn = isbn;
		this.status = status;
		this.position = position;
	}

	public Book(String isbn, String position) {
		super();
		this.isbn = isbn;
		this.position = position;
	}

	public int getbookId() {
		return bookId;
	}

	public void setbookId(int bookId) {
		this.bookId = bookId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public BookInf getBookIndo() {
		return bookInfo;
	}

	public void setBookIndo(BookInf bookInfo) {
		this.bookInfo = bookInfo;
	}

}
