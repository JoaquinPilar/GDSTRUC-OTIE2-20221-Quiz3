package com.Quiz3;

// Quiz #3: Matchmaking
// Instructions: Create a matchmaking algorithm for players.

// This is the main class
public class Main
{
    public static void main(String[] args)
    {

        // This shows the capacity of our queue
        // The capacity is at 5
        Queue playerQue = new Queue(5);

        // This displays the player tag to our program
        // Our player id starts at 1 and increments for every new player added
        int playerId= 1;

        // This shows how many games will start (1-10 games)
        // The program will be terminated once 10 games have been reached
        int gameInProgress= 1;
        while (gameInProgress < 10)
        {

            // This function generates a random number for how many players will be added to the queue
            for (int i = 1; i < rng(7); i++)
            {
                playerQue.add(new Player("Player", playerId));
                playerId++;
            }

            // This is a function that removes the players when a game fails to proceed
            if (playerQue.size() > 6)
            {

                // If the player queue size is less than 5, the players are removed and the game restarts
                gameInProgress++;
                for (int i = 0; i < 5; i++)
                {
                    playerQue.remove();
                }
            }

            // This outputs how many games are starting
            System.out.println("Game: " + gameInProgress);
            System.out.println("----------");

            // This outputs the number of players in the queue
            System.out.println("Queued Players: ");
            playerQue.printQue();
            pressEnter();
        }

        // This outputs at the end of the program
        System.out.println("10 games have been completed...");
        System.out.println("the program will now be terminated...");
    }

    // This function generates a random number for how many players will be removed to the queue
    public static int rng(int max)
    {
        int min = 1;
        max = 7;
        return (int)(Math.random()*(max-min+1)+min);
    }

    // This outputs at every turn of the program
    public static void pressEnter()
    {
        System.out.println("\n" + "PRESS ENTER KEY TO CONTINUE");
        try
        {
            System.in.read();
        }

        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}