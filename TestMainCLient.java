package com.dk.whf;

class Author {
	String name;
	String place;
	int age;

	Author(String name, String place, int age) {
		this.name = name;
		this.place = place;
		this.age = age;
	}

	public String getAuthorName() {
		return name;
	}

	public String getAuthorPlace() {
		return place;
	}

	public int getAuthorAge() {
		return age;
	}
}

class Book {
	String name;
	String booktitle;
	int price;
	Author autherassociation;

	Book(String n, String bt, int p, Author at) {
		this.name = n;
		this.booktitle = bt;
		this.price = p;

		this.autherassociation = at;
	}

	public void showDetail() {
		System.out.println("Book is::" + name);
		System.out.println("Book title ::" + booktitle);
		System.out.println("price:: " + price);
		System.out.println("Author is  autherassociation :" +autherassociation.getAuthorName());
		System.out.println("auth place"+autherassociation.getAuthorPlace());
		System.out.println("The auth age"+autherassociation.getAuthorAge());
		
	}
}

public class TestMainCLient {
	public static void main(String[] args) {
		//TestMainCLient t = new TestMainCLient();

		Author ath = new Author("devanand", "up", 22);
		Book b = new Book("Java", "Core concepte ", 240, ath);
		b.showDetail();
	}
}
