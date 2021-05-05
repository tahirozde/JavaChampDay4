package Users;

import java.sql.Date;

public class Player {
	private int id;
	private String firstName;
	private String lastName;
	private String nationaltyId;
	private Date dateOfBirt;
	private String userName;
	private String password;
	
	public Player(int id, String firstName, String lastName, String nationaltyId, Date dateOfBirt, String userName,
			String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationaltyId = nationaltyId;
		this.dateOfBirt = dateOfBirt;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}

	public Date getDateOfBirt() {
		return dateOfBirt;
	}

	public void setDateOfBirt(Date dateOfBirt) {
		this.dateOfBirt = dateOfBirt;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
