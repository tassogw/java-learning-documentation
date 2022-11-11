package assets.codes;

public class Structures {
    public static void main(String[] args){
        //Variables
        int player1Pts = 10, player2Pts = 15, player3Pts = 18, winnerPts = 0, roundCount = 0;
        String winner = null;

        //Printing each player's points
        System.out.println("Player 1 points: " + player1Pts);
        System.out.println("Player 2 points: " + player2Pts);
        System.out.println("Player 3 points: " + player3Pts);
        System.out.println(); //Printing an empty line

        /* Checking which player is the winner based on the greater pontuation
         * There's a built-in function in Java to check which value is greater,
         * but for this example, only conditional structures will be used
         */

        if ((player1Pts > player2Pts)||(player1Pts > player3Pts)){
            winnerPts = player1Pts;
            winner = "Player 1";
        } else if (player2Pts > player3Pts){
            winnerPts = player2Pts;
            winner = "Player 2";
        } else {
            winnerPts = player3Pts;
            winner = "Player 3";
        }

        //Printing the winner's name and points based on the if-else above (no tie situation)
        System.out.println("The winner is " + winner + " with " + winnerPts + " points.");
        System.out.println(); //Printing an empty line

        //Countdown to the next competition
        /* Note that a decrement is also valid inside for statements,
         * but in this case, our stopping condition is i reaching 0
         * and it starts with a 10 value
         */
        System.out.println("Countdown to the next competition:");
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println(); //Printing an empty line

        //Reseting the players' points
        player1Pts = 0;
        player2Pts = 0;
        player3Pts = 0;

        //Loop that ends when someones reaches 20 points or more first
        do {
            player1Pts += 7; //Adds 7 pts to player 1
            player2Pts += 5; //Adds 5 pts to player 2
            player3Pts += 3; //Adds 3 pts to player 3
            roundCount++;
            //Prints each player's points with format
            System.out.println("Round " + roundCount);
            System.out.printf("Player 1: %d%nPlayer 2: %d%nPlayer 3: %d%n%n", 
                player1Pts, player2Pts, player3Pts);
        } while ((player1Pts < 20)&&(player2Pts < 20)&&(player3Pts < 20));
        
        //More examples to be added here
    }
}