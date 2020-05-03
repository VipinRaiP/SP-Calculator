package com.calculator;

import java.io.*;
public class Calculator {

	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    boolean done = false;
	    while(!done) {
	        System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("Calculator Application");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            //System.out.println("3.Multiplication");
            //System.out.println("4.Division");
            System.out.println("3.Exit");
            System.out.println("Enter your choice : ");
            int ch = Integer.parseInt(br.readLine());
            System.out.println("Enter operand 1 : ");
            int a = Integer.parseInt(br.readLine());
            System.out.println("Enter operand 2 : ");
            int b = Integer.parseInt(br.readLine());
            switch (ch) {
                case 1:
                    System.out.println("Result = " + add(a, b));
                    break;
                case 2:
                    System.out.println("Result = " + subtract(a, b));
                    break;
                 /* case 3 :
                    System.out.println("Result = " + multiply(a,b));
                    break;
                case 4 :
                    System.out.println("Result = " + divide(a,b));
                    break;*/
                case 3 :
                    done = true;
                    break;
                default:
                    System.out.println("Invalid option");
            }
            System.out.println("----------------------------------------------------------------------------------------");
        }
		    //System.out.println("6 + 3 = " + add(6, 3));
		    //System.out.println("6 - 3 = " + subtract(6,3));
		    //System.out.println("6 * 3 = " + multiply(6,3));
		    //System.out.println("6 / 3 = " + divide(6,3));
	}

	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}

	/* Feature to be added later */
/*
	public static long multiply(int a, int b) {
		return a * b;
	}

	public static double divide(int a, int b) {
		double result;
		if (b == 0) {
			throw new IllegalArgumentException("Divisor cannot divide by zero");
		} else {
			result = Double.valueOf(a)/Double.valueOf(b);
		}
		return result;
	}
*/

}
