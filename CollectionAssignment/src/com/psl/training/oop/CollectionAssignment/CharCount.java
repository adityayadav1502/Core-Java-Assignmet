package com.psl.training.oop.CollectionAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {

	Map<String,Integer> countlist = new HashMap<>();
	
	public boolean checkMap(String str)
	{
		return countlist.containsKey(str);
	}
	public int getCount(String str)
	{
		return countlist.get(str);
	}
	public int countUniqueCharacters(String str)
	{
		boolean[] isItThere = new boolean[Character.MAX_VALUE];
		for(int i=0;i<str.length();i++)
		{
			isItThere[str.charAt(i)] = true;
		}
		int count =0;
		for(int i=0;i<isItThere.length;i++)
		{
			if(isItThere[i]==true)
			{
				count++;
			}
		}
		return count;
	}
	public void addElement(String str,int count)
	{
		countlist.put(str, count);
	}
	public void DisplayCount(String s)
	{
		if(checkMap(s))
		{
			System.out.println("Geeting Data from Map");
			System.out.println("Count is : " + getCount(s));
		}
		else
		{
			int count = countUniqueCharacters(s);
			System.out.println("Count is : " + count);
			addElement(s, count);
		}
	}
	public static void main(String[] args) {
		
		CharCount c = new CharCount();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter String : ");
			String s = sc.next();
			c.DisplayCount(s);
		}
		sc.close();
	}
}
