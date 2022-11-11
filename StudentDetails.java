package org.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDetails {
	
	@Id
	private String contactNuber;
	private String FastName;
	private String LastName;
	private String Email;
	private String password;
	private String DegreeYOP;
	private String Stream;
	private String DMarks;
	private String tweelthDiploma;
	private String YOP;
	private String dipMarks;
	private String course;
	private String Address;
	private String Address2;
	private String City;
	private String state;
	private String zip;
	
	
	public String getFastName() {
		return FastName;
	}
	public void setFastName(String fastName) {
		FastName = fastName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDegreeYOP() {
		return DegreeYOP;
	}
	public void setDegreeYOP(String degreeYOP) {
		DegreeYOP = degreeYOP;
	}
	public String getStream() {
		return Stream;
	}
	public void setStream(String stream) {
		Stream = stream;
	}
	public String getDMarks() {
		return DMarks;
	}
	public void setDMarks(String dMarks) {
		DMarks = dMarks;
	}
	public String getTweelthDiploma() {
		return tweelthDiploma;
	}
	public void setTweelthDiploma(String tweelthDiploma) {
		this.tweelthDiploma = tweelthDiploma;
	}
	public String getYOP() {
		return YOP;
	}
	public void setYOP(String yOP) {
		YOP = yOP;
	}
	public String getDipMarks() {
		return dipMarks;
	}
	public void setDipMarks(String dipMarks) {
		this.dipMarks = dipMarks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getAddress2() {
		return Address2;
	}
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getContactNuber() {
		return contactNuber;
	}
	public void setContactNuber(String contactNuber) {
		this.contactNuber = contactNuber;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	

}
