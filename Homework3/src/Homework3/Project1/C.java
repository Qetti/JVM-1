package Homework3.Project1;

import java.util.Scanner;

public class C {
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

    public int aLastDigit(){
        return this.a%10;
    }

    public int bFirstDigit(){
        int n = this.b;
        while (n>9){
            n /= 10;
        }
        return n;
    }

    public int cSumOfDigits(){
        int n = this.c;
        int sum = 0;
        int length = String.valueOf(n).length();
        for(int i=0;i<length; i++) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    public int MultiplicationOfMethods(){
        return this.aLastDigit() * bFirstDigit();
    }

    public int SumOfMethods(){
        return this.bFirstDigit() + cSumOfDigits();
    }
}
