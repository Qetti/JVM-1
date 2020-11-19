import java.util.Arrays;
import java.util.Random;
public class A {

    public int a,b;
    public int[] m = new int[12];
    Random rand = new Random();

    public void Method1(){
        a = rand.nextInt(10+25);
    }

    public int[] Method2(){
        int[] arr = new int[2];
        arr[0] = a;
        arr[1] = b;
        return arr;
    }


    public void Method4(){
        for(int i=0; i<12; i++){
            m[i] = (int) ((Math.random() * (70)) -10);

        }
        System.out.println(Arrays.toString(m));
    }


    public void Method5(){
        for (int element:
             m) {if (element%2==0){
            System.out.println(element);
        }

        }
    }


    public void Method6(){
        int jami = 0;
        for (int element: m)
        {
            if(element>0)
            {
            jami += element;
            }
        }
        System.out.println(jami);
    }


    public void Method7(){
        System.out.println(Arrays.toString(m));
        int minelement = Integer.MAX_VALUE;
        for (int element:
             m) { if((element>0) && (element<minelement)){
                 minelement = element;
        }

        }
        System.out.println(minelement);
    }


}
