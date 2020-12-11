package family;

import java.io.*;

public class FamilyBudget {
    private int money;
    private File file;
    private BufferedWriter bufferedWriter;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    synchronized public void changeMoney(int amount){
        if(amount<=getMoney()){
            money -= amount;
        }
        saveMoneyState();
    }

    private void saveMoneyState(){
        file = new File("budget.txt");
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            bufferedWriter.write(money+"\n");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error!!!");
        }
    }

    public void familyStatus(){
        if(money>=40000){
            System.out.println("Rich Family");
        }else if(money>=10000){
            System.out.println("Medium Family");
        }else{
            System.out.println("Poor Family");
        }
    }
}
