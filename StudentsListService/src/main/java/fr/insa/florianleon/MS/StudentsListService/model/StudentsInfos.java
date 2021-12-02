package fr.insa.florianleon.MS.StudentsListService.model;

public class StudentsInfos {
	private int id;
	private String birthDate;
	private String lastName;
	private String firstName;
	
	public StudentsInfos(int id, String lastName, String firstName, String birthDate) {
		super();
		this.id = id;
		this.birthDate = birthDate;
		this.lastName = lastName;
		this.firstName = firstName;
	}
	

	public StudentsInfos() {
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

}
