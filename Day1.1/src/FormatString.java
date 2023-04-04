import java.util.Scanner;

public class FormatString {
	public static void main(String[] args) {
		// scanner(system.in)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id, FirstName, LastName, salary, permenant, dept. name");
		System.out.printf("Emp Id : %d Full Name : %s%s Salary %.3f Is Permenant %b Dept name : %s", sc.nextInt(),
				sc.next(), sc.next(), sc.nextDouble(), sc.nextBoolean(), sc.next());
		sc.close();
	}

}
