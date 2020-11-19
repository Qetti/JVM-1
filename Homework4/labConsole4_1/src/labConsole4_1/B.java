package Classwork4;

import java.util.Scanner;

public class B {
    int a = 33;
    float b = (float) 9.7;
    char s = '#';
    Scanner sc = new Scanner(System.in);


    public void method1(){
        System.out.println(s);
    }
    public void method2(){
        System.out.println(a);
    }
    public void method3(){
        System.out.println(b);
    }
    public void method4(){
        System.out.println(a-b);
    }
    public float method5(){
        return a/b;
    }
    public void method6(){
        a = 15;
        b = (float) 2.5;
        s = '&';
    }
    public void method7(){
        System.out.println("Enter number a: ");
        a = sc.nextInt();
    }
    public void method8(){
        System.out.println(b+10);
    }
}
