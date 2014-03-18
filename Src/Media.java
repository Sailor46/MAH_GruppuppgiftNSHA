package biblio;

public abstract class Media {
	//fields

	protected String id;
	protected String year;
	protected String mediaType;
	protected String mediaTitle;
	protected String edition;
	protected String personNo;
	
	// constructor
	public Media(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public boolean equals(Object obj) {
		Media media = (Media)obj;
		return id.equals(media.getId());
	}

	public Object getPerson() {
		return null;
	}

	public void setPerson(Person p1) {
		
	}

	public Object getPersonNo() {
		// TODO Auto-generated method stub
		return null;
	}

}