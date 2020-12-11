package btu;

import family.FamilyBudget;
import family.FamilyMember;

import java.io.File;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        deleteFiles();
        FamilyBudget familyBudget = new FamilyBudget();
        familyBudget.setMoney(30000);
        familyBudget.familyStatus();
        System.out.println(familyBudget.getMoney());

        FamilyMember member1 = new FamilyMember("Giga", "Pipia", 18, "Brother");
        FamilyMember member2 = new FamilyMember("Lali", "Pipia", 21, "Sister");
        FamilyMember member3 = new FamilyMember("Giorgi", "Pipia", 46, "Father");
        member1.setBudget(familyBudget);
        member2.setBudget(familyBudget);
        member3.setBudget(familyBudget);
        Random random = new Random();
        member1.setAmount(random.nextInt(300)); //Thread 0
        member2.setAmount(random.nextInt(300)); //Thread 1
        member3.setAmount(random.nextInt(300)); //Thread 2
        member1.start();
        member2.start();
        member3.start();
    }

    private static void deleteFiles(){
        File file = new File("budget.txt");
        if(file.isFile()){
            file.delete();
        }
        file = new File("family.txt");
        if(file.isFile()){
            file.delete();
        }
    }
}
