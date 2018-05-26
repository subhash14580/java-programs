package com;

public class AuthorDoesNotExistsException extends Exception{
		public String getMessage() {
			return "Author already Exists";
		}
}
