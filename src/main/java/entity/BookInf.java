package entity;

import java.util.ArrayList;

public class BookInf {
	private String isbn; // ISBN
	private String bookName;
	private int typeId;
	private String author;
	private String translator;
	private float price;
	private int page;
	private String publicationDate; // 出版日期:xx年/xx月
	private String press; // 出版社
	private int stock; // 库存
	private ArrayList<Book> entity;
	private BookType type;
	
	public BookInf(String isbn, String bookName, int typeId, String author, String translator, float price,
			int page, String publicationDate, String press, int stock) {
		super();
		this.isbn = isbn;
		this.bookName = bookName;
		this.typeId = typeId;
		this.author = author;
		this.translator = translator;
		this.price = price;
		this.page = page;
		this.publicationDate = publicationDate;
		this.press = press;
		this.stock = stock;
	}
	
	

	public BookType getType() {
		return type;
	}

	public void setType(BookType type) {
		this.type = type;
	}



	public ArrayList<Book> getEntity() {
		return entity;
	}

	public void setEntity(ArrayList<Book> entity) {
		this.entity = entity;
	}
	
	public void addEntity(Book book) {
		this.entity.add(book);
	}
	
	public void removeEntity(Book book) {
		this.entity.remove(book);
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "BookInf [isbn=" + isbn + ", bookName=" + bookName + ", typeId=" + typeId + ", author=" + author
				+ ", translator=" + translator + ", price=" + price + ", page=" + page + ", publicationDate="
				+ publicationDate + ", press=" + press + ", stock=" + stock + "]";
	}
	
}
