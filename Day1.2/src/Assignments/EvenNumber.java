package Assignments;
import java.util.Scanner;

class EvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = a ; i <= b;i++) {
			if(i%2==0) {System.out.print(i+" ");}
		}
		sc.close();
	}

}
