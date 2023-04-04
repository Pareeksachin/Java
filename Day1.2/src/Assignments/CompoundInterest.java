package Assignments;
import java.util.Scanner;

class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle Amount");
		double Principal = sc.nextDouble();
		System.out.println("Enter the Annual Interest Rate");
		double  rate = sc.nextDouble();
		System.out.println("Enter the Time period in Years");
		double time = sc.nextDouble();
		System.out.println("Enter the nummber of times the interest is compounded in a year");
		int n = sc.nextInt();
		double amount =Principal ;
		for(int i = 0;i<n*time;i++) {
			amount = amount*(1+(rate/n));
		}
		double CI = amount-Principal;
		System.out.printf("The compound interest is %.2f and the amount is %.2f",CI,amount);
		
		sc.close();
		

	}

}
