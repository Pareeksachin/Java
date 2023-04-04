import java.util.Scanner;
public class bmicheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your weight in kg");
		int weight=sc.nextInt();
		System.out.println("enter height in meters");
		float height=sc.nextFloat();
		
		
		float bmi = weight/(height*height);
		System.out.println("your bmi is");
		System.out.println(bmi);
		if(bmi>20 && bmi < 24) {
			System.out.println("You are fit");			
		}
		else if(bmi<20){
			System.out.println("Increase your diet ");
		}
			
		else {
			System.out.println("You need to weight loss");
		}sc.close();
	}
}
