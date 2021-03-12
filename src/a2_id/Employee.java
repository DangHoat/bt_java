package a2_id;

import java.time.format.DateTimeFormatter;
import java.util.Date;

import utils.Utils;

public class Employee {
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String firstName;
	private String email;
	private String givenName;
	private String lastName;
	private String address;
	private String phone;
	private Date dob;
	private Gender gender;
	public String getAddress() {
		return address;
	}
	public Date getDob() {
		return dob;
	}
	public String getEmail() {
		return email;
	}
	public String getFirstName() {
		return firstName;
	}
	public Gender getGender() {
		return gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id+100;
	}
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) throws Exception {
		if(givenName.length()>35 ) throw new Exception("Chiêu dài không hợp lệ!!");
		this.givenName = givenName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) throws Exception {
		if(lastName.length()>35 ) throw new Exception("Chiều dài không hợp lệ!!");
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setFirstName(String firstName) throws Exception {
		if(firstName.length()>35 ) throw new Exception("Chiều dài không hợp lệ!!");
		this.firstName = firstName;
	}
	public void setEmail(String email) throws Exception {
		if(email.length()>200 || Utils.validateEmail(email) ) throw new Exception("Email không hợp lệ!!");
		this.email = email;
	}
	public void setAddress(String address) throws Exception {
		if(address.length()>1500 ) throw new Exception("Chiều dài không hợp lệ!!");
		this.address = address;
	}
	public void setDob(Date dob) throws Exception {
		if(dob.after(new Date(1900,1,1))) throw new Exception();
		this.dob = dob;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	} 

}
