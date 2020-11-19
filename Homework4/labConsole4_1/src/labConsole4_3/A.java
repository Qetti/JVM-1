public class A {
    public int a = 15, b = 30;

    public void Method1() {
        for (int i = 1; i < b - a; i++) {
            System.out.println(a + i);
        }
    }

    public void Method2(){
        for (int i=1;i<a;i++){
            if(a%i==0){
                System.out.println(i);
            }

        }
    }

    public void Method3(){
        int i = 2;
        boolean flag = false;
        while(i <= b/2)
        {
            if(b % i == 0)
            {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            System.out.println(b + " is a prime number.");
    }

    public void Method4(){
        System.out.println(b);
        int []frequency = new int[10];
        while(b > 0)
        {
            int digit = b % 10;
            b /= 10;
            frequency[digit] ++;
        }

        int maxFrequency = 0;
        int index = 0;
        for(int i = 0; i < 10; ++i){
            if(frequency[i] > maxFrequency){
                maxFrequency = frequency[i];
                index = i;
            }
        }
        System.out.println("The highest occuring digit is " + index + " occuring " + maxFrequency + " times(s)");
    }

}
