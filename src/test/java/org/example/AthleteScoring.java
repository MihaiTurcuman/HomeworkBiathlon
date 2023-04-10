package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class AthleteScoring {

    AthleteScoring testAthleteScoring = new AthleteScoring ();

    @Before
    public void setUp(){
        testAthleteScoring.readAthletes();
    }

    private void readAthletes() {
    }


    @Test
    public void readAthletesTest() {

        assertEquals(testAthleteScoring.getAthletes().size(), 3);

    }

    private Collection<Object> getAthletes() {
        return null;
    }


}
