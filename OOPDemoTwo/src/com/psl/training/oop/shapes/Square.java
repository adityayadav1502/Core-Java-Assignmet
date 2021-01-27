package com.psl.training.oop.shapes;

public class Square extends Shape implements Rotatable
{
	public void draw()
	{
		System.out.println("Draw Square");
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("Square is Rotateing in "+ Rotatable.DIRECTION +" Direction");
	}
}