package com.edu.les03.main;

public class PointDistance {

	public static void main(String[] args) {
		double x1 = 33.8;
		double y1 = 61.2;
		double x2 = 98.4;
		double y2 = 106.7;
		double Distance;
		Distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Distance between point = " + Distance);
		 

	}

}
