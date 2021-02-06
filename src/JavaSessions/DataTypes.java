package JavaSessions;

/**
 * This class is for Data types in Java
 * 
 * @author Naveen
 *
 */
public class DataTypes {

	public static void main(String[] args) {

		// this is my first java code and im so happy

		// Data types: type of data
		// statically typed or strongly typed language: C, C++, Java

		// types:
		// 1. primitive data types:
		// a. Boolean type: boolean : true/false
		// b. Numeric type:
		// b.1: character: char
		// b.2: Integral Values:
		// 1. Integer: byte, short, int, long
		// 2. Floating-point: float, double

		// 2. Non-Primitive Data Types: String, Array, Interface, Classes, Objects,
		// etc...

		// byte:
		// size: 1 byte = 8 bits
		// range: -128 to 127

		byte b = 10;
		b = 20;

		byte b1 = 100;
		byte b2 = 0;
		byte b3 = -10;
		byte age = 30;
		byte days = 7;

		System.out.println(b);
		System.out.println(age);
		System.out.println(age + days);// 37

		// short:
		// size: 2 bytes = 16 bits
		// range: -32768 to 32767
		short s = 100;
		short s1 = 34;
		short s2 = -10;
		System.out.println(s1);

		// int:
		// size: 4 bytes = 32 bits
		// range: -2147483648 to 2147483647
		int i = 100;
		int i1 = -90;
		int k = 1000;
		int distance = 100000;
		System.out.println(distance);
		System.out.println(i + i1);// 10
		System.out.println(i + s1);

		// long:
		// size: 8 bytes = 64 bits
		// range:
		long l = 10;
		long dist = 100998899;
		long population = 12121221;
		System.out.println(population);

		// float:
		// size: 4 bytes = 32 bits
		// range: after . it may take upto 7 digits
		float f1 = 12.33f;
		float f3 = (float) 45.44;
		float f2 = 100;// 100.0

		System.out.println(f1);
		System.out.println(f3);
		System.out.println(f2);

		// double:
		// size: 8 bytes = 64 bits
		// range: after . it may take upto 16 digits
		double d = 12.334;
		double d1 = 1000;

		// char: only single digits within single quotes
		// size: 2 bytes = 16 bits
		// Unicode chars:
		char c = 'a';// 97
		char c11 = 'b';// 98
		char c1 = '1'; // 0-9
		char c2 = '$';
		char gender = 'F';
		char currency = '*';

		// a-z: 97-122
		// A-z: 65 - 90
		// 0-9: 48 - 57

		System.out.println(c + c11);// 97+98 = 195

		System.out.println(currency);

		System.out.println(gender);

		// boolean:
		// size: ~0.999 bits = 1 bit
		boolean bl1 = true;
		boolean bl2 = false;

		// String: is a default class
		String str = "Hello World";
		String str1 = "testing";
		String str2 = "100";

		System.out.println(str);
		System.out.println(str + str1);
		System.out.println(10 + 10);
		System.out.println(20 / 10);

		System.out.println(4 / 2);// 2
		System.out.println(5 / 2);// 2.5-> 2
		System.out.println(5.0 / 2); // 2.5
		System.out.println(5.0 / 2.0); // 2.5


	}

}