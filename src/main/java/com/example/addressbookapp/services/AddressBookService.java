package com.example.addressbookapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService{
	
	/**
	 * Call Get method
	 * @return : Http Status & Contact details of the employee
	 */
	@Override
	public List<AddressBookData> getAddressBookData() {
		List<AddressBookData> addressBookList = new ArrayList<>();
		addressBookList.add(new AddressBookData(1, new AddressBookDTO("Sayali", "Bodake", "sai paradise apt", "Nasik", 9850521236l)));
		return addressBookList;
	}

	/**
	 * Call Get method
	 * @param id : contact Id
	 * @return : Contact details of the employee
	 */
	@Override
	public AddressBookData getAddressBookDataById(int id) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, new AddressBookDTO("Sayali", "Bodake", "Sai paradise apt", "Nasik", 9850521236l));
		return contactData;
	}

	/**
	 * Call post method to add details
	 * @param addressBookDTO : details id, Firstname, Lastname, Address, City & phoneNum
	 * @return : details
	 */
	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, addressBookDTO);
		return contactData;
	}

	/**
	 * Call put method to update details
	 * @param addressBookDTO : details id, Firstname, Lastname, Address, City & phoneNum
	 * @return : details
	 */
	@Override
	public AddressBookData updateAddressBookData(int id, AddressBookDTO addressBookDTO) {
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, addressBookDTO);
		return contactData;
	}

	/**
	 * Call delete method to remove address book details
	 * @param empId : Address book id
	 * @return : contact id which is deleted
	 */
	@Override
	public void deleteAddressBookData(int id) {
		
	}
}
