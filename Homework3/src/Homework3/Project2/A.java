package Homework3.Project2;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    int[] m = new int[10];

    public void setValues(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++){
            m[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(m));
    }

    public void setRandomValues(){
        int min = 0;
        int max = 15;
        for(int i = 0; i < 10; i++){
            int random_int = (int)(Math.random() * (max - min + 1) + min);
            this.m[i] = random_int;
        }
        System.out.println(Arrays.toString(m));
    }

    public void sumOfValueLessThanKey(){
        int sum = 0;
        for (int i = 0; i < this.m.length; i++){
            if(i > m[i]){
                sum += m[i];
            }
        }
        System.out.println(sum);
    }

    public void multiplyOfIndexes(){
        int multiply = 1;
        for (int i = 0; i < this.m.length; i++){
            if(i < m[i]){
                multiply *= i;
            }
        }
        System.out.println(multiply);
    }


}
