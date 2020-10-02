package Homework3.Project2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        A FirstTask = new A();
        FirstTask.setValues();
        FirstTask.setRandomValues();
        FirstTask.sumOfValueLessThanKey();
        FirstTask.multiplyOfIndexes();

        B SecondTask = new B();
        SecondTask.setValues();
        SecondTask.setRandomValues();
        SecondTask.numsMoreThan7();
        SecondTask.scatteringRange();
    }
}
