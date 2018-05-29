package co.grandcircus.coffeeshopapp.entity;

import java.io.Serializable;

public class Person implements Serializable {

	public enum Gender {OTHER, FEMALE, MALE}
	
	private static final long serialVersionUID = 1L;
	
	private Long customerId;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	private String birthDate;
	private Gender userGender;
	private String pWord;

	public Person() {
	}

	public Person(Long customerId, String firstName, String lastName, String emailAddress, String phoneNumber, String birthDate, Gender userGender, String pWord) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
		this.userGender = userGender;
		this.pWord = pWord;
	}
	
	public Person(Long customerId, String firstName, String lastName, String emailAddress, String phoneNumber, String birthDate, Gender userGender) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
		this.userGender = userGender;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public Gender getUserGender() {
		return userGender;
	}
	
	public void setUserGender(Gender userGender) {
		this.userGender = userGender;
	}
	
	public String getPWord() {
		return pWord;
	}

	public void setPWord(String pWord) {
		this.pWord = pWord;
	}

	@Override
	public String toString() {
		switch(this.userGender) {
		
		case OTHER:
			if (getUserGender() == Person.Gender.OTHER) {
				return "OTHER";
			}
			break;
		
		case FEMALE:
			if (getUserGender() == Person.Gender.FEMALE) {
				return "FEMALE";
			}
			break;
		
		case MALE:
			if (getUserGender() == Person.Gender.MALE) {
				return "MALE";
			}
			break;
		
		default: break;
		} return null;
	} 
}
