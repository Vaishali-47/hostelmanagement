package com.boot.exception;

import java.util.HashSet;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;

public class GlobalException
@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourseNotFoundException(ResourseNotFoundException ex)
	{
		String message ex.getMessage();
		ApiResponse response = new ApiResponse();
		response.setMessage(message);
		response.setstatus(false);
		return new ResponseEntity<ApiResponse>response,HttpStatus.Not_FOUND);
	}
@ExceptionHandler(ConstraintViolationException.class)
public ResponseEntity<set<String>>  handleConstraintException(ConstraintViolationException ex)
{
	Set<String> set=new HashSet<>();
	ex.getConstraintViolations().stream().map(error->set.add(error.getMessage())).collect(Collectors.toset());
	
	System.out.println(ex);
	return new ResponseEntity<Set<String>>(set,HttpStatus.BAD_REQUEST);


		
	}

}
