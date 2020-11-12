package Homework3.Project4Constructors;

public class C {
    int a;
    int b;
    int x;

    public C(){

    }

    public C(int a, int b, int x){
        this.a = a;
        this.b = b;
        this.x = x;
    }

    public int checkRange(){
        if(b-a > 0){
            return 1;
        }
        return 0;
    }

    public String checkXInRange(){
        int range = checkRange();
        if(range == 1 ){
            if (a <= x && x <= b) {
                return x + " is in " + "[" + a + "; " + b + "] ";
            } else {
                return x + " is in not" + "[" + a + "; " + b + "] ";
            }
        }
        return "Not range";
    }
}
