package com.psl.training.oop.shapes;

public class Triangle extends Shape implements Rotatable,Sparkable
{
	public void draw()
	{
		System.out.println("Draw Tirangle");
	}

	@Override
	public void spark() {
		// TODO Auto-generated method stub
		System.out.println("Triangle is Sparkling in "+ Sparkable.DIRECTION + "Direction");
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("Triangle is Rotateing in "+ Rotatable.DIRECTION + "Direction");
	}
}
