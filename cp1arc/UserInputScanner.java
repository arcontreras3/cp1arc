import java.util.Scanner;

public class UserInputScanner{
	public static void main(String[] args){
		Scanner kin=new Scanner(System.in);

		System.out.print("What is first name? ");
		String firstname = kin.nextLine();

		System.out.print("What is your last name? ");
		String lastname = kin.nextLine();

		System.out.println("Hello " + firstname + " " + lastname + ", it's nice to meet you!");

		System.out.println("what is your street address? ");
		String address = kin.nextLine();

		System.out.println("What city do you live in? ");
		String city = kin.nextLine();
	
		System.out.println("What state do you live in? ");
		String state = kin.nextLine();

		System.out.println("What is your zip code? ");
		String zipcode = kin.nextLine();

		System.out.println(firstname + " " + lastname);
		System.out.println(address);
		System.out.println(city + ", " +state + " " +zipcode);
	}
}