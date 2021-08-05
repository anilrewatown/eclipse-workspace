package streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test4 {
	
	
	public static void main(String[] args) {
		
		
		
		
	}

	public static Map<Author,List<Book>> groupBooksByAuthor(Library lib) {
		  Map<Author, List<Book>> map = new HashMap<Author, List<Book>>();

		  List<Book> book = lib.getBook();

		for(Book b : book) {
			if(map.containsKey(b.getAuther())) {
				List<Book> li=map.get(b.getAuther());
				li.add(b);
				map.put(b.getAuther(), li);
			}
			else {
				List<Book> bookList = new ArrayList<Book>();
				bookList.add(b);
				map.put(b.getAuther(), bookList);
			}
		}
		
		return map;
	}
	
}


class Library{
	
	private List<Book> book;

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	
}


class Book{
	
	private String bookName;
	private Author auther;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Author getAuther() {
		return auther;
	}
	public void setAuther(Author auther) {
		this.auther = auther;
	}
	
	
	
}

class Author{
	
	private String authorName;
	private List<Address> address;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		return true;
	}
	
	
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	
	
}

class Address{
	
	private String city;
	private Long pincode;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
	
	
}