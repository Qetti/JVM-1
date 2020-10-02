package Homework3.Project3;

import java.util.Scanner;

public class B {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y = sc.nextInt();

    public int First(){
        return 2*((int) Math.pow(n, 2))+1;
    }

    public int Second(){
        return 3*((int) Math.pow(y, 3))-((int) Math.pow(n, 2));
    }
}
