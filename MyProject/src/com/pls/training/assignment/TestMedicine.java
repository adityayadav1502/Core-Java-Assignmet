package com.pls.training.assignment;
import java.util.Scanner;
import java.util.Random;

class Medicine
{
	protected void displayLabel(String name,String address)
	{
		System.out.println("Company : " + name);
		System.out.println("Address : " + address);
	}
}
class Tablet extends Medicine
{
	protected void displayLabel(String name,String address)
	{
		System.out.println("Store in a cool and dry place");
		System.out.println("Company : " + name);
		System.out.println("Address : " + address);
	}
}
class Syrup extends Medicine
{
	protected void displayLabel(String name,String address)
	{
		System.out.println("Shake well before use");
		System.out.println("Company : " + name);
		System.out.println("Address : " + address);
	}
}
class Ointment extends Medicine
{
	protected void displayLabel(String name,String address)
	{
		System.out.println("For External use only");
		System.out.println("Company : " + name);
		System.out.println("Address : " + address);
	}
}
public class TestMedicine {

	private static int getRandomNumberInRange(int min,int max)
	{
		if(min>=max)
		{
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random no_gen = new Random();
		return no_gen.nextInt((max-min)+1)+min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine[] md = new Medicine[10];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<md.length;i++)
		{
			int no = TestMedicine.getRandomNumberInRange(1, 3);
			
			if(no==1)
			{
				System.out.print("Enter Company Name :" );
				String name = sc.nextLine();
				System.out.print("Enter Company Address : ");
				String address = sc.nextLine();
				md[i]=new Tablet();
				md[i].displayLabel(name,address);
			}
			if(no==2)
			{
				System.out.print("Enter Company Name :" );
				String name = sc.nextLine();
				System.out.print("Enter Company Address : ");
				String address = sc.nextLine();
				md[i]=new Syrup();	
				md[i].displayLabel(name,address);
			}
			if(no==3)
			{
				System.out.print("Enter Company Name :" );
				String name = sc.nextLine();
				System.out.print("Enter Company Address : ");
				String address = sc.nextLine();
				md[i]=new Ointment();
				md[i].displayLabel(name,address);
			}
		}
		sc.close();
	}

}
