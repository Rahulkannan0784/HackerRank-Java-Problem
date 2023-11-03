import java.io.*;
import java.util.*;

import java.util.Scanner;

public class RainfallCategorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {
            int X = sc.nextInt(); // Rate of rainfall in millimeters per hour

            if (X < 33) {
                System.out.println("LIGHT");
            } else if (X >= 33 && X < 77) {
                System.out.println("MODERATE");
            } else {
                System.out.println("HEAVY");
            }
        }
    }
}
