package com.edu.les03.main;
import java.util.Scanner;
public class Tren_1 {

	public static void main(String[] args) {
			double x, y;
			double sum;
			Scanner sc = new Scanner(System.in);
			
			// Input for the first value
			System.out.print("Введите первое значение: ");
			while(!sc.hasNextDouble()) {
			sc.nextLine();// Clear the invalid input
			System.out.print("Неверный ввод. Введите первое значение: ");
			}
			x = sc.nextDouble();
			
			//input for the second value
			System.out.print("Введите второе значение: ");
			while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Неверный ввод. Введите второе значение: ");
			}
			y = sc.nextDouble();
			
			//Calculate the sum
			sum = addition(x, y);
			
			//Output the result
			System.out.println(x + " + " + y + " = " + sum);
			}
			public static double addition(double a, double b) {
			double sum;
			sum = a + b;
			return sum;
			}
	}


