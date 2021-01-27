package com.pls.training.assignment;

interface IPerson
{
	void acceptName(String name);
	void displayName();
}
interface Temporary
{
	void setStatus(String status);
}
interface Salaried
{
	void isSalaried();
}
class Person implements IPerson
{
	String name;

	@Override
	public void acceptName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.print("Name is.." + name);
	}
}
class Student extends Person
{
	int stud_id;
	
	public void setStudentId(int stud_id)
	{
		this.stud_id = stud_id;
	}
	public void displayStudentId()
	{
		System.out.print("Student ID is.."+ stud_id);
	}
}
class Faculty extends Person implements Temporary, Salaried
{
	String faculty_id;
	String status;
	
	public void setfacultyId(String faculty_id)
	{
		this.faculty_id=faculty_id;
	}
	public void displayFacultyId()
	{
		System.out.println("Faculty ID is.."+ faculty_id );
	}
	@Override
	public void isSalaried() {
		// TODO Auto-generated method stub
		if(faculty_id.charAt(0)== 'T')
		{
			System.out.println("Not Salaried...");
		}
		if(faculty_id.charAt(0)== 'P')
		{
			System.out.println("Salaried...");
		}
	}
	@Override
	public void setStatus(String status) {
		// TODO Auto-generated method stub
		if(faculty_id.charAt(0)== 'T')
		{
			status="Temporaray";
		}
		if(faculty_id.charAt(0)== 'P')
		{
			status="Permanent";
		}
	}
}
class Undergrad extends Student
{
	Undergrad()
	{
		System.out.println("Inside Undergrad Class");
	}
}
class Grad extends Student
{
	Grad()
	{
		System.out.println("Inside Grad Class");
	}
}
class UnderGradFaculty extends Faculty
{
	UnderGradFaculty()
	{
		System.out.println("Inside UnderGradFaculty Class");
	}
}
class GradFaculty extends Faculty
{
	GradFaculty()
	{
		System.out.println("Inside GradFaculty Class");
	}
}
public class OopDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
