package project02;

abstract class Book {
	
	private int number;
	private String title;
	private String author;
	private static int noOfBooks = 0;
	
	public Book(String title, String author) {
		this.title = title;
		this.author =author;
		noOfBooks++;
	}
	
	void settitle(String a){
		title = a;
	}
	
	String gettitle() {
		return title;
	}
	
	void setauther(String b) {
		author = b;
	}
	
	String getauther(){
		return author;
	}
	
	int getnumber() {
		return noOfBooks;
	}
	
	@Override
	public boolean equals(Object o) {
		Book otherBook = (Book)o;
		if (otherBook.author == this.author && otherBook.title == this.title)
			return true;
		else
			return false;
	}
	/** public boolean equals(Object o) {
	Book otherBook = (Book)o;
	if (equals(otherBook.author) == equals(this.author) && equals(otherBook.title) == equals(this.title))
		return true;
	else
		return false;
}*/
	
	abstract int getLateFee(int lateDays);
	
	public String toString() {
		return "제목 : " + this.title + ", 책의 저자 : " + this.author;
	}
}

class ScienceFiction extends Book{
	
	public ScienceFiction(String title, String author) {
		super(title, author);
	}

	public int getLateFee(int lateDays){
		int LateFee = 600 * lateDays;
		return LateFee;
	}
	
}

class Poet extends Book{
	
	public Poet(String title, String author) {
		super(title, author);
	}

	public int getLateFee(int lateDays){
		int LateFee = 200 * lateDays;
		return LateFee;
	}
	
}

class Novel extends Book{
	
	public Novel(String title, String author) {
		super(title, author);
	}

	public int getLateFee(int lateDays){
		int LateFee = 300 * lateDays;
		return LateFee;
	}
	
}
