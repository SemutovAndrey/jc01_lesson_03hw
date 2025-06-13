package com.edu.les03.main;

public class CubeAreas {

	public static void main(String[] args) {
		double a = 5.2;
		double cubeFace;
		double cubeSurface;
		double cubeVolume;
		cubeFace = Math.pow(a, 2);
		cubeSurface = cubeFace * 6;
		cubeVolume = Math.pow(a, 3);
		System.out.println("Площадь грани куба = " + cubeFace);
		System.out.println("Площадь поверхности куба = " + cubeSurface);
		System.out.println("Объем куба = " + cubeVolume);
		

	}

}
