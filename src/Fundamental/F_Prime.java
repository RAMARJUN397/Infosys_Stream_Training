package Fundamental;

import java.util.Scanner;

public class F_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// proof by contracdation...
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number Prime or not");
        int num = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
        	if(num % i == 0) {
        		isPrime = false;
        		break;
        	}
			
		}
        if(isPrime) {
        	System.out.println("Prime Number");
        }
        else {
        	System.out.println("Not Prime Number");
        }
	}

}
