package com.evil.inc.foobar.withgoogle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

public class PrepareTheBunniesEscape {
    public static int solution(int[][] map) {
        Point destRowCol = new Point(map.length - 1, map[map.length - 1].length - 1);
        Point srcRowCol = new Point(0, 0);
        Set<Integer> brokenWalls = new HashSet<>();

        final int[][] backup = copy(map);

        final int numberOfWalls = getNumberOfWalls(map);

        int minSteps = Integer.MAX_VALUE;
        boolean isBrokenWall = false;

        for (int k = 0; k < numberOfWalls; k++) {
            int steps = 0;
            map = copy(backup);
            isBrokenWall = false;
            Queue<Point> queue = new ArrayDeque<>();
            Set<Point> visited = new HashSet<>();

            queue.offer(srcRowCol);
            visited.add(srcRowCol);

                while (!queue.isEmpty()) {
                    steps++;

                    final int size = queue.size();
                    for (int i = 0; i < size; i++) {
                        final Point currentPoint = queue.poll();
                        if (isExit(currentPoint, destRowCol)) {
                            if (steps < minSteps)
                                minSteps = steps;
                            break;
                        }
                        final int maxRow = map.length - 1;
                        final int maxCol = map[currentPoint.col].length - 1;
                        final List<Point> moves = getAllMoves();

                        for (Point move : moves) {
                            final int newRow = currentPoint.row + move.row;
                            final int newCol = currentPoint.col + move.col;
                            final Point newPoint = new Point(newRow, newCol);
                            if (isValidMove(newRow, newCol, maxRow, maxCol) && isWall(
                                    map[newRow][newCol]) && !isBrokenWall && !brokenWalls.contains(newRow)) {
                                isBrokenWall = true;
                                brokenWalls.add(newRow);
                                for (int j = 0; j <= maxCol; j++) {
                                    map[newRow][j] = 0;
                                }
                            }
                            if (isValidMove(newRow, newCol, maxRow, maxCol) && !isWall(map[newRow][newCol])) {
                                if (isExit(newPoint, destRowCol)) {
                                    steps++;
                                    if (steps < minSteps)
                                        minSteps = steps;
                                    break;
                                }
                                if (!visited.contains(newPoint)) {
                                    visited.add(newPoint);
                                    queue.offer(newPoint);
                                }
                            }
                        }
                    }
                }
        }


        return minSteps;
    }

    public static int[][] copy(int[][] map){
        int [][] myInt = new int[map.length][];
        for(int i = 0; i < map.length; i++)
        {
            int[] aMatrix = map[i];
            int   aLength = aMatrix.length;
            myInt[i] = new int[aLength];
            System.arraycopy(aMatrix, 0, myInt[i], 0, aLength);
        }
        return myInt;
    }

    public static int getNumberOfWalls(int[][] map) {
        int numberOfWalls = 0;
        for (int i = 0; i < map.length; i++) {
            for (int i1 = 0; i1 < map[i].length; i1++) {
                if (map[i][i1] == 1) {
                    numberOfWalls++;
                    break;
                }

            }
        }
        return numberOfWalls;
    }

    public static void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int i1 = 0; i1 < map[i].length; i1++) {
                System.out.print(map[i][i1] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isWall(final int i1) {
        return i1 == 1;
    }

    public static boolean isExit(Point rowCol, Point dest) {
        return rowCol.row == dest.row && rowCol.col == dest.col;
    }

    public static boolean isValidMove(int row, int col, int maxRow, int maxCol) {
        return ((row >= 0 && row <= maxRow) && (col >= 0 && col <= maxCol));
    }

    private static List<Point> getAllMoves() {
        List<Point> possibleMoves = new ArrayList<>();
        possibleMoves.add(new Point(-1, 0));
        possibleMoves.add(new Point(+1, 0));
        possibleMoves.add(new Point(0, +1));
        possibleMoves.add(new Point(0, -1));
        return possibleMoves;
    }

    public static List<Point> getValidMoves(int[] rowCol, int maxRow, int maxCol) {
        List<Point> possibleMoves = getAllMoves();

        List<Point> validMoves = new ArrayList<>();
        for (Point move : possibleMoves) {
            final int newRow = rowCol[0] + move.row;
            final int newCol = rowCol[1] + move.col;
            if (isValidMove(newRow, newCol, maxRow, maxCol)) {
                validMoves.add(move);
            }
        }

        return validMoves;
    }

    static class Point {
        int row;
        int col;

        public Point(final int row, final int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            final Point point = (Point) o;
            return row == point.row && col == point.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }

        @Override
        public String toString() {
            return "{" + row +
                    ", " + col +
                    '}';
        }
    }

    /*
    Prepare the Bunnies' Escape
===========================

You're awfully close to destroying the LAMBCHOP doomsday device and freeing Commander Lambda's bunny workers, but once they're free of the work duties the bunnies are going to need to escape Lambda's space station via the escape pods as quickly as possible. Unfortunately, the halls of the space station are a maze of corridors and dead ends that will be a deathtrap for the escaping bunnies. Fortunately, Commander Lambda has put you in charge of a remodeling project that will give you the opportunity to make things a little easier for the bunnies. Unfortunately (again), you can't just remove all obstacles between the bunnies and the escape pods - at most you can remove one wall per escape pod path, both to maintain structural integrity of the station and to avoid arousing Commander Lambda's suspicions.

You have maps of parts of the space station, each starting at a work area exit and ending at the door to an escape pod. The map is represented as a matrix of 0s and 1s, where 0s are passable space and 1s are impassable walls. The door out of the station is at the top left (0,0) and the door into an escape pod is at the bottom right (w-1,h-1).

Write a function solution(map) that generates the length of the shortest path from the station door to the escape pod, where you are allowed to remove one wall as part of your remodeling plans. The path length is the total number of nodes you pass through, counting both the entrance and exit nodes. The starting and ending positions are always passable (0). The map will always be solvable, though you may or may not need to remove a wall. The height and width of the map can be from 2 to 20. Moves can only be made in cardinal directions; no diagonal moves are allowed.

Languages
=========

To provide a Python solution, edit solution.py
To provide a Java solution, edit Solution.java

Test cases
==========
Your code should pass the following test cases.
Note that it may also be run against hidden test cases not shown here.

-- Python cases --
Input:
solution.solution([[0, 1, 1, 0], [0, 0, 0, 1], [1, 1, 0, 0], [1, 1, 1, 0]])
Output:
    7

Input:
solution.solution([[0, 0, 0, 0, 0, 0], [1, 1, 1, 1, 1, 0], [0, 0, 0, 0, 0, 0], [0, 1, 1, 1, 1, 1], [0, 1, 1, 1, 1, 1], [0, 0, 0, 0, 0, 0]])
Output:
    11

-- Java cases --
Input:
Solution.solution({{0, 1, 1, 0}, {0, 0, 0, 1}, {1, 1, 0, 0}, {1, 1, 1, 0}})
Output:
    7

Input:
Solution.solution({{0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0}})
Output:
    11
    * */

}
