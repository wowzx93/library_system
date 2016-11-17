package entity;

import java.util.ArrayList;

public class User {
	private int UseId;
	private String UseName;
	private String UsePwd;
	private short UseStatus;
	private ArrayList<Borrow> books;

	public User(int useId, String useName, String usePwd, short useStatus) {
		super();
		UseId = useId;
		UseName = useName;
		UsePwd = usePwd;
		UseStatus = useStatus;
	}

	public User(String useName, String usePwd) {
		super();
		UseName = useName;
		UsePwd = usePwd;
	}

	
	
	public ArrayList<Borrow> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Borrow> books) {
		this.books = books;
	}
	
	public void borrowBooks(Borrow book) {
		this.books.add(book);
	}

	public void backBooks(Borrow book) {
		this.books.remove(book);
	}
	
	public String getUseName() {
		return UseName;
	}

	public void setUseName(String useName) {
		UseName = useName;
	}

	public String getUsePwd() {
		return UsePwd;
	}

	public void setUsePwd(String usePwd) {
		UsePwd = usePwd;
	}

	public short getUseStatus() {
		return UseStatus;
	}

	public void setUseStatus(short useStatus) {
		UseStatus = useStatus;
	}

	public int getUseId() {
		return UseId;
	}

	@Override
	public String toString() {
		return "UserDao [UseId=" + UseId + ", UseName=" + UseName + ", UsePwd=" + UsePwd + ", UseStatus=" + UseStatus
				+ "]";
	}

}
