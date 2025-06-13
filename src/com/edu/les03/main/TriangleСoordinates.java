package com.edu.les03.main;

public class TriangleСoordinates {

	public static void main(String[] args) {
		double x1 = 1, y1 = -1;
		double x2 = 3, y2 = 8;
		double x3 = 7, y3 = 12;
		double a;
		double b;
		double c;
		double perimeter;
		double area;
		a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		perimeter = a + b + c;
		area = Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
		System.out.println("perimeter = " + perimeter);
		System.out.println("area = " + area);		
	}

}
