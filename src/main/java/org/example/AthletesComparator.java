package org.example;

import java.util.Comparator;

public class AthletesComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete a1, Athlete a2) {
        return a1.getTotalTime () - a2.getTotalTime ();
    }
}
