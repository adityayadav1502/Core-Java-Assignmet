package com.psl.training.oop.order;

import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c[] = new Customer[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<c.length;i++)
		{
			System.out.print("\n");
			System.out.print("Enter Id : ");
			int id = sc.nextInt();
			System.out.print("Enter Name : ");
			String name = sc.next();
			c[i] = new Customer(id,name);
			System.out.println("Enter Address : ");
			System.out.print("Street : ");
			String street = sc.next();
			System.out.print("City : ");
			String city = sc.next();
			System.out.print("State : ");
			String State = sc.next();
			System.out.print("Zip : ");
			String zip = sc.next();
			
			c[i].setPrintingAddress(street, city, State, zip);
			
			System.out.println("Enter Phone Numbers ");
			System.out.print("Home Phone : ");
			String homePhone = sc.next();
			System.out.print("Cell Phone : ");
			String cellPhone = sc.next();
			System.out.print("Work Phone : ");
			String workPhone = sc.next();
			
			c[i].setPhoneNumbers(homePhone, cellPhone, workPhone);
			
			c[i].displayData();
		}
		sc.close();
	}
}
