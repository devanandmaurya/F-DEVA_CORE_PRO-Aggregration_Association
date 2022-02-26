package com.dk.whf.overriding;

class Bank {
	public int getRateOfIntrest() {
		return 0;
	}

static  void panReq() {
		System.out.println("Pan card must be provide in the bank");
	}
}

class Sbi extends Bank {
	public int getRateOfIntrest() {
		return 9;
	}
}

class Icici extends Bank {
	public int getRateOfIntrest() {
		return 8;

	}
}

class Axis extends Bank {
	public int getRateOfIntrest() {
		return 7;
	}
}

public class BankClient {
	public static void main(String[] args) {
		Sbi s = new Sbi();
		Icici i = new Icici();
		Axis a = new Axis();
		System.out.println("sbi rate of ins:: " + s.getRateOfIntrest());
		System.out.println("ICICI  rate of ins:: " + i.getRateOfIntrest());
		System.out.println("Axix rate of ins:: " + a.getRateOfIntrest());

		s.panReq();
		i.panReq();
	}
}
