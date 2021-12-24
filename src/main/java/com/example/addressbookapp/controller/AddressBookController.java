package com.example.addressbookapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.dto.ResponseDTO;
import com.example.addressbookapp.model.AddressBookData;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	/**
	 * Call Get method
	 * @return : Http Status & Contact details of the employee
	 */
	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<ResponseDTO> getAddressBookData(){
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, new AddressBookDTO("Sayali","Bodake","Sai paradise apt","Nasik",9850521236l));
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", contactData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	/**
	 * Call Get method
	 * @param id : contact Id
	 * @return : Contact details of the employee
	 */
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("id") int id){
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, new AddressBookDTO("Sayali","Bodake","Sai paradise Apt","Nasik",9850521236l));
		ResponseDTO respDTO = new ResponseDTO("Get Call Successful", contactData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	/**
	 * Call post method to add details
	 * @param addressBookDTO : details id, Firstname, Lastname, Address, City & phoneNum
	 * @return : details
	 */
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> getAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created AddressBook data Successfully", contactData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	/**
	 * Call put method to update details
	 * @param addressBookDTO : details id, Firstname, Lastname, Address, City & phoneNum
	 * @return : details
	 */
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData contactData = null;
		contactData = new AddressBookData(1, addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated AddressBook data Successfully", contactData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	/**
	 * Call delete method to remove address book details
	 * @param empId : Address book id
	 * @return : contact id which is deleted
	 */
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("id") int id){
		ResponseDTO respDTO = new ResponseDTO("Deleted AddressBook data Successfully", "Deleted id : " +id);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
}
