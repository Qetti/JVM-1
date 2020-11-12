package Homework3.Project3;

import java.util.Scanner;

public class C {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    public int First(){
        return ((4*((int) Math.pow(a, 2)))/b)-1;
    }

    public int Second(){
        return (3*(((int) Math.pow(a, 3)))/2)-((int) Math.pow(b, 2));
    }
}
