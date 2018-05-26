package com;

public class Library {
		private long libraryID;
		private String libraryName;
		private String city;
		public Library(long libraryID,String city,String libraryName) {
			this.libraryID = libraryID;
			this.libraryName = libraryName;
			this.city = city;
		}
		public void setlibraryId(long id) {
			this.libraryID = id;
		}
		public long getlibraryId() {
			return libraryID;
		}
		public void setlibraryName(String name) {
			this.libraryName = name;
		}
		public String getlibraryName() {
			return libraryName;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCity() {
			return city;
		}
}
