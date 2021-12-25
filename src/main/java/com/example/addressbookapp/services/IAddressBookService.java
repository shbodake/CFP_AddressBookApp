package com.example.addressbookapp.services;

import java.util.List;
import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.model.AddressBookData;

public interface IAddressBookService {

	List<AddressBookData> getAddressBookData();
	
	AddressBookData getAddressBookDataById(int id);
	
	AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);
	
	AddressBookData updateAddressBookData(int id,AddressBookDTO addressBookDTO);
	
	void deleteAddressBookData(int id);
}
