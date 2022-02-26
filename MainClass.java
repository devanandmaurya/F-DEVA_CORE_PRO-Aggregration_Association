package com.dk.whf.instanceoperator;
class parent {
}
public class MainClass extends parent {
public void check() {
System.out.println("success full ");
	}
	public static void show(parent p) {
		if (p instanceof MainClass) {
			MainClass m = (MainClass) p;
			m.check();
		}
	}

	public static void main(String[] args) {
		parent m = new MainClass();
		MainClass.show(m);
		System.out.println(m instanceof MainClass);
	}
}
