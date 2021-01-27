package com.pls.training.assignment;

import java.util.Scanner;

public class StringManipulation {
	
	static int check( String sentence,String word)
	{
		int count=0,length;
		String temp[]=sentence.split(" ");
		length=temp.length;
		
		for(int i=0;i<length;i++)
		{
			if(temp[i].equals(word))
			{
				count++;
			}
		}
		return count;
	}

	static String[] initProductNames(Scanner sc)
	{
		String[] products = new String[10];
		
		System.out.println("Enter Number of products : ");
		int number = sc.nextInt();
		System.out.println("Enter Products Name :");
		for(int i=0;i<number;i++)
			products[i]=sc.next();
		
		return products;
	}
	static boolean isPresent(String[] Products,String key)
	{
		int i;
		for(i=0 ;i < Products.length;i++)
		{
			if(Products[i].equals(key))
			{
				return true;
			}
		}
		return false;
	}
	
	static int findPosition(int[] nos,int key)
	{ int pos=0;
		for(int i=0;i<nos.length;i++)
		{
			if(nos[i]==key)
			{
				pos=i+1;
			}
		}
		return pos;
	}
	static String makeReverse(String str)
	{
		String rev=null;
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		str1=str1.reverse();
		rev=str1.toString();
		return rev;
	}
	static void findAndReplace(String str,String replace,String newWord)
	{
		String[] temp = str.split(" ");
		for(int i=0;i<temp.length;i++)
		{
			if(temp[i].equals(replace))
				temp[i]=newWord;
		}
		String str1 = String.join(" ", temp);
		System.out.println(str1);
	}
	
	static void findPrime(int low, int high)
	{
		int[] temp = new int[10];
		int flag,k=1;
		for(int i=low;i<=high;i++)
		{
			if(i==1 || i==0)
				continue;
			flag=1;
			
			for(int j=2;j<=(i/2);++j)
			{
				if(i%j == 0)
				{
					flag = 0;
					break;
				}
			}
			if(flag==1)
			{
				temp[k]=i;
				k++;
			}
		}
		
		for(int p=0;p<temp.length;p++)
		{
			if(temp[p]!=0)
				System.out.println(temp[p]);
		}
	}
	static String swapString(String a,int i,int j)
	{
		char[] b = a.toCharArray();
		char ch;
		ch=b[i];
		b[i]=b[j];
		b[j]=ch;
		return String.valueOf(b);
	}
	static void getCombinations(String temp,int start,int end)
	{
		if(start==end-1)
			System.out.println(temp);
		else
		{
			for(int i = start ;i < end ;i++)
			{
				temp = swapString(temp,start,i);
				getCombinations(temp,start+1,end);
				temp = swapString(temp,start,i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//1.Find number of occurrence of given word in a sentence
		/*System.out.println("Enter String : ");
		String sentence = sc.nextLine();
		System.out.println("Enter word :");
		String word = sc.nextLine();
		System.out.print("Number of words is "+ StringManipulation.check(sentence,word));
		*/
		
		//2.Key Present or not
		/*String[] products = new String[10];
		products = StringManipulation.initProductNames(sc);
		System.out.print("Enter Keyword : ");
		String Key = sc.next();
		boolean flag = StringManipulation.isPresent(products,Key);
		if(flag == false)
		{
			System.out.print("Product is not present");
		}
		else
		{
			System.out.print("Product is present");
		}*/
		
		//3.Availability of given no
		/*System.out.println("Enter No of elements : ");
		int no = sc.nextInt();
		int nos[] = new int[10];
		System.out.print("Enter Numbers : ");
		for(int i=0;i<no;i++)
		{
			nos[i]=sc.nextInt();
		}
		System.out.print("Enter Number to be search : ");
		int key = sc.nextInt();
		
		System.out.print("Number is present at "+ StringManipulation.findPosition(nos,key));
		*/
		
		//4.Reverse words from string
		/*System.out.println("Enter String : ");
		String str = sc.nextLine();
		
		String reverse = StringManipulation.makeReverse(str);
		System.out.print("Reverse string is '"+reverse+"'");
		*s/
		
		//5.find and replace word from string 
		/*System.out.println("Enter String : ");
		String string = sc.nextLine();
		System.out.println("Enter word to be replace : ");
		String replace = sc.nextLine();
		System.out.println("Enter word the new word : ");
		String newWord = sc.nextLine();
		StringManipulation.findAndReplace(string,replace,newWord);
		*/
		
		//6.Prime array
		/*System.out.println("Enter lower : ");
		int low = sc.nextInt();
		System.out.println("Enter higher : ");
		int high = sc.nextInt();
		StringManipulation.findPrime(low,high);
		*/
		
		//7.Various combination of string
		/*System.out.println("Enter Word : ");
		String temp = sc.nextLine();
		int len = temp.length();
		int start=0;
		int end=len;
		StringManipulation.getCombinations(temp,start,end);
		*/
		
		//8.Array
		System.out.println("Enter No row :");
		int row = sc.nextInt();
		System.out.println("Enter No colm :");
		int colm = sc.nextInt();
		
		char[][] charArray = new char[10][10];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<colm;j++)
			{
				charArray[i][j] = sc.next().charAt(0);
			}
		}
		
		/*for(int i=0;i<row;i++)
		{
				if(charArray[i][i] == 'X')
				{
					System.out.print('X');
					break;
				}
				else if(charArray[i][i] == 'O')
				{
					System.out.print('O');
					break;
				}
		}*/
		int count=0;
		
		if(row==colm)
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<colm;j++)
				{
					if((i==j) && (charArray[i][j]=='X'))
					{
						count++;
					}
				}
				
			}
			if(count==row)
			{
				System.out.print('X');
			}
			count=0;
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<colm;j++)
				{
					if((i==j) && (charArray[i][j]=='O'))
					{
						count++;
					}
				}
				
			}
			if(count==row)
			{
				System.out.print('O');
			}
		}
		
		sc.close();
	}
}
