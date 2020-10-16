package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
//        task11();
//        task12();
    }


    public static void task1() {
        System.out.println("C++");
        System.out.println("C#");
        System.out.println("Java");
        System.out.println("Pascal");
        System.out.println("PHP");
        System.out.println("JavaScript");
        System.out.println("ActionScript");
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("X/Y = " + x / y);
        System.out.println("Y%X = " + y % x);
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.print("Enter third number: ");
        int z = sc.nextInt();
        System.out.println("X+Y+Z = " + (x + y + z));
        System.out.println("X*Y*Z = " + x * y * z);
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            System.out.println(x % 10);
            x /= 10;
        }
    }

    public static void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < 4; i++) {
            answer += x % 10;
            x /= 10;
        }
        System.out.println(answer);
    }

    public static void task6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = sc.nextInt();
        int answer = 0;
        int length = String.valueOf(x).length();
        for (int i = 0; i < length; i++) {
            answer += x % 10;
            x /= 10;
        }
        System.out.println(answer);
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        while (first != second) {
            if (first > second)
                first -= second;
            else
                second -= first;
        }
        System.out.println("GCD = " + second);
    }

    public static void task8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int M = sc.nextInt();
        System.out.print("Enter second number: ");
        int N = sc.nextInt();
        for (int i = M; i < N; i++) {
            System.out.println(i);
        }
    }

    public static void task9(){
        int [] nums = {9,2,3,10,5,6,7,8};
        int min = nums[0];
        int max = nums[0];

        for (int x : nums) {
            System.out.println(x + " ");
            if (x>max) {
                max = x;
            }
        }
        for (int y : nums) {
            if (y < min) {
                min = y;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    public static void task10(){
        int [] nums = {9,20,3,10,5,10,7,25,20};
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.print("Ascending order: ");
        for(int i=0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void task11(){
        Random rd = new Random();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
            System.out.println(arr[i]);
        }
       System.out.println(arr);
    }

    public static void task12(){
        Random rd = new Random();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Descending order: ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

}
