package Homework3.Project4Constructors;

import java.util.Scanner;

public class E {

    Scanner sc = new Scanner(System.in);
    float x = sc.nextFloat();
    float y = sc.nextFloat();

    public E(){

    }

    public E(int x){
        this.x = x;
    }

    public float First(){
        if(this.y != 0){
            return (x/this.y)+(x*this.y);
        }
        else if (x<=0) {
            return (float) Math.pow(x, 4) + y;
        }
        return 0;
    }

    public String Second(){
        if(x>this.y) {
            return y + " is minimum";
        }
        return x + " is minimum";
    }
}
