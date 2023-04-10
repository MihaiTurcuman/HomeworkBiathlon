package org.example;

public class Athlete {
    private final int id;
    private final String name;
    private final String country;
    private final String biathlonTime;
    private final String firstRoundResult;
    private final String secondRoundResult;
    private final String thirdRoundResult;
    private int totalTime;
    private int penalty;

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", totalTime=" + (totalTime / 60) + ":" + (totalTime % 60) +
                ", biathlonTime=" + biathlonTime +
                ", penalty=" + penalty +
                '}';
    }

    public Athlete(int id, String name, String country, String biathlonTime, String firstRoundResult, String secondRoundResult, String thirdRoundResult) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.biathlonTime = biathlonTime;
        this.firstRoundResult = firstRoundResult;
        this.secondRoundResult = secondRoundResult;
        this.thirdRoundResult = thirdRoundResult;
        calculateTotalTime ();
    }


    public int getTotalTime() {
        return totalTime;
    }

    public void calculateTotalTime() {

        String[] tokens = biathlonTime.split (":");
        int minutes = Integer.parseInt (tokens[0]);
        int seconds = Integer.parseInt (tokens[1]);

        String shootResults = firstRoundResult + secondRoundResult + thirdRoundResult;

        for (int j = 0; j < shootResults.length (); j++) {
            if (shootResults.charAt (j) == 'o') {
                penalty += 10;
            }
        }

        totalTime = minutes * 60 + seconds + penalty;


    }
}
