package com.example.addressbookapp.model;

import com.example.addressbookapp.dto.AddressBookDTO;

public class AddressBookData {
	private int contactId;
	private String firstName;
	private String lastName;
	private long phoneNum;
	public AddressBookData() {}
	public AddressBookData(int id,AddressBookDTO addressBookDTO) {
		super();
		this.contactId = id;
		this.firstName = addressBookDTO.firstName;
		this.lastName = addressBookDTO.lastName;
		this.phoneNum = addressBookDTO.phoneNum;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
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
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "AddressBookData [contactId=" + contactId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNum=" + phoneNum + "]";
	}
}
