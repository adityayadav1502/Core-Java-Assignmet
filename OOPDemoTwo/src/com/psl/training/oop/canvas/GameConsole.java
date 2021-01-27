package com.psl.training.oop.canvas;

import com.psl.training.oop.shapes.*;

public class GameConsole {
	//Shape c = new Circle() Up casting
	public void drawShape(Shape s)
	{
		s.draw();
		
		if(s instanceof Circle)
		{
			//Reference Casting 
			((Circle)s).fillColor();
		}
		if(s instanceof Rotatable)
		{
			((Rotatable) s).rotate();
		}
		if(s instanceof Bouncable)
		{
			((Bouncable) s).bounce();
		}
		if(s instanceof Sparkable)
		{
			((Sparkable) s).spark();
		}
	}
}
