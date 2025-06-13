package com.edu.les03.main;

public class TriangleEquilateral {

	public static void main(String[] args) {
	double a = 7.3;
	double S;
	double h;
	double r;
	double R;
	S = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
	h = (a * Math.sqrt(3)) / 2;
	r = (a * Math.sqrt(3)) / 6;
	R = (a * Math.sqrt(3)) / 3;
	System.out.println("Площадь треугольника = " + S);
	System.out.println("Высота треугольника = " + h);
	System.out.println("Радиус вписанной окружности = " + r);
	System.out.println("Радиус описанной окружности = " + R);

	}

}
