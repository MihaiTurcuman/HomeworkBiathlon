package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class AthleteScoring {
    private TreeSet<Athlete> athletes = new TreeSet<>(new AthletesComparator());

    public void readAthletes() {

        File f = new File("C:\\Users\\turcu\\Desktop\\Java\\Projects\\HomeworkBiathlon\\src\\main\\standings.csv");

        try {
            BufferedReader br = new BufferedReader(new FileReader (f));
            String line;
            String[] tokens;
            int lineCounter = 1;

            while ((line = br.readLine()) != null) {
                Object StringUtils = new Object();
                tokens = File.separator.split(Pattern.quote("\\"));
                if (tokens.length != 7) {
                    System.err.println("Invalid data in csv at line: " + lineCounter);
                    break;
                }
                athletes.add(new Athlete (Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6]));
            }

        } catch (
                IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public TreeSet<Athlete> getAthletes() {
        return athletes;
    }

    public void printResults() {

        System.out.println("Results: ");
        int i = 1;
        for (Athlete athlete : athletes) {
            System.out.println("Ranking " + i + " " + athlete);
            i++;
        }
    }

}

