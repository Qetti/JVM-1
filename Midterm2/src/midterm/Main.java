package midterm;

import number.PrimaryNumber;
import number.SubtractNumber;

public class Main {
    public static void main(String[] args) {
	// write your code here
        PrimaryNumber primaryNumber = new PrimaryNumber();
        primaryNumber.setNumberValue();
        primaryNumber.getNumber();


        SubtractNumber subtractNumber = new SubtractNumber();
        subtractNumber.setNumber(primaryNumber);
        subtractNumber.changeNumber();
    }
}
