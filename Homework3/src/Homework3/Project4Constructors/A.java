package Homework3.Project4Constructors;

import java.util.Scanner;

public class A {
    int x;
    public A(){
        System.out.println("hello My Class");
    }

    public String checkX(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        this.x = sc.nextInt();
        if(x%2 == 0){
            return "X is even";
        }
        return "X is odd";
    }
}
