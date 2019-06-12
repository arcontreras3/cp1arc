import java.util.Scanner;
import java.lang.Math;

public class dice{
    public static void main(String[] args){
    Scanner kin = new Scanner(System.in);

	System.out.println("Rolling Two Dice");
	int will = 1;
	while( will<2 ){
		int dice1 = (int)(Math.random()*6+1);
		int dice2= (int)(Math.random()*6+1);
		int sum=dice1+dice2;
		System.out.println("Die 1: "+dice1+", Die 2: "+dice2+", sum of two dice:"+sum);
		System.out.println("Would you like to roll again? (y/n)");
		String c = kin.nextLine();
			if(c == "y"){
				will=will+0;
			}
			//not sure why this part isn't working
			if(c == "n"){
				will++;
				System.out.print("Goodbye");
			}
}