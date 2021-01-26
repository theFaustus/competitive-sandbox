package com.evil.inc;

import com.sun.xml.internal.ws.api.message.Packet;

/**
 * Build a Car
 * Ever wondered how it is to build cars? Today you can have a taste of it and build your own, very simplified version
 * of car using your programming skills. We are going to build vehicles like these below: __ ____ ____ | []\ | []\ |[] []
 * -o--o-' -o-o------o-' -o-o------o-o-'
 * <p>
 * (Hope that those resemble cars|buses|trucks).
 * <p>
 * Short introduction
 * A single vehicle is built with 3 layers:
 * <p>
 * first: ' ____' second: | []\ third: -o--o-'
 * <p>
 * first layer (top) consists of one space character ' ' and underscores '_';
 * <p>
 * second layer consists of a vertical line (rear) |, empty spaces (filling) ' ', square brackets (doors) [] and a backslash (front) \ ;
 * <p>
 * third layer consists of dashes (frame) '-', lowercase O letters (axles|wheels) 'o' and one single quote (headlight) "'"
 * <p>
 * Problem specification
 * Your aim is to implement 'Car' class/constructor. The instance of 'Car' must contain 2 properties/members body and chassis which themselves are objects.
 * <p>
 * Each instance object (body and chassis) must contain one property called component.
 * <p>
 * Let's assume that car refers to an instance of Car, then tests can refer to component properties by: car.chassis.component and car.body.component.
 * <p>
 * The component properties are of String type, and contain layers of the car. body.component constitutes of first two layers,
 * whereas chassis.componentcontains the last, third layer.
 * <p>
 * In Java, all these properties/objects have to be public.
 * <p>
 * The Car constructor takes two integer arguments:
 * <p>
 * length specifies the length of the car (in number of characters). Must be at least 7 characters wide (as the first car above),
 * if not, an Exception | Error must be thrown;
 * doors specifies the number of doors (square brackets) in the second layer. Must be at least 1, if not, an exception must be thrown.
 * Another exception must be thrown when the doors parameter is too big for the current car (when we cannot fit that
 * number of doors in the given length).
 * The specified error cases are the only 3 expected (in Java: throw an unchecked exception), therefore the tests will
 * use only positive integers as parameters to Car()
 * <p>
 * Design guidelines
 *  _____________          ______          __________
 * |[][]   [][][]\        |[][][]\        |        []\
 * -o-o-o-----o-o-'       -o----o-'       -o-o------o-'
 * As we can see, our Car class is quite flexible in terms of number of axles and doors, and here the following applies.
 * <p>
 * As the length parameter increases, we want our cars|trucks to keep balance, hence the number of axles has to increase.
 * The third axle has to be added at the length = 12 and subsequent axles have to be added every time the given length is wider
 * by 2 (next axle at length = 14 and so on). As the parameter is big enough we add axles once to the rear (left), once to
 * the front (right) part of the car - starting from the rear.
 * <p>
 * The situation works similarly with the doors parameter. We try to fit the given number of doors in the given length.
 * The first door is added to the front, the next to the rear, the next again to the front.
 * <p>
 * One final guide:
 * <p>
 * first layer's length = length - 2
 * second layer's length = length - 1
 * third layer's length = length
 * first and second layers need a line feed character at their end: \n.
 */
public class CarKata {
    private final int length;
    private final int doors;
    public Body body;
    public Chassis chassis;

    public CarKata(int length, int doors) {
        if (length < 7)
            throw new RuntimeException();
        if (doors < 1 || doors > length / 2)
            throw new RuntimeException();
        this.length = length;
        this.doors = doors;

        body = new Body();
        chassis = new Chassis();

        firstLayer(length);
        secondLayer(length);
        thirdLayer(length);
    }

    private void thirdLayer(int length) {
        String thirdLayer = "";
        thirdLayer += "-o-";
        for (int i = 0; i < length - 7; i++) {
            thirdLayer += "-";
        }
        thirdLayer += "-o-'";

        for (int i = 0, parity = 0; i <= length - 12; i += 2, parity++) {
            if (parity % 2 == 0) {
                StringBuilder stringBuilder = new StringBuilder(thirdLayer);
                thirdLayer = stringBuilder.replace(stringBuilder.indexOf("---"), stringBuilder.indexOf("---") + 3, "-o-").toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder(thirdLayer);
                thirdLayer = stringBuilder.replace(stringBuilder.lastIndexOf("---"), stringBuilder.lastIndexOf("---") + 3, "-o-").toString();
            }
        }

        chassis.component += thirdLayer;
    }

    private void secondLayer(int length) {
        String secondLayer = "";
        secondLayer += "|";
        for (int i = 0; i < length - 5; i++) {
            secondLayer += " ";
        }
        secondLayer += "[]\\\n";
        int currentNumberOfDoors = 1;
        for (int i = 0; i < secondLayer.length(); i++) {
            if (doors > currentNumberOfDoors && secondLayer.charAt(secondLayer.indexOf(' ') + 1) == ' ') {
                secondLayer = new StringBuilder(secondLayer).replace(secondLayer.indexOf(' '), secondLayer.indexOf(' ') + 2, "[]").toString();
                currentNumberOfDoors++;
            }
            if (doors > currentNumberOfDoors && secondLayer.charAt(secondLayer.lastIndexOf(' ') - 1) == ' ') {
                secondLayer = new StringBuilder(secondLayer).replace(secondLayer.lastIndexOf(' ') - 1, secondLayer.lastIndexOf(' ') + 1, "[]").toString();
                currentNumberOfDoors++;
            }
        }
        body.component += secondLayer;
    }

    private void firstLayer(int length) {
        body.component += " ";
        for (int i = 0; i < length - 3; i++) {
            body.component += "_";
        }
        body.component += "\n";
    }

    class Chassis {
        public String component = "";
    }

    class Body {
        public String component = "";
    }
}
