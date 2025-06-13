package com.edu.les03.main;

public class ArithmeticAndGeometricMean {

	public static void main(String[] args) {
	double a = - 21;
	double b = 43;
	double Ar;
	double G;
	double abs_A = Math.abs(a);
	double abs_B = Math.abs(b);
	Ar = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
	G = Math.sqrt(abs_A * abs_B);
	System.out.println("Среднее арифметическое кубов чисел = " + Ar);
	System.out.println("Среднее геометрическое модулей чисел = " + G);
	
	}

}
