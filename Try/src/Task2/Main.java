package Task2;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sum = 0;
        ArrayList<Double> arr = new ArrayList<Double>();
        try {
            FileReader fr = new FileReader("results.txt");

            Scanner input = new Scanner(fr);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                double x = Double.parseDouble(line);
                arr.add(x);
                sum += x;
            }
            input.close();

        } catch (Exception e) {
            System.out.println("Error!");
        }
        Collections.sort(arr);
        System.out.println("მინიმუმი - " + arr.get(0));
        System.out.println("მაქსიმუმი - " + arr.get(arr.size() - 1));
        System.out.println("საშუალო - " + String.format(" %.4f", sum/arr.size()) );
    }
}

