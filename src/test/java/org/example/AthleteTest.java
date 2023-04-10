package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AthleteTest {

    @Test
    public void getTotalTime() {
        Athlete john = new Athlete (99, "John", "CA", "6:24", "xoxxo", "oxoxo", "xxxxx");
        assertEquals(john.getTotalTime(), 434);

    }


}
