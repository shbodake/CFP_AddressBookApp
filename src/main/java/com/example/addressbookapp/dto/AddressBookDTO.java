package com.example.addressbookapp.dto;

import javax.validation.constraints.Pattern;

public class AddressBookDTO {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\$]{2,}$",message = "Firstname is Invalid")
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public long phoneNum;
	
	public AddressBookDTO(String firstName, String lastName, String address, String city, long phoneNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "AddressBookDTO [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", phoneNum=" + phoneNum + "]";
	}
}
