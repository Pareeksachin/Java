package Assignments;
import java.util.*;
class SwitchCaseUses {

	public static void main(String[] args) {	
	while(true){
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Input your Operation");
			String user = sc.next();
			if(!user.equals("quit")) {
				double a = sc.nextDouble();
				double b = sc.nextDouble();
		switch(user){			
		case "add":
			System.out.println("Addition of a & b is : "+(a+b));
			break;
		case "sub":		
			System.out.println("Subtraction of a & b :"+(a-b));
			break;
		case "mult":		
			System.out.println("Subtraction of a & b :"+(a*b));
			break;
		case "dev":	
			if(b==0) {
				System.out.println("Error! Denominator can't be zero");
			}
			else{System.out.println("Subtraction of a & b :"+(a/b));}
			break;
		case "quit":
			System.exit(0);
			break;
		default:
			System.out.println("You need to enter a Right command");	
		       }
			}
		else {System.out.println("You didn't perform any operation");}
		
			sc.close();}
		}
	}
}


