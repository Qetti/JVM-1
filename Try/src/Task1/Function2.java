package Task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Function2 extends Thread{

    public void run(){
        generateDoubles();
    }


//    მეთოდი აგენერირებს [1; 2] შუალედიდან double მონაცემებს, იძახებს ფუნქციას, რომელსაც გადასცემს ამ მონაცემებს და შემდეგ წერს ფაილში.
    private void generateDoubles(){
        for(int i = 100;i<201;i++){
            double y = function(i/100.0);
            String result = String.format(" %.2f", y);
            saveResults(result);
        }
    }


//    მეთოდი, რომელიც ითვლის მნიშვნელობებს
    public static double function(double x){
        return x*x*x - x + 5;
    }


//    მეთოდი, რომელიც ინახავს დათვლილ მონაცემებს ტექსტურ ფაილში
    private void saveResults(String num){
        saveState(num);
    }

    static void saveState(String num) {
        File file = new File("results.txt");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(num + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error!!!");
        }
    }
}
