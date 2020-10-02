package Homework3.Project1;

import java.util.Scanner;

public class B {
    int a;
    int b;
    int c;

    public void SetValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        this.a = sc.nextInt();
        System.out.println("Enter second number: ");
        this.b = sc.nextInt();
        System.out.println("Enter third number: ");
        this.c = sc.nextInt();
    }

    public void Max() {
        if (a>b){
            if(a>c){
                System.out.println("Max is: " + a);
            }
            else{
                System.out.println("Max is: " + c);
            }
        }
        else if (b>c){
            if(b>a){
                System.out.println("Max is: " + b);
            }
            else{
                System.out.println("Max is: " + a);
            }
        }
        else{
            System.out.println("Max is: " + c);
        }
    }
    public void Min() {
        if (a<b){
            if(a<c){
                System.out.println("Min is: " + a);
            }
            else{
                System.out.println("Min is: " + c);
            }
        }
        else if (b<c){
            if(b<a){
                System.out.println("Min is: " + b);
            }
            else{
                System.out.println("Min is: " + a);
            }
        }
        else{
            System.out.println("Min is: " + c);
        }
    }
}
