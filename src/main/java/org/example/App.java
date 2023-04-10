package org.example;


public class App 
{
    public static void main( String[] args )
    {
        AthleteScoring athleteScoring = new AthleteScoring ();

        athleteScoring.readAthletes();
        athleteScoring.printResults();
    }
}
