package family;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FamilyMember extends Thread {
    private String name;
    private String lastName;
    private int age;
    private String status;
    private File file;
    private BufferedWriter bufferedWriter;
    private FamilyBudget budget;
    private int amount;

    public FamilyMember() {
    }

    public FamilyMember(String name, String lastName, int age, String status) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.status = status;
        saveMemberData();
    }

    public void setBudget(FamilyBudget budget) {
        this.budget = budget;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void run(){
        takeMoney();
    }

    private void takeMoney(){
        Random random = new Random();
        for(int i=0; i<random.nextInt(50)+200; i++){
            budget.changeMoney(amount);
            System.out.println(name+" "+this.getName()+" "+budget.getMoney());
        }
    }

    private void saveMemberData(){
        file = new File("family.txt");
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            String member = name+" "+lastName+" "+age+" "+status;
            bufferedWriter.write(member+"\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
