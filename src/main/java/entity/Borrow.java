package entity;

import java.util.Date;

public class Borrow {
	private int book_id;
	private int user_id;
	private Date borrowTime;
	private Date backtime;
	private short status;
	private Book book;
	private User user;

	public Borrow(int book_id, int user_id, Date borrowTime, Date backtime, short status) {
		super();
		this.book_id = book_id;
		this.user_id = user_id;
		this.borrowTime = borrowTime;
		this.backtime = backtime;
		this.status = status;
	}

	public Borrow(int book_id, int user_id, Date borrowTime, Date backtime) {
		super();
		this.book_id = book_id;
		this.user_id = user_id;
		this.borrowTime = borrowTime;
		this.backtime = backtime;
	}
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Date getBorrowTime() {
		return borrowTime;
	}

	public void setBorrowTime(Date borrowTime) {
		this.borrowTime = borrowTime;
	}

	public Date getBacktime() {
		return backtime;
	}

	public void setBacktime(Date backtime) {
		this.backtime = backtime;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Borrow [book_id=" + book_id + ", user_id=" + user_id + ", borrowTime=" + borrowTime + ", backtime="
				+ backtime + ", status=" + status + "]";
	}
	
}
