package Homework3.Project1;

import java.util.Scanner;

public class A {
    int a;
    int b;

    public void SetValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        this.a = sc.nextInt();
        System.out.println("Enter second number: ");
        this.b = sc.nextInt();
    }

    public void Sum(){
        System.out.println(this.a + this.b);
    }

    public void Multiply(){
        System.out.println(this.a * this.b);
    }

}
