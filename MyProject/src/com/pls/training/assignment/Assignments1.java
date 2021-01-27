package com.pls.training.assignment;

import java.util.Scanner;

public class Assignments1 {
	
	public static int totalOfEvenNumbers(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}
	public static void printEvenAndFiveMulti(int arr[],int no)
	{
		System.out.println("Numbers are...");
		for(int i=0;i<no;i++)
		{
			if(arr[i]%2==0 || arr[i]%5==0)
			{
				System.out.print(arr[i]+"\t");
			}
		}
	}
	public static int totalNoOfChar(String str)
	{ int count=0;
		for(int i=0;i<str.length();i++)
		{
			char a = str.charAt(i);
			if(a!=' ')
			{
				count++;
			}
		}
		return count;
	}
	public static int totalVowels(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			if(a =='a'||a== 'e'||a== 'i'||a== 'o'||a== 'u'||a== 'A'||a== 'E'||a== 'I'||a== 'O'||a== 'U')
				count++;
		}
		return count;
	}
	public static int totalSpaces(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			if(a==' ')
				count++;
		}
		return count;
	}
	public static void printWords(String sentence)
	{
		String[] arr= new String[10];
		arr = sentence.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void patternOne(String temp)
	{
		for(int i=0;i<temp.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(temp.charAt(j)+ "\t");
			}
			System.out.print("\n");
		}
	}
	public static void patternTwo()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"\t");
			}
			System.out.print("\n");
		}
		for(int i=3 ;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"\t");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		//1.Total of Even number present in array
		/*System.out.println("Enter Count of Numbers : ");
		int no = sc.nextInt();
		int[] arr = new int[10];
		System.out.println("Enter Numbers : ");
		for(int i=0;i<no;i++)
		{
			arr[i]=sc.nextInt();
		}*/
		//int total = Assignments1.totalOfEvenNumbers(arr);
		//System.out.println("Total of Even Numbers is "+ total);
		
		//2.Print all even and multiple of 5
		//Assignments1.printEvenAndFiveMulti(arr,no);
		
		//3.Total No of Characters present in String
		/*System.out.print("Enter the String : ");
		String str = sc.nextLine();
		int characters = Assignments1.totalNoOfChar(str);
		System.out.println("Total characters are.." + characters);
	*/
		//4.Vowels Present in String
		//int vowel = Assignments1.totalVowels(str);
		//System.out.println(vowel + " vowels are present in the String");
		
		//5.Spaces present in String
		//int space = Assignments1.totalSpaces(str);
		//System.out.println("Total Spaces are..."+ space);
		
		//6.1 Pattern 1
		/*System.out.print("Enter String : ");
		String temp = sc.next();
		Assignments1.patternOne(temp);
		*/
		
		//6.2 Pattern 2
		Assignments1.patternTwo();
		
		//6.3 Printing Words
		/*System.out.println("Enter String : ");
		String sentence=sc.nextLine();
		Assignments1.printWords(sentence);
		*/
		sc.close();
	}

}
