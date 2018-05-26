package com;

public class Author {
		private long authorID;
		private String authorName;
		public Author(Long aid,String name) {
			this.authorID = aid;
			this.authorName = name;
		}
		public long getAuthorId() {
			return authorID;
		}
		public void setAuthorId(long id) {
			this.authorID = id;
		}
		public void setauthorName(String authorName) {
			this.authorName = authorName;
		}
		public String getAuthorName() {
			return authorName;
		}
}
