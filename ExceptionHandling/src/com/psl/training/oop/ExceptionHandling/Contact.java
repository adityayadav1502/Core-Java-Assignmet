package com.psl.training.oop.ExceptionHandling;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Contact{

	String FirstName;
	String MiddleName;
	String LastName;
	Date DOB;
	String Gender;
	Date Anniversary;
	String Area;
	String city;
	String Pincode;
	String State;
	String Country;
	String TelePhone;
	String Mobile;
	String Email;
	String website;
	
	public void setData(String FirstName,String MiddleName,String LastName,Date DOB,String Gender,Date Anniversary,String Area,String city,String Pincode,String State,String Country,String TelePhone,String Mobile,String Email,String website)
	{
		this.FirstName = FirstName ;
		this.MiddleName = MiddleName;
		this.LastName = LastName;
		this.DOB = DOB; 
		this.Gender = Gender;
		this.Anniversary=Anniversary;
		this.Area = Area;
		this.city = city;
		this.Pincode = Pincode;
		this.State = State;
		this.Country = Country;
		this.TelePhone = TelePhone ;
		this.Mobile = Mobile;
		this.Email = Email;
		this.website = website;
		
	}
	public void displayData()
	{
		System.out.println("Name : " + FirstName+" "+ MiddleName+" "+ LastName);
		System.out.println("Birth : " + DOB);
		System.out.println("Gender : " + Gender);
		System.out.println("Anniversary " + Anniversary);
		System.out.println("Address : ");
		System.out.println(Area +"," +city +"," +State +"," +Country +"," +Pincode);
		System.out.println("Mobile : " + Mobile);
		System.out.println("Email : " + Email);
		System.out.println("WebSite : " + website);
	}
	public boolean validate() throws Exception
	{
		String regex = "^[\\w-\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(FirstName == null || MiddleName == null || LastName== null || DOB == null || Email == null)
		{
			throw new Exception("Please Enter Mandetory Fileds");
		}
		else if(!Email.matches(regex))
		{
			throw new Exception("Email is not valid!!");
		}
		else if(TelePhone == null || Mobile ==null)
		{
			throw new Exception("Please Enter Either Phone Number");
		}
		else
		{
			return true;
		}
		
	}	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Date dob1=null;
		Date anniversary=null;
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-YYYY");
		Contact c = new Contact();
		try
		{
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
			if(c.validate())
			{
				System.out.println("All the Data is Valid");
				c.displayData();
			}
		}
		catch(Exception e)
		{
			System.out.println("SomeThing went wrong :" + e);
		}	// TODO Auto-generated method stub
		sc.close();
	}
}
