package number;

import java.io.BufferedWriter;
import java.io.File;

public class SubstractNumber extends Thread{
    private int num;
    private PrimaryNumber number;
    private File file;
    private BufferedWriter bufferedWriter;

    public SubstractNumber(){}

    public SubstractNumber(int num){
        this.num = num;
        System.out.println(number);
    }

    private void subNumber(){
        num = (int) ((Math.random() * (200 - 100)) + 100);

    }



}
