package com.dk.whf;

public class Emp {
	String empname;
	String empdep;
	int age;
	Address address;

	/**
	 * @param empname
	 * @param empdep
	 * @param age
	 * @param address
	 */
	public Emp(String empname, String empdep, int age, Address address) {
		super();
		this.empname = empname;
		this.empdep = empdep;
		this.age = age;
		this.address = address;
	}

	public void show() {
		System.out.println("name :" + empname + "emp depart: " + empdep + "emp age : " + age);
		System.out.println("city :" + address.city + "State:" + address.state + "Area:" + address.area);
	}

	public static void main(String[] args) {
		Address a1 = new Address("Basti", "UP", "Bankati");
		Address a2 = new Address("Gkp", "ald", "Lalgang");

		Emp e1 = new Emp("Devan", "developer", 34, a1);
		Emp e2= new Emp("Atul", "Testing", 32, a2);
e1.show();
e2.show();
	}
}
