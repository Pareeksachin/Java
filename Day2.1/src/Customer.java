
public class Customer {
	private String name;
    private String email;
    private int age;
    private double creditLimit;

    public Customer(String name,String email,int age, double creditLimit) {
    	this.name = name;
    	this.email = email;
    	this.age = age;
    	this.creditLimit = creditLimit;
    	
    }
    public String getDetails() {
        return "Name: " + name + "\nEmail: " + email + "\nAge: " + age + "\nCredit Limit: " + creditLimit;
    }
    
}
