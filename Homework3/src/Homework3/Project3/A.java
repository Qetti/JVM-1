package Homework3.Project3;

import java.util.Scanner;

public class A {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();

    public int First(){
        return (2*this.x)-7;
    }

    public int Second(){
        return (3*this.y)+z;
    }

    public int Third(){
        return 12*this.y-x+z;
    }
}
