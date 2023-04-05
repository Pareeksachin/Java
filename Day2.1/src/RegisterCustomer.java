import java.util.*;
class RegisterCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Customer c1 = new Customer(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
		System.out.println(c1.getDetails());
	}

}
