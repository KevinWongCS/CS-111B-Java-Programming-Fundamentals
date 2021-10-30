//In the card game named 'blackjack' players get two cards to start with, and 
//then they are asked whether or not they want more cards. Players can continue 
//to take as many cards as they like. Their goal is to get as close as possible
//to a total of 21 without going over. Face cards have a value of 10.
//
//Write a command line game that plays a simple version of blackjack. The 
//program should generate random numbers between 1 and 10 each time the player 
//gets a card. It should keep a running total of the players cards, and ask the 
//player whether or not it should deal another card.
//
//Submit a single file named BlackjackGame.java using the Assignments 
//tool on the class site. You do not need to submit sample output. Just the 
//source code. The code must compile to receive credit. 

package cs111b;

import java.util.Random;
import java.util.Scanner;

public class  BlackJackGame {
	public static void main(String[] args) {
		char go_again = 'y';
		char hit_me = 'y';
		int card1;
		int card2;
		int new_card;
		
        // note: this creats object called scnr within the scanner class
        Scanner input = new Scanner(System.in);
        // note: this creates object called rand within the scanner class
        Random rand = new Random();
        
        // Greetings
        System.out.println("Welcome to the black jack table.\n");
       
        // Play again loop
        while (go_again == 'y') {
    		int dealer_sum = 0;
    		int player_sum = 0;
    		card1 = (rand.nextInt(10) + 1);
    		card2 = (rand.nextInt(10) + 1);
        	dealer_sum = (rand.nextInt(10) + 1) + (rand.nextInt(10) + 1);
        	player_sum = card1 + card2;
            System.out.println("Here are your cards:");
        	System.out.println("Your have a " + card1 + " and a " + card2);
        	System.out.println("YOUR TOTAL: " + player_sum);
        	System.out.println("DEALER TOTAL: " + dealer_sum);
        	System.out.print("Do you want another card? (y or n): ");
        	hit_me = input.next().charAt(0);
        	
        	// Deal another card loop
        	while (hit_me == 'y') {
        		new_card = (rand.nextInt(10) + 1);
        		if (dealer_sum < 17) {
        			dealer_sum += (rand.nextInt(10) + 1);
        		}
        		player_sum += new_card;
        		if (player_sum > 21 || player_sum == 21) {
        			break;
        		}
        		System.out.println("Your additional card is a " + new_card);
            	System.out.println("Your current TOTAL: " + player_sum);
            	// exit while loop
            	System.out.print("Do you want another card? (y or n): ");
            	hit_me = input.next().charAt(0);
        	}
        	
        	// Dealer rebuttal
        	// note: In most casino blackjack games, a dealer must take a card if he hits 16 or below and stand at 17 or above.
        	while(dealer_sum < 17) {
    			dealer_sum += (rand.nextInt(10) + 1);
    		}
        	System.out.println("YOUR TOTAL: " + player_sum);
        	System.out.println("DEALER TOTAL: " + dealer_sum);
    		
        	// Final conditions before you can play again
        	if (player_sum == 21) {
        		System.out.println("You hit 21!");  
        		System.out.println("You win!");  
        	}
        	else if (player_sum > 21) {
        		System.out.println("Bust, you've gone over 21!");
        		System.out.println("You lose.");
        	}
        	else if (dealer_sum > 21) {
        		System.out.println("Bust, Dealer has gone over 21!");
        		System.out.println("You win!");
        	}
        	else if (player_sum == dealer_sum) {
        		System.out.println("Push! It's a tie.");
        	}
        	else if (player_sum > dealer_sum) {
        		System.out.println("You win!");        	
        	}
        	else {
        		System.out.println("You lose.");
        	}
        	// exit while loop
	        System.out.print("Go again? (y or n): ");
	        go_again = input.next().charAt(0);
	        System.out.println();
        }
        // Farewell
        System.out.println("Good bye.");
	}
}
