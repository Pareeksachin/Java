import java.util.Scanner;
class CheckIfelse {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("please enter the month");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
if(month == 12 || month == 1 || month == 2) {
	System.out.println("season is Winter");}
else if( month == 3 || month == 4 || month == 5)
{System.out.println("season is summer");}
else if( month == 6 || month == 7 || month == 8)
{System.out.println("season is springs");}
else if( month == 9 || month == 10 || month == 11)
{System.out.println("season is Autumn");}

else {
	System.out.println("You need to put the range between 1 to 12");
}sc.close();
	}
}

