package com.evil.inc.foobar.withgoogle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class DontGetVolunteered {

    /**
     * Don't Get Volunteered!
     * ======================
     * <p>
     * As a henchman on Commander Lambda's space station, you're expected to be resourceful, smart, and a quick thinker. It's not easy building a doomsday device and ordering the bunnies around at the same time, after all! In order to make sure that everyone is sufficiently quick-witted, Commander Lambda has installed new flooring outside the henchman dormitories. It looks like a chessboard, and every morning and evening you have to solve a new movement puzzle in order to cross the floor. That would be fine if you got to be the rook or the queen, but instead, you have to be the knight. Worse, if you take too much time solving the puzzle, you get "volunteered" as a test subject for the LAMBCHOP doomsday device!
     * <p>
     * To help yourself get to and from your bunk every day, write a function called solution(src, dest) which takes in two parameters: the source square, on which you start, and the destination square, which is where you need to land to solve the puzzle.  The function should return an integer representing the smallest number of moves it will take for you to travel from the source square to the destination square using a chess knight's moves (that is, two squares in any direction immediately followed by one square perpendicular to that direction, or vice versa, in an "L" shape).  Both the source and destination squares will be an integer between 0 and 63, inclusive, and are numbered like the example chessboard below:
     * <p>
     * -------------------------
     * , 0, 1, 2, 3, 4, 5, 6, 7,
     * -------------------------
     * , 8, 9,10,11,12,13,14,15,
     * -------------------------
     * ,16,17,18,19,20,21,22,23,
     * -------------------------
     * ,24,25,26,27,28,29,30,31,
     * -------------------------
     * ,32,33,34,35,36,37,38,39,
     * -------------------------
     * ,40,41,42,43,44,45,46,47,
     * -------------------------
     * ,48,49,50,51,52,53,54,55,
     * -------------------------
     * ,56,57,58,59,60,61,62,63,
     * -------------------------
     * <p>
     * Languages
     * =========
     * <p>
     * To provide a Python solution, edit solution.py
     * To provide a Java solution, edit Solution.java
     * <p>
     * Test cases
     * ==========
     * Your code should pass the following test cases.
     * Note that it may also be run against hidden test cases not shown here.
     * <p>
     * -- Python cases --
     * Input:
     * solution.solution(0, 1)
     * Output:
     * 3
     * <p>
     * Input:
     * solution.solution(19, 36)
     * Output:
     * 1
     * <p>
     * -- Java cases --
     * Input:
     * Solution.solution(19, 36)
     * Output:
     * 1
     * <p>
     * Input:
     * Solution.solution(0, 1)
     * Output:
     * 3
     */
    public static int solution(int src, int dest) {
        Queue<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(src);
        int numberOfMoves = -1;

        while (!queue.isEmpty()) {
            numberOfMoves++;
            final int size = queue.size();
            for (int i = 0; i < size; i++) {
                final Integer currentPoint = queue.poll();

                if (currentPoint == dest) {
                    return numberOfMoves;
                }

                final int[] currentCoordinates = toXY(currentPoint);

                final List<int[]> validMoves = getValidMoves(currentCoordinates);
                for (int j = 0; j < validMoves.size(); j++) {
                    final int newPossibleX = currentCoordinates[0] + validMoves.get(j)[0];
                    final int newPossibleY = currentCoordinates[1] + validMoves.get(j)[1];
                    final int nextToVisit = toNumber(new int[]{newPossibleX, newPossibleY});
                    if (!visited.contains(nextToVisit)) {
                        visited.add(nextToVisit);
                        queue.offer(nextToVisit);
                    }
                }
            }
        }

        return numberOfMoves;
    }

// bad not workign always ＼（〇_ｏ）／
//    public static int solution(int src, int dest) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        Set<Integer> visited = new HashSet<>();
//        queue.offer(src);
//        int numberOfMoves = 0;
//
//        while (!queue.isEmpty()) {
//            numberOfMoves++;
//
//            final Integer currentPoint = queue.poll();
//
//            if (currentPoint == dest) {
//                return numberOfMoves;
//            }
//
//            final int[] currentCoordinates = toXY(currentPoint);
//            final int currentX = currentCoordinates[0];
//            final int currentY = currentCoordinates[1];
//
//            for (int i = 0; i < queue.size(); i++) {
//                final int[] queueCoords = toXY(queue.peek());
//                final List<int[]> validMoves = getValidMoves(queueCoords);
//                for (int j = 0; j < validMoves.size(); j++) {
//                    final int newPossibleX = queueCoords[0] + validMoves.get(j)[0];
//                    final int newPossibleY = queueCoords[i] + validMoves.get(j)[1];
//                    final int nextToVisit = toNumber(new int[]{newPossibleX, newPossibleY});
//                    if (nextToVisit == dest) {
//                        return numberOfMoves;
//                    }
//                }
//            }
//
//            if (!visited.contains(currentPoint)) {
//                final List<int[]> validMoves = getValidMoves(currentCoordinates);
//                for (int i = 0; i < validMoves.size(); i++) {
//                    final int newPossibleX = currentX + validMoves.get(i)[0];
//                    final int newPossibleY = currentY + validMoves.get(i)[1];
//                    final int nextToVisit = toNumber(new int[]{newPossibleX, newPossibleY});
//                    if (nextToVisit == dest) {
//                        return numberOfMoves;
//                    }
//                    if (!visited.contains(currentPoint)) {
//                        visited.add(currentPoint);
//                        queue.offer(nextToVisit);
//                    }
//                }
//            }
//        }
//
//        return numberOfMoves;
//    }

    public static List<int[]> getValidMoves(int[] coords) {
        List<int[]> possibleMoves = new ArrayList<>();
        possibleMoves.add(new int[]{-2, -1}); //2 left 1 down
        possibleMoves.add(new int[]{-1, -2}); //2 down 1 left
        possibleMoves.add(new int[]{+2, +1}); //2 right 1 up
        possibleMoves.add(new int[]{+1, +2}); //2 up 1 right
        possibleMoves.add(new int[]{-2, +1}); //2 left 1 up
        possibleMoves.add(new int[]{+1, -2}); //2 down 1 right
        possibleMoves.add(new int[]{-1, +2}); //2 up 1 left
        possibleMoves.add(new int[]{+2, -1}); //2 right 1 down

        List<int[]> validMoves = new ArrayList<>();
        for (int i = 0; i < possibleMoves.size(); i++) {
            final int xMove = coords[0] + possibleMoves.get(i)[0];
            final int yMove = coords[1] + possibleMoves.get(i)[1];
            if ((xMove >= 0 && xMove < 8) && (yMove >= 0 && yMove < 8)) {
                validMoves.add(possibleMoves.get(i));
            }
        }

        return validMoves;
    }

    public static int[] toXY(int number) {
        return new int[]{number % 8, number / 8};
    }

    public static int toNumber(int[] coordinates) {
        return coordinates[0] + coordinates[1] * 8;
    }
}
