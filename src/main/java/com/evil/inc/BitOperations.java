package com.evil.inc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

public class BitOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfBits = sc.nextInt();
        int numberOfOperations = sc.nextInt();
        sc.nextLine();
        BitSet b1 = new BitSet(numberOfBits);
        BitSet b2 = new BitSet(numberOfBits);

        List<String[]> operations = new ArrayList<>();
        for (int i = 0; i < numberOfOperations; i++) {
            String[] s = sc.nextLine().split(" ");
            operations.add(s);
        }

        for (String[] operation : operations) {
            switch (operation[0]) {
                case "AND":
                    if (operation[1].equals("1") && operation[2].equals("2")) {
                        b1.and(b2);
                    } else if (operation[1].equals("2") && operation[2].equals("1")) {
                        b2.and(b1);
                    } else if (operation[1].equals("2") && operation[2].equals("2")) {
                        b2.and(b2);
                    } else if (operation[1].equals("1") && operation[2].equals("1")) {
                        b1.and(b1);
                    }
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                    break;
                case "SET":
                    if (operation[1].equals("1")) {
                        b1.set(Integer.parseInt(operation[2]));
                    } else if (operation[1].equals("2")) {
                        b2.set(Integer.parseInt(operation[2]));
                    }
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                    break;
                case "FLIP":
                    if (operation[1].equals("1")) {
                        b1.flip(Integer.parseInt(operation[2]));
                    } else if (operation[1].equals("2")) {
                        b2.flip(Integer.parseInt(operation[2]));
                    }
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                    break;
                case "OR":
                    if (operation[1].equals("1") && operation[2].equals("2")) {
                        b1.or(b2);
                    } else if (operation[1].equals("2") && operation[2].equals("1")) {
                        b2.or(b1);
                    } else if (operation[1].equals("2") && operation[2].equals("2")) {
                        b2.or(b2);
                    } else if (operation[1].equals("1") && operation[2].equals("1")) {
                        b1.or(b1);
                    }
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                    break;
                case "XOR":
                    if (operation[1].equals("1") && operation[2].equals("2")) {
                        b1.xor(b2);
                    } else if (operation[1].equals("2") && operation[2].equals("1")) {
                        b2.xor(b1);
                    } else if (operation[1].equals("2") && operation[2].equals("2")) {
                        b2.xor(b2);
                    } else if (operation[1].equals("1") && operation[2].equals("1")) {
                        b1.xor(b1);
                    }
                    System.out.println(b1.cardinality() + " " + b2.cardinality());
                    break;
            }
        }
    }
}
