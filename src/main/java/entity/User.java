package entity;

import java.util.ArrayList;

public class User {
	private long userId;
	private String userName;
	private String userPwd;
	private short userStatus;
	private ArrayList<Borrow> books;

	public User(String userName, String userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}
	
	public User(){};

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public short getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(short userStatus) {
		this.userStatus = userStatus;
	}

	public ArrayList<Borrow> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Borrow> books) {
		this.books = books;
	}
	
	public void borrowBooks(Borrow book){
		books.add(book);
	}
	
	public void backBooks(Borrow book){
		books.remove(book);
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userStatus="
				+ userStatus + ", books=" + books + "]";
	}

	
}
