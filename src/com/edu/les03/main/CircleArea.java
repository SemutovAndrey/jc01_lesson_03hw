package com.edu.les03.main;

public class CircleArea {

	public static void main(String[] args) {
		 double C = 14; // Длина окружности
	        
	        // Площадь круга через длину окружности
	        double S = Math.pow(C, 2) / (4 * Math.PI);
	        System.out.println("Площадь круга: " + S);
	}
}