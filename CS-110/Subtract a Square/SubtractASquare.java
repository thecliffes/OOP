import java.util.Scanner;

public class SubtractASquare {
	public static void main(String[] args){
		boolean allBool = true;
		int pileChoice = 1;
		int i = 1;
		final int counter = 3;
		final int[] heaps = {13, 13, 13}; 
		Scanner in = new Scanner(System.in);
		
		int swch = 1;
		while ((heaps[0] + heaps[1] + heaps[2]) != 0){
			switch (swch){ //switches between player 1 and 2
			  case 1:
			    i = 1;
			    swch = 2;
			    break;
			  case 2:
			    i = 2;
			    swch = 1;
			    break;
			  default:
			}
		
			System.out.println("Remaining coins: " + heaps[0] +", " + heaps[1] + ", " + heaps[2]);
			allBool = true;
			while (allBool) { //while loops keeps going until correct input is added
				System.out.print("Player " + i +": choose a pile:");
				try { //checks player types correct input 
					pileChoice = in.nextInt();
					for (int j = 0; j < counter; j++) { //loops through all 3 heaps
						if (pileChoice == (j + 1) && heaps[j] != 0) { //ensures heap is above 0
							allBool = false; //only allows 1 - 3 from player input
						} 
					}
					if (allBool) { //error if player inputs outside of range
						System.out.println("ERROR: Choose another pile between 1 and 3");
					}
					
				} catch(Exception e) { //error if player enters non int
					System.out.println("ERROR: Choose a pile between 1 and 3");
					in.next();
				}
			}
			
			allBool = true;
			while (allBool) {
				System.out.print(" Now choose a square number of coins: ");
				try {//ensures correct input is added
					int coinNumber = in.nextInt(); //ensures square num is input
					if (coinNumber % Math.sqrt(coinNumber) == 0) { //works out if num is sq
						for (int j = 0; j < counter; j++) {
							if (pileChoice == (j + 1) && (heaps[j] - coinNumber >= 0)) {
								heaps[j] = heaps[j] - coinNumber; 
								allBool = false; //takes away correct num from heap
							}
						}
					}
					if (allBool) { // error if non sq num is chosen
						System.out.println("ERROR: Choose a squared number of coins");
					}
				} catch(Exception e) { //error if non int is input
					System.out.println("ERROR: Choose a squared number of coins");
					in.next();
				}
			}
		}
		if (heaps[0] + heaps[1] + heaps[2] == 0) { //checks if heaps are empty
			System.out.println("Player " + i + " wins!"); //winning message
		}
	}
}

