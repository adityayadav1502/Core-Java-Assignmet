package com.pls.training.assignment;

import java.util.Scanner;

public class LanguageFundamental {

	static int calMax(int x,int y,int z)
	{
		if(x>y)
		{
			if(x>z)
				return x;
			else
				return z;
		}
		else
		{
			if(y>z)
				return y;
			else
				return z;
		}
	}
	
	static boolean checkAlpha(char alph)
	{
		if(alph == 'A' || alph == 'E' || alph == 'I' || alph == 'O' || alph == 'U' || alph == 'a' || alph == 'e' || alph == 'i' || alph == 'o' || alph == 'u')
			return true;
		return false;
	}
	
	static double calInterest(int amt)
	{
		double interest=0;
		if(amt<=1000)
		{
			interest = (amt*4*1)/100;
			
		}else if(amt>1000 && amt<=5000)
		{
			interest = (amt*4.5*1)/100;
			
		}else if(amt > 5000)
		{
			interest = (amt*5*1)/100;
		}
		return interest;
	}
	static double calTax(int grosspay)
	{ double tax=0;
		if(grosspay <= 240)
		{
			tax=(grosspay*0)/100;
		}
		else if(grosspay > 240 && grosspay <=480)
		{
			tax=(grosspay*15)/100;
		}
		else if(grosspay >480)
		{
			tax=(grosspay*28)/100;
		}
		return tax;
	}
	static boolean isPrimeNumber(int no)
	{
		for(int i=2;i<=(no/2);++i)
		{
			if(no%i==0)
			{
				return false;
			}
		}
		return true;
	}
	void printPrime(int no)
	{
		int flag;
		for(int n=2;n<=no;n++)
		{ flag=0;
			for(int i=2;i<=(n/2);++i)
			{
				if(n%i==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.println(n);
			}
		}
	}
	static void displayMultiplicationMatrix()
	{ 
		int i,j;
		int table[][] = new int[13][13];
		table[0][0] = 0;
		for(i=1;i<=12 ;i++)
		{
			table[0][i]=i;
			table[i][0]=i;
		}
		for(i=1;i<=12;i++)
		{
			for(j=1;j<=12;j++)
			{ 	
					table[i][j]= table[0][i]*table[j][0];
			}
		}
		for(i=0;i<=12;i++)
		{
			for(j=0;j<=12;j++)
			{
				if(table[i][j]==0)
					System.out.print(" "+"\t");
				else
					System.out.print(table[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
	static double calLoan(int age ,char gender,String job,double asset)
	{
		double payback = 0;
		
		if(asset<=500)
		{
			payback= (asset/100)*0.25;
		}
		else
		{
			payback = (500/100)*0.25;
			asset = asset - 500;
			if(asset<=1000)
			{
				payback=payback + (asset/100)*0.50;
			}
			else
			{
				payback = payback + ((1000/100)*.50);
				asset=asset-1000;
				if(asset <=1000)
				{
					payback = payback + (asset/100)*0.75;
				}
				else
				{
					payback = payback + (1000/100)*0.75;
					asset=asset-1000;
					if(asset>=1)
					{
						payback=payback+(asset/100)*1.0;
					}
				}
						
			}
		}
		return payback;
	}
	static void calElectricityBill(String con,int units)
	{
		double bill = 0;
		if(con.equalsIgnoreCase("domestic"))
		{
			if(units <= 100)
			{
				bill = units*4;
				if(bill<250)
					bill=250;
			}
			else if(units>100 && units<=300)
			{
				bill = units * 4.5;
			}
			else if(units>300 && units<=500)
			{
				bill = units * 4.75;
			}
			else if(units>500)
			{
				bill = units * 5;
			}
		}
		else
		{
			if(units <= 100)
			{
				bill = units*4.25;
				if(bill<350)
					bill=350;
			}
			else if(units>100 && units<=300)
			{
				bill = units * 4.75;
			}
			else if(units>300 && units<=500)
			{
				bill = units * 5;
			}
			else if(units>500)
			{
				bill = units * 5.25;
			}
		}
		System.out.println("Bill : " + bill);
	}
	static double calculateProfit(int attendee)
	{
		double profit = 0;
		profit = (5*attendee)-(20+(0.5*attendee));
		return profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		/*
		//1.Find Maximum of three Numbers
		System.out.print("Find Maximum of three Numbers\n");
		System.out.print("Enter 1st No : ");
		int x = sc.nextInt();
		System.out.print("Enter 2nd No : ");
		int y = sc.nextInt();
		System.out.print("Enter 3rd No : ");
		int z = sc.nextInt();
		System.out.print("Maximum if three is " + LanguageFundamental.calMax(x,y,z));
		*/
		
		//2.Check whether input alphabet is vowel or not
		/*
		System.out.print("Check whether alphabet is vowel or not \n");
		System.out.print("Enter Single Alphabet : ");
		char c = sc.next().charAt(0);
		boolean flag = LanguageFundamental.checkAlpha(c);
		if(flag== true)
			System.out.print("Enter Alphabet is Vowel");
		else
			System.out.print("Enter Alphabet is not Vowel");
		*/
	
		
		//3.Calculation of interest on amount
		/*System.out.print("Interest Calculation \n");
		System.out.println("Enter Amount : ");
		int amt = sc.nextInt();
		System.out.print("Interest on amount is " +LanguageFundamental.calInterest(amt));
		*/
		
		//4.Calculation of amount of tax owned
		System.out.println("Tax Calculation");
		System.out.print("Enter Gross Pay : ");
		int grosspay = sc.nextInt();
		System.out.print("Tax is " + LanguageFundamental.calTax(grosspay));
		
		
		//5.Check Number is prime or not
		/*
		System.out.println("Check Whether number is prime or not \n");
		System.out.print("Enter Number : ");
		int no = sc.nextInt();
		boolean flag = LanguageFundamental.isPrimeNumber(no);
		if(flag == true)
			System.out.print("Number is prime");
		else
			System.out.print("Number is not prime");
		*/
		
		//6.Print Prime Numbers
		/*
		System.out.println("Enter series of prime number \n");
		System.out.print("Enter No : ");
		int range = sc.nextInt();
		LanguageFundamental MyObj = new LanguageFundamental();
		MyObj.printPrime(range);
		*/
		
		//7.Profit Program
		/*System.out.println("Show Earning\n");
		System.out.println("Enter Number of attendee : ");
		int attendee = sc.nextInt();
		System.out.print("Profit Is " +LanguageFundamental.calculateProfit(attendee));
		*/ 
		
		//8.Electricity Bill
		/*
		System.out.println("Electricity Bill");
		System.out.print("Enter type of Connection : ");
		String con = sc.next();
		System.out.println("Enter Number of units : ");
		int unit = sc.nextInt();
		LanguageFundamental.calElectricityBill(con,unit);
		*/
		
		//9.Credit Card Pay Back
		/*System.out.println("Credit card pay back\n");
		System.out.print("Enter Age : ");
		int age = sc.nextInt();
		System.out.print("Enter Gender M/F : ");
		char gender = sc.next().charAt(0);
		System.out.print("Enter Job : ");
		String job = sc.next(); 
		System.out.print("Enter Amount : ");
		double asset = sc.nextDouble();
		double payback=LanguageFundamental.calLoan(age,gender,job,asset);
		System.out.print("payBack Is "+ payback);
		*/
		//10.Multiplication Table
		/*
		LanguageFundamental.displayMultiplicationMatrix();
		*/
		
		sc.close();
	}

}
