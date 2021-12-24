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

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	/**
	 * Call Get method
	 * @return : Http Status & Contact details of the employee
	 */
	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<String> getAddressBookData(){
		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}
	
	/**
	 * Call Get method
	 * @param id : contact Id
	 * @return : Contact details of the employee
	 */
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getAddressBookData(@PathVariable("id") int id){
		return new ResponseEntity<String>("Get Call Success for Id: "+ id, HttpStatus.OK);
	}
	
	/**
	 * Call post method to add details
	 * @param addressBookDTO : details id, Firstname, Lastname, Address, City & phoneNum
	 * @return : details
	 */
	@PostMapping("/create")
	public ResponseEntity<String> getAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		return new ResponseEntity<String>("Created Address Book Data for: "+ addressBookDTO, HttpStatus.OK);
	}
	
	/**
	 * Call put method to update details
	 * @param addressBookDTO : details id, Firstname, Lastname, Address, City & phoneNum
	 * @return : details
	 */
	@PutMapping("/update")
	public ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		return new ResponseEntity<String>("Updated Address Book Data for: "+ addressBookDTO, HttpStatus.OK);
	}
	
	/**
	 * Call delete method to remove address book details
	 * @param empId : Address book id
	 * @return : contact id which is deleted
	 */
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteAddressBookData(@PathVariable("id") int id){
		return new ResponseEntity<String>("Delete call success for id: "+ id, HttpStatus.OK);
	}
}
