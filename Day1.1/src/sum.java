
import java.util.*;

class sum {
//printing sum
	public static void main(String[] args) {
//	
		Scanner myObj = new Scanner(System.in);
		int a = myObj.nextInt();
		int b = myObj.nextInt();
//		int s = a + b;

		for (int i = a; i <= b; i++) {
			System.out.println(i);
			System.out.println();
		}
		myObj.close();
	}

}
