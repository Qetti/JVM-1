package Homework3.Project2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.util.List.of;

public class B {
    int[] m = new int[12];

    public void setValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 12 numbers: ");
        for(int i = 0; i < 12; i++){
            m[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(m));
    }

    public void setRandomValues(){
        int min = 0;
        int max = 15;
        for(int i = 0; i < 12; i++){
            int random_int = (int)(Math.random() * (max - min + 1) + min);
            this.m[i] = random_int;
        }
        System.out.println(Arrays.toString(m));
    }

    public void numsMoreThan7(){
        for (int i = 0; i < this.m.length; i++){
            if(m[i] > 7){
                System.out.println("Index: " + i + " Number: " + m[i]);
            }
        }
    }

    public void scatteringRange(){
        int max = m[0];
        int min = m[0];
        for (int i = 1; i < m.length; i++) {
            if (m[i] > max)
                max = m[i];
        }
        for (int i = 1; i < m.length; i++) {
            if (m[i] < min)
                min = m[i];
        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
        System.out.println("Scattering range is: " + (max-min));
    }
}
