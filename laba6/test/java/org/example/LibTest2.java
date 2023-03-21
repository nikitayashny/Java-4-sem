package org.example;

import org.example.Planet.Planet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class LibTest2 {
    private Planet a  = new Planet();
    @Before
    public void initObj()
    {
        a.setName("Earth");
        a.setRadius(6000);
        a.setTemperature(20);
        a.setAtmosphere("yes");
        a.setLife("yes");
        a.setSputnik("Moon");
    }
    @After
    public void printBook()
    {
        System.out.println(a.toString());
    }
    @Test(timeout = 2000)
    public void testPlanet()
    {
        assertNotNull(a);
    }
}