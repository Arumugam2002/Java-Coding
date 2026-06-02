import java.util.Scanner;

public class Calculator {

		public static double add(double a, double b)
		{
				double add = a + b;
			
				return add;
			
		}
		public static double subtract(double a, double b)
		{
			double subtract = a - b;
			
			return subtract;
		}
		public static double divide(double a, double b)
		{
			double divide = a / b;
			
			return divide;
		}
		public static double multiply(double a, double b)
		{
			double multiply = a * b;
			
			return multiply;
		}
		
		public static void main(String[] args)
		{
			
			double number1, number2;
			double addition, subtraction, division, multiplication;
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter value of number 1:- ");
			number1 = sc.nextDouble();
			

			System.out.println("Enter value of number 2:- ");
			number2 = sc.nextDouble();
			
			addition = add(number1,number2);
			
			subtraction =subtract(number1,number2);
			
			division = divide(number1,number2);
			
			multiplication = multiply(number1, number2);
			
			System.out.println("Addition of " + number1 + " and " + number2 + " is " + addition);
			
			System.out.println("Subtraction of " + number1 + " and " + number2 + " is " + subtraction);
			System.out.println("Multiplication of " + number1 + " and " + number2 + " is " + multiplication);
			System.out.println("Division  of " + number1 + " and " + number2 + " is " + division);
			
			
		}
}
