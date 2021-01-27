package com.psl.training.oop.test;
import com.psl.training.oop.shapes.*;
import com.psl.training.oop.canvas.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameConsole console = new GameConsole();
		console.drawShape(new Circle());
		console.drawShape(new Triangle());
		console.drawShape(new Square());
		console.drawShape(new Star());
	}

}
