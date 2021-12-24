package com.example.addressbookapp.dto;

public class AddressBookDTO {
	private long id;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private long phoneNum;
	
	public AddressBookDTO(long id, String firstName, String lastName, String address, String city, long phoneNum) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.phoneNum = phoneNum;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	@Override
	public String toString() {
		return "AddressBookDTO [id=" + id +" firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", phoneNum=" + phoneNum + "]";
	}
}
