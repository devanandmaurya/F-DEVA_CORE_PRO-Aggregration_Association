package com.dk.whf.instanceoperator;

interface Animal {
	void typeofAnimal();
}

public class Annonymousexamp {
	public static void main(String[] args) {
		Animal a = new Animal() {
			public void typeofAnimal() { // Annonymous class created
				System.out.println("Annonymous calass example here !!!");
			}
		};
		a.typeofAnimal();
	}
}
