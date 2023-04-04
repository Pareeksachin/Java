
public class TestPrimitiveTypes {

	public static void main(String[] args) {
		byte b1=10;
		byte b2=12;
	//	byte b3=b1+b2; int ---> byte : not allowed
		byte b3=(byte)(b1+b2);
	    byte b4=b1+=10;//no javac err : implicit type casting : javac
	    System.out.println("B4 : "+b4+" B3 : "+b3);
		short s1=100;
		System.out.println(s1);
	//	short s2=b1+s1;
		int i1=12345;
		long l=i1;//int ---> long : auto conversion
		float f1=l;//long --> float : auto conversion
		System.out.println(f1);
		double d1=12.34f;//float --> double
		System.out.println(d1);
		float f2=(float)12.34;	
		System.out.println(f2);
	}

}
