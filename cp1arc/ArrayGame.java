//Anthony, Anthony, Christina, and Zach (Group1)

import java.util.Scanner;
import java.lang.Math;

class ArrayGame{
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
	String[][]grid= { {"O", "O", "O", "O"}, {"O", "O", "O", "O"}, {"O", "O", "O", "O"}, {"O", "O", "O", "O"} };
	int goalrow=(int)(Math.random()*4);
	int goalcol=(int)(Math.random()*4);
	grid[goalrow][goalcol]="*";
	
	int xrow = 0;
	int xcol= 0;
	grid[xrow][xcol]="x";
	for(int row = 0; row < grid.length; row++){
		for(int col = 0; col <grid[0].length; col++){
			System.out.print(grid[col][row] + " ");
	}
	System.out.println();
}
	int y=0;
	while (y==0){
		grid[xrow][xcol]="x";
		System.out.println("Which way do you want to move? Type left,right,down, or up");
		String answer=kin.nextLine();
		
		if(answer.equals("up")){
			grid[xrow][xcol]="O";
			xcol--;
			grid[xrow][xcol]="x";
		}
		if(answer.equals("down")){
			grid[xrow][xcol]="O";
			xcol++;
			grid[xrow][xcol]="x";
		}
		if(answer.equals("left")){
			grid[xrow][xcol]="O";
			xrow--;
			grid[xrow][xcol]="x";
		}
		if(answer.equals("right")){
			grid[xrow][xcol]="O";
			xrow++;
			grid[xrow][xcol]="x";
		}
		if (xrow == goalrow && xcol == goalcol){
			System.out.println("You win");
			y=1;
		}
		for(int row = 0; row < grid.length; row++){
			for(int col = 0; col <grid[0].length; col++){
			System.out.print(grid[col][row] + " ");
		}
		System.out.println();
	}


}
	


}
}