package Homework3.Project4Constructors;

import java.util.Scanner;

public class B {
    int x;

    public B() {
    }

    public B(int x) {
        this.x = x;
    }

    public void checkX() {
        if (5 <= x && x <= 24) {
            System.out.println("X is in [5; 24]");
        } else {
            System.out.println("X is not in [5; 24]");
        }
    }
}
