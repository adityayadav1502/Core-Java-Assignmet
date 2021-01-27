package com.psl.training.oop.order;

public class Customer {

	int id;
	String name;
	String homePhone;
	String cellPhone;
	String workPhone;
	String street;
	String city,state,zip;
	
	Customer()
	{

	}
	Customer(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void printPhoneNumbers()
	{
		System.out.println("Home Phone : " + homePhone);
		System.out.println("Cell Phone : " + cellPhone);
		System.out.println("Work Phone : " + workPhone);
	}
	void printShippingAddress()
	{
		System.out.println("Street : " + street);
		System.out.println("City : " + city);
		System.out.println("State : " + state );
		System.out.println("Zip : " + zip);
	}
	void setPrintingAddress(String street,String city,String state,String zip)
	{
		this.street=street;
		this.city=city;
		this.state=state;
		this.zip=zip;
	}
	void setPhoneNumbers(String homePhone,String cellPhone,String workPhone)
	{
		this.homePhone=homePhone;
		this.cellPhone=cellPhone;
		this.workPhone=workPhone;
	}
	void displayData()
	{
		System.out.println("\n");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		printShippingAddress();
		printPhoneNumbers();
	}
}
