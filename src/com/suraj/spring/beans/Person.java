package com.suraj.spring.beans;

public class Person {

	private Integer personId;
	private String personName;
	private Passport passport;
	private Pancard pancard;
	
	public Integer getPersonId() {
		return personId;
	}
	
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public Passport getPassport() {
		return passport;
	}
	
	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public Pancard getPancard() {
		return pancard;
	}

	public void setPancard(Pancard pancard) {
		this.pancard = pancard;
	}
}
