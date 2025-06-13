package com.edu.les03.main;

public class ProductNumbers {

	public static void main(String[] args) {
		int number = 6789;
		if (number <1000 || number > 9999) {
		System.out.println("Ошибка число должно быть четырехзначным");
		return;
		}
		int product = 1;
		while (number > 0) {
		int digit = number % 10;
		product *= digit;
		number /= 10;
		}
		System.out.println("Произведение цифр числа = " + product);

	}

}
