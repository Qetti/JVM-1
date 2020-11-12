package task;

import string.AnalysisString;
import string.GenerateString;

public class Main {

    public static void main(String[] args) {
	// write your code here

        GenerateString generateString = new GenerateString();
        System.out.println(generateString.setValue());

        AnalysisString analysisString = new AnalysisString();
        analysisString.first();
    }
}
