package number;

import java.io.BufferedWriter;
import java.io.File;
import java.util.Random;

public class SubtractNumber extends Thread{
    private PrimaryNumber number;
    private File file;
    private BufferedWriter bufferedWriter;

    public SubtractNumber(){}

    public SubtractNumber(number.PrimaryNumber number){
        this.number = number;
        System.out.println(number);
    }

    public void setNumber(number.PrimaryNumber number) {
        this.number = number;
    }

    //    public void setNum(num){
//        this.num = num;
//    }

    public void changeNumber(){
        Random random = new Random();
        for(int i=0; i<random.nextInt(50)+60; i++){
            number.changeNumber(number);
            System.out.println(number.getNumber());
        }

//        System.out.println(PrimaryNumber);
//        System.out.println(number);
    }



}
