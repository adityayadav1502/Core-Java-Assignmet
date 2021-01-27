package com.psl.training.oop.ExceptionHandling;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class StackImplementation {
	
	static final int MAX = 10;
	int top;
	Contact c[]= new Contact[10];
	
	StackImplementation()
	{
		top=-1;
	}
	boolean isEmpty()
	{
		return (top < 0);
	}
	boolean push(Contact x) throws Exception
	{
		if(top >= (MAX-1))
		{
			throw new Exception("Stack Overflow");
		}
		else if(!x.validate())
		{
			throw new Exception("Not Valid Data");
		}
		else
		{
			c[++top]=x;
			System.out.println(x + " Pushed..");
			return true;
		}
	}
	Contact pop() throws Exception
	{
		if(top<0)
		{
			throw new Exception("Stack Underflow");
		}
		else
		{
			Contact x = c[top--];
			return x;
		}
	}
	public static void main( String [] args)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-YYYY");
		Scanner sc = new Scanner(System.in);
		Date dob1=null;
		Date anniversary=null;
		try
		{
			Contact c = new Contact();
			
			System.out.println("Enter First Name : ");
			String fname = sc.next();
			System.out.println("Enter Middle Name : ");
			String mname = sc.next();
			System.out.println("Enter Last Name : ");
			String lname = sc.next(); 
			System.out.println("Enter DOB : ");
			String dob = sc.next();
			dob1 = dateFormat.parse(dob);
			System.out.println("Enter Gender M/F : ");
			String gen = sc.next();
			System.out.println("Enter Date of Anniverasry : ");
			dob=sc.next();
			anniversary=dateFormat.parse(dob);	
			
			System.out.println("Enter Address");
			System.out.println("Enter Area : ");
			String area = sc.next();
			System.out.println("Enter City : ");
			String city = sc.next();
			System.out.println("Enter Pincode : ");
			String pincode = sc.next();
			System.out.println("Enter state : ");
			String state = sc.next();
			System.out.println("Enter Country : ");
			String country = sc.next();
			System.out.println("Enter Telephone : ");
			String telephone = sc.next();
			System.out.println("Enter Mobile : ");
			String mobile = sc.next();
			System.out.println("Enter Email : ");
			String email = sc.next();
			System.out.println("Enter website : ");
			String website = sc.next();
			
			
			c.setData(fname, mname, lname, dob1, gen, anniversary, area, city, pincode, state, country, telephone, mobile, email, website);
			
			StackImplementation s = new StackImplementation();
			s.push(c);
			s.push(c);
			s.push(c);
			System.out.println(s.pop()+" Pop from stack");
		}
		catch(Exception e)
		{
			System.out.println("Something is Wrong : " + e);
		}
		sc.close();
	}
}
