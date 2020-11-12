package midterm;

public class FirstTask implements Interface{
    int a, b;

    public void firstMethod(){
        a = (int) ((Math.random() * (15 - (-15))) - 15);
        b = (int) ((Math.random() * (15 - (-15))) - 15);

        if(a>b){
            // Changing values of a and b
            a = a + b;
            b = a - b;
            a = a - b;
        }
        System.out.println(a);
        System.out.println(b);
    }

    public void secondMethod(){
        for(int i=a+1; i<b; i++){
            System.out.println(i);
        }
    }

    public int thirdMethod(){
        int n = 0;
        for(int i=1; i<=b; i++){
            if(b%i == 0){
                n += 1;
            }
        }
        return n;
    }

    public int fourthMethod(){
        int sum = 0;
        for(int i=a+1; i<b; i++){
            if(i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    public void fifthMethod(){
        System.out.println( (double)  (a+b)/2);
    }
}
