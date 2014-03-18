package biblio;

public class DVD extends Media{
	private String actors;

	
	public DVD(String mediaType, String id, String mediaTitle, String year, String actors, String personNo) {
		super(id);
		this.mediaType = mediaType;
		this.mediaTitle = mediaTitle;
		this.year = year;
		this.actors = actors;	
		this.personNo = null; //no Person has borrowed media yet
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
