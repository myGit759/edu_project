package phoneBook;

public class PhoneBook {
	
	private int idx;
	private String name;
	private String fNumber;
	private String sNumber;
	private String thNumber;
	
	public PhoneBook() {
		// TODO Auto-generated constructor stub
	}
	public PhoneBook(int idx, String name, String fNumber, String sNumber, String thNumber) {
		super();
		this.idx= idx;
		this.name = name;
		this.fNumber = fNumber;
		this.sNumber = sNumber;
		this.thNumber = thNumber;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getfNumber() {
		return fNumber;
	}
	public void setfNumber(String fNumber) {
		this.fNumber = fNumber;
	}
	public String getsNumber() {
		return sNumber;
	}
	public void setsNumber(String sNumber) {
		this.sNumber = sNumber;
	}
	public String getThNumber() {
		return thNumber;
	}
	public void setThNumber(String thNumber) {
		this.thNumber = thNumber;
	}
	

}
