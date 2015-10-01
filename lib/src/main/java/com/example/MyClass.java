package com.example;

import java.text.DecimalFormat;

public class MyClass
{
    public static void main(String[] args)
    {
        // Array for total points scored by each player over the season
        int[] avgPtsArray = {951, 11, 903, 108, 151, 1300, 482, 376, 592, 28, 836, 1443, 639, 432};

        double avgPts = 0;

        // Adds total points together
        for (int i : avgPtsArray)
        {
            avgPts += i;
        }

        avgPts = avgPts / 82;

        System.out.println("");
        System.out.println("The average amount of points scored for the season is " +
                new DecimalFormat("#0.0").format(avgPts) + "\n");

        // Array for total rebounds by top three percentage shooters
        int[] avgRebArray = {164, 246, 920};

        double avgReb = 0;

        // Adds total rebounds together for the 3 players
        for (int i : avgRebArray)
        {
            avgReb += i;
        }

        avgReb = (avgReb / 82) / 3;

        System.out.println("The average amount of rebounds per game from the top three percentage " +
                "shooters is " + new DecimalFormat("#0.0").format(avgReb));

        double[] roseAvgStats = {17.7, 3.0, 0.7};
        double[] butlerAvgStats = {20.0, 5.9, 1.8};

        int count = 0;

        while (count <= 3)
        {
            count++;
            System.out.println("");

            if (count == 1)
            {
                System.out.println("Rose average points per game: " + roseAvgStats[0]);
                System.out.println("Butler average points per game: " + butlerAvgStats[0]);
            }

            if (count == 2)
            {
                System.out.println("Rose average free throws per game: " + roseAvgStats[1]);
                System.out.println("Butler average free throws per game: " + butlerAvgStats[1]);
            }

            if (count == 3)
            {
                System.out.println("Rose average steals per game: " + roseAvgStats[2]);
                System.out.println("Butler average steals per game: " + butlerAvgStats[2]);
            }
        }

        System.out.println("If you wanted to base it off stats then Jimmy Butler is a better player" +
                "than Derrick Rose..");
    }
}
