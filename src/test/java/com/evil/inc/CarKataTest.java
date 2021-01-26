package com.evil.inc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarKataTest {
    // test body.component
    @Test
    public void testBodyComponent() throws Exception {
        CarKata car = new CarKata(7, 1);
        assertNotNull("'Car.body.component' is not defined", car.body.component);
    }

    // test chassis.component
    @Test
    public void testChassisComponent() throws Exception {
        CarKata car = new CarKata(7, 1);
        assertNotNull("'Car.chassis.component' is not defined", car.chassis.component);
    }

    // test length-exception
    @Test (expected = java.lang.Exception.class)
    public void testLengthException() throws Exception {
        CarKata car = new CarKata(6, 1);
    };

    // test no-door-exceptions
    @Test (expected = java.lang.Exception.class)
    public void testNoDoorException() throws Exception {
        CarKata car = new CarKata(7, 0);
    };

    // test too-many-doors-exception
    @Test(expected = java.lang.Exception.class)
    public void testManyDoorsException() throws Exception {
        CarKata car = new CarKata(7, 4);
    };

    // test small car
    @Test
    public void testSmallCar() { testCar(7, 1, " ____\n|  []\\\n-o--o-'"); }

    // test medium car
    @Test
    public void testMediumCar() { testCar(12, 2, " _________\n|[]     []\\\n-o-o-----o-'"); }

    // test large car
    @Test
    public void testLargeCar() { testCar(17, 5, " ______________\n|[][]    [][][]\\\n-o-o-o------o-o-'"); }

    // helper method
    private void testCar(int length, int doors, String test) {
        CarKata car;
        String value, output;
        try { car = new CarKata(length, doors); }
        catch (Exception e) { System.out.println("Unexpected Exception!" + e); return; }
        value = car.body.component + car.chassis.component;
        output = "\nExpected car:\n" + test + "\nYour car:\n" + value + "\n\n";
        assertEquals(output, value, test); // test
        System.out.println(output);
    }
}
