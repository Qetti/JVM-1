package Homework3.Project4Constructors;


public class F {
    float x;
    float y;


    public F(){}

    public F(float x){this.x = x;}

    public F(float x, float y){this.x=x; this.y=y;}

    public float First() {

        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }
        return y;
    }

}
