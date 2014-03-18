package biblio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Controller {
	// fields
//	private String name;
	private ArrayList<Book> books;
	private ArrayList<DVD> dvds;
	static TreeMap<String, Person> people;
	private Newframe viewer;
	private String testlist = ("<Insert list here>"); //just a test String

	// constructor
	public Controller(String personFile) {
//		
//		String bookFile, String dvdFile, 
		
		people = Controller.readPerson(personFile);
		Newframe userwindow = new Newframe();
		userwindow.showMediaList(testlist);
		
//		ArrayListbooks = new ArrayList<Book>();
//		dvds = new ArrayList<DVD>();
		
	}

//	public String getName() {
//		return name;
//	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public TreeMap<String, Person> getPeople() {
		return people;
	}
	
	public ArrayList<DVD> getDVDs() {
		return dvds;
	}

	public void addBook(Book b1) {
		this.books.add(b1);
	}

	public void removeBook(Book b1) {
		this.books.remove(b1);
	}

//	public void addPerson(Person p1) {
//		this.people.add(p1);
//	}
//
//	public void removePerson(Person p1) {
//		this.people.remove(p1);
//	}

	public boolean checkOut(Book b1, Person p1) {
		int booksOut = this.getMediaList(p1).size();
		if ((b1.getPerson() == null) && (booksOut < p1.getMaximumBooks())) {
			b1.setPerson(p1);
			return true;
		} else {
			return false;
		}
	}

	public boolean checkIn(Book b1) {
		if (b1.getPersonNo() != null) {
			b1.setPersonNo(null);
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<Book> getMediaList(Person p1) {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book aBook : this.getBooks()) {
			if ((aBook.getPersonNo() != null && (aBook.getPersonNo()
					.equals(p1.getPersonNo()))))
				result.add(aBook);
		}

		return result;
	}

	public ArrayList<Book> getAvailableBooks() {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book aBook : this.getBooks()) {
			if (aBook.getPersonNo() == null)	{
				result.add(aBook);
			}
		}
		return result;
	}
	
	public ArrayList<Book> getUnavailableBooks()	{
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book aBook : this.getBooks()) {
			if (aBook.getPersonNo() != null)	{
				result.add(aBook);
			}
		}
		return result;
	}
	
	public static TreeMap<String, Person> readPerson(String filename) {
		TreeMap<String, Person> map = new TreeMap<String, Person>();
		String[] people;
		String str;
		Person person;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(filename), "ISO-8859-1"));
			
			while ((str = br.readLine()) != null) {
				people = str.split(";");
				person = new Person (people[0], people[1], people[2]);
				map.put(people[0], person); //nyckel = personNo
											//value = person object (personNo, namn, phone)
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		return map;
	}
	
	  
	public String toString()	{
		return
	this.getBooks().size() + " books; " + books +
				this.getPeople().size() + " people. " + people;
	}
	
	public static void main(String[] args) {
		Controller c = new Controller("/Users/Strecket/Desktop/resources/Lantagare.txt");
		System.out.println(people);
		

	}
}
