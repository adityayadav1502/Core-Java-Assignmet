package com.psl.training.oop.shapes;

public class Circle extends Shape implements Bouncable
{
	public void draw()
	{
		System.out.println("Draw Circle");
	}
	public void fillColor()
	{
		System.out.println("Filling Red in color in circle");
	}
	@Override
	public void bounce() {
		// TODO Auto-generated method stub
		System.out.println("Circle is bouncing");
	}
}