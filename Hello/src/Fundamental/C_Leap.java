package Fundamental;

import java.util.Scanner;

public class C_Leap {
	public static void main(String[] args) {
		int year = getYearFromUser();
		boolean isLeap = leapYearOrNot(year);
	resultsPrint(isLeap);
	}

	private static void resultsPrint(boolean isLeap) {
		if(isLeap) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a LeapYear");
		}
	}

	private static boolean leapYearOrNot(int year) {
		boolean isLeap = true;
		if(year%4 != 0)	{
			isLeap = false;
			
		}
		return isLeap;
	}

	private static int getYearFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Year Here");
		int year = scanner.nextInt();
		return year;
	}
	

}
