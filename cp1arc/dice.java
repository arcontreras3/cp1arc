import java.util.Scanner;
import java.lang.Math;

class dice{
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
 
	System.out.println("Rolling two dice");
	int c = 1;


	while (c==1){
		int dice1 = (int)(Math.random()*6+1);
		int dice2 = (int)(Math.random()*6+1);
		System.out.println("Die 1:" + dice1 + ", Die 2: " + dice2 + ", sum of two dice: " + (dice1+dice2));
		System.out.println("Would you like to roll again? (y=1/n=2)");
		c = kin.nextInt();
	//just dont type variable type of c when reassigning value
		if (c==2){
		System.out.println("Goodbye");
	}
}
	
	

}
}