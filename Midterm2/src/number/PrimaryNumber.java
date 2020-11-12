package number;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrimaryNumber {
    public int number;
    private File file;
    private BufferedWriter bufferedWriter;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private void saveNumber(){
        file = new File("number.txt");
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(number + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setNumberValue(){
        number = (int) ((Math.random() * (200 - 100)) + 100);
    }

    synchronized public void changeNumber(PrimaryNumber num){
        if(getNumber() >= 60 ){
            number -= num;
        }
    }


}
