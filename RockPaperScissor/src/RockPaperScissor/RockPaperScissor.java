package RockPaperScissor;
import java.util.Scanner;

public class RockPaperScissor {
	
	public static void main(String[] args)
	{
		
		System.out.println("Start Game");
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissor");
		System.out.println("What do you want to throw?");		
		
		Scanner in = new  Scanner(System.in);
		int play1 = in.nextInt();		
		int comp1 = (int)(Math.random()*3);
		System.out.println(comp1);	
		
		switch (comp1){
			case 0:
				System.out.println("Computer: Rock");	
				break;
			case 1:
				System.out.println("Computer: Paper");
				break;
			case 2:
				System.out.println("Computer: Scissor");
				break;
			default:
				System.out.println("Computer: ERROR");
		}
			
		switch (play1){
			case 1:
				System.out.println("You: Rock");	
				break;
			case 2:
				System.out.println("You: Paper");
				break;
			case 3:
				System.out.println("You: Scissor");
				break;
			default:
				System.out.println("ERROR");
		}
		
		comp1 = comp1 + 1;
		if(play1 == (comp1))
			System.out.println("Its a tie!");
		else{
			switch(play1){
				case 1:
					if(comp1 == 2)
						System.out.println("You lose... :(");
					else if(comp1 == 3)
						System.out.println("You win!!! :D");
					break;
				case 2:
					if(comp1 == 3)
						System.out.println("You lose... :(");
					else if(comp1 == 1)
						System.out.println("You win!!! :D");
					break;
				case 3:
					if(comp1 == 1)
						System.out.println("You lose... :(");
					else if(comp1 == 2)
						System.out.println("You win!!! :D");
					break;
				default:
					System.out.println("ERROR");
			}
		}			
		in.close();		
	}
}
