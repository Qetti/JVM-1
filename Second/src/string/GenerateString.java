package string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class GenerateString {
    private String text;
    private File file;
    private BufferedWriter bufferedWriter;

    String txt = "Lorem ipsum dolor sit amet consectetur adipiscing elit Praesent bibendum in mauris et consectetur Duis ac tortor fermentum lobortis metus vel consectetur arcu Aliquam erat volutpat Maecenas dignissim nisi at";
    String[] arr = txt.split(" ");

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String setValue(){
        Random rand = new Random();

        for(int i=1; i<5; i++){
            int randomNumber = rand.nextInt(arr.length);
            text += " " + arr[randomNumber];
        }
        saveString();
        return text;

    }

    private void saveString(){
        file = new File("text.txt");
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(text + "\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

