package Fundamental;

import java.util.Scanner;

public class G_Prime_Modular {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// proof by contracdation...
        int num = getDetails();
        boolean isPrime = primeOrNot(num);
        print(isPrime);
	}

	private static void print(boolean isPrime) {
		if(isPrime) {
        	System.out.println("Prime Number");
        }
        else {
        	System.out.println("Not Prime Number");
        }
	}

	private static boolean primeOrNot(int num) {
		boolean isPrime = true;
        for (int i = 2; i < num; i++) {
        	if(num % i == 0) {
        		isPrime = false;
        		break;
        	}
			
		}
		return isPrime;
	}

	private static int getDetails() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number Prime or not");
        int num = scanner.nextInt();
		return num;
	}


}
