package com;

public class BookAlreadyExistsException extends Exception{
		public String getMessage() {
			return "BookAlreadyExists";
		}
}
