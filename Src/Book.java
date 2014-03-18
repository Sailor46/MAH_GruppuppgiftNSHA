package biblio;

public class Book extends Media{
	private String author;

	
	public Book(String mediaType, String id, String author, String mediaTitle, String year, String personNo) {
		super(id);
		this.mediaType = mediaType;
		this.mediaTitle = mediaTitle;
		this.author = author;
		this.mediaTitle = mediaTitle;
		this.year = year;	
		this.personNo = null; //initialize as available by setting to null
	}

	public String getPersonNo()	{
		return personNo;
	}
	
	public void setPersonNo(String personNo)	{
		this.personNo = personNo;
	}
	
	public String getId() {
		return id;
	}
	
	public boolean equals(Object obj) {
		Media media = (Media)obj;
		return id.equals(media.getId());
	}
	
}
