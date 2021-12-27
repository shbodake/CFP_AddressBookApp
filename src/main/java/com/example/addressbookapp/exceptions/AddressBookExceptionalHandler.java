package com.example.addressbookapp.exceptions;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.addressbookapp.dto.ResponseDTO;


/**
 * @ControllerAdvice : To handle all Exception throw in application
 * @ExceptionHandler : To declare a method to handle particular Exception
 */

@ControllerAdvice

public class AddressBookExceptionalHandler {
	/**
	 * Method to handle any Exception thrown
	 * @param exception
	 * @return : ResponseEntity of Exception
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ResponseDTO> handlerMethodArgumentNotValidException(
			MethodArgumentNotValidException exception) {
		List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
		List<String> errMsg = errorList.stream().map(objErr -> objErr.getDefaultMessage()).collect(Collectors.toList());
		ResponseDTO responseDTO = new ResponseDTO("Exception while processing REST Request ", errMsg);
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
	}

	/**
	 * Method to handle when user Id not found
	 * @param exception
	 * @return : Response Entity of Exception
	 */
	@ExceptionHandler(AddressBookException.class)
	public ResponseEntity<ResponseDTO> handlerEmployeePayrollException(AddressBookException exception) {
		ResponseDTO responseDTO = new ResponseDTO("Exception while processing REST Request ", exception.getMessage());
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.BAD_REQUEST);
	}
}
