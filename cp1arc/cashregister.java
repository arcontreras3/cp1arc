import java.util.Scanner;

class cashregister{
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    
    //takes in bill and paid amount
    System.out.println("Welcome to the Change Generator");
    System.out.println("Please Enter the amount of a Bill:");
    System.out.print("Bill: $");
    double bill = kin.nextDouble();
    System.out.println("Please enter the amount Paid");
    System.out.print("Paid: $");
    double paid = kin.nextDouble();
    
    //finds the change
    System.out.println("Change: $" + (paid-bill));
    double change=paid-bill;
    
    //this part finds the amount of twenties and how much is left over
    int n20s= (int)change/20;
    System.out.println("$20: "+ n20s);
    double rof20s=change%20;
    
    //find the amount of tens and how much is left
    int n10s = (int)(rof20s)/10;
    System.out.println("$10: " + n10s);
    double rof10s= rof20s%10;
    
    //find the amount of fives and remainder
    int n5s = (int)(rof10s)/5;
    System.out.println("$5: " + n5s);
    double rof5s= rof10s%5;
    
    //find the amount of ones and remainder
    int n1s= (int)(rof5s)/1;
    System.out.println("$1: " + n1s);
    double rof1s = rof5s%1;
    
    //find the number of cents so it will be easier to find coin values
    double cents= rof1s*100;
    
    //find the number of quarters and the remainder
    int quarters = (int)(cents)/25;
    System.out.println("$.25: " + quarters);
    double rquarters = cents%25;
    
    //find the number of dimes and the remainder
    int dimes = (int)(rquarters)/10;
    System.out.println("$.10: " + dimes);
    double rdimes=rquarters%10;
    
    //find the number of nickels and the remainder
    int nickels= (int)(rdimes)/5;
    System.out.println("$.05: " + nickels);
    double rnickels=rdimes%5;
    
    //find the number of pennies
    int pennies = (int)(rnickels)/1;
    System.out.println("$.01: " + pennies);
  }
}