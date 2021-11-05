// Name: Kevin Wong

package cs111b;
import java.util.Scanner;
import java.util.Arrays;

public class pokerhand {

	public pokerhand() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	Scanner scnr = new Scanner(System.in);
	int card1;
	int card2;
	int card3;
	int card4;
	int card5;
	final int total_cards = 5;
	int[] pokerhand = new int[total_cards]; 
	int[] sortedPokerhand = new int[total_cards]; 
	int i;
	int j;
	int pair_count;
	int low_card;
	boolean straight;
	boolean pair;
	int temp;
	
	
	
	// Getting user input and Reading cards into an array
	System.out.println("Enter five numberic cards, no face cards. Use 1 = 9.");
	for(i = 0; i < pokerhand.length; ++i) {
		System.out.print("Card " + (i + 1) + ": ");
		pokerhand[i] = scnr.nextInt();	
	}
	
	// TEST array
//	System.out.print("test print array" + pokerhand[0]);
//	System.out.print(pokerhand[1]);
//	System.out.print(pokerhand[2]);
//	System.out.print(pokerhand[3]);
//	System.out.println(pokerhand[4]);
	
	// Pair checker
	pair = true;
	pair_count = 0;
	for (i = 0; i < pokerhand.length; ++i) {
		for (j = 1; j < pokerhand.length; ++j) {
			if ((pokerhand[i] == pokerhand[j]) && (i != j)) {
				++pair_count;
			}
		}	
	}
	if (pair_count == 0) {
		pair = false;
	}
	
	// straight checker
	straight = true;
	Arrays.sort(pokerhand);
	for (i = 0; i < (pokerhand.length - 1); ++i){
		if (pokerhand[i] != pokerhand[i + 1] - 1) {
			straight = false;
			break;
			}
		}
	
	// final output
	if (straight == true) {
		System.out.print("Straight!");
	}
	// High card statement nested inside straight checker
	else if (pair == true) {
		System.out.print("Pair!");
	}
	
	else {
		System.out.print("High Card!");
	}
	

	
	
	}
}	
