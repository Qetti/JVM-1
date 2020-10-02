package Homework3.Project4Constructors;

import java.util.Scanner;

public class D {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();

    public D(){
        System.out.println("hello My Class");
    }

    public int First() {
        if(this.x>0){
            return 4*this.x-y;
        }
        return 2*x+y;
    }

    public int Second(){
        if(this.y>0){
            return 4*x+y;
        }
        return 2*x-y;
    }
}
