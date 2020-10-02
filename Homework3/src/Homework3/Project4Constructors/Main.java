package Homework3.Project4Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        A FirstTask = new A();
        System.out.println(FirstTask.checkX());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        B SecondTask = new B(sc.nextInt());
        SecondTask.checkX();

        System.out.println("Enter a: ");
        System.out.println("Enter b: ");
        System.out.println("Enter x: ");
        C ThirdTask = new C(sc.nextInt(), sc.nextInt(), sc.nextInt());
        ThirdTask.checkRange();
        System.out.println(ThirdTask.checkXInRange());

        System.out.println("Enter x: ");
        System.out.println("Enter y: ");
        D FourthTask = new D();
        System.out.println(FourthTask.First());
        System.out.println(FourthTask.Second());

        System.out.println("Enter float x: ");
        System.out.println("Enter float y: ");
        E FifthTask = new E();
        System.out.println(FifthTask.First());
        System.out.println(FifthTask.Second());

        System.out.println("Enter float x: ");
        System.out.println("Enter float y: ");
        F SixthTask = new F(sc.nextFloat(), sc.nextFloat());
        System.out.println(SixthTask.First());
    }
}
