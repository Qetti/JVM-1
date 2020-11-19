package homework10;

import java.util.*;

public class Methods {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    //  აგენერირებს n ცალ random რიცხვს და ამატებს გადაცემულ ლისტში
    public void randomElements(ArrayList<Integer> list, int n) {
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
    }


    //  ჩაწერეთ კოლექციაშიში ხუთი შემთხვევითი მთელი რიცხვი და დაბეჭდეთ.
    public void method1() {
        ArrayList<Integer> list1 = new ArrayList<>();
        randomElements(list1, 5);
        System.out.println("Method 1: " + list1);
        System.out.println();

    }


    //    ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. დაბეჭდეთ პირდაპირი
    //    და შებრუნებული რიგით.
    public void method2() {
        ArrayList<Integer> list2 = new ArrayList<>();

        // random ელემენტების ჩაწერა list2-ში
        randomElements(list2, 5);

        System.out.println("Method 2: " + list2);

        list2.sort(Collections.reverseOrder());
        System.out.println("Method 2 Reversed: " + list2);
        System.out.println();

    }


//  ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. დაალაგეთ ზრდადობით
//  და დაბეჭდეთ.
    public void method3() {
        ArrayList<Integer> list3 = new ArrayList<>();

        // random ელემენტების ჩაწერა list3-ში
        randomElements(list3, 5);

        System.out.println("Method 3: " + list3);

        // ალაგებს ზრდადობის მიხედვით
        Collections.sort(list3);
        System.out.println("Method 3 ascending: " + list3);
        System.out.println();
    }


//  ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. დაალაგეთ კლებადობით
//  და დაბეჭდეთ.
    public void method4() {
        ArrayList<Integer> list4 = new ArrayList<>();

        // random ელემენტების ჩაწერა list4-ში
        randomElements(list4, 5);

        System.out.println("Method 4: " + list4);

        // სორტირებულ კოლექციას ალაგებს ბოლოდან პირველისკენ
        list4.sort(Collections.reverseOrder());
        System.out.println("Method 4 descending: " + list4);
        System.out.println();

    }


//  ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. ჩაამატეთ ბოლოში სამი
//  შემთხვევითი რიცხვი. დაბეჭდეთ თავდაპირველი და მიღებული კოლექცია.
    public void method5() {
        ArrayList<Integer> list5 = new ArrayList<>();

        // 5 random ელემენტის ჩაწერა list5-ში
        randomElements(list5, 5);
        System.out.println("Method 5: " + list5);

        // 3 random ელემენტის დამატება list5-ში
        randomElements(list5, 3);
        System.out.println("Method 5 added elements: " + list5);
        System.out.println();
    }


//  ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. ჩაამატეთ შემთხვევითი
//  რიცხვები ყოველი მომდევნო ინდექსის შემდეგ. დაბეჭდეთ თავდაპირველი და
//  მიღებული კოლექცია.
    public void method6() {
        ArrayList<Integer> list6 = new ArrayList<>();

        // 5 random ელემენტის ჩაწერა list6-ში
        randomElements(list6, 5);
        System.out.println("Method 6: " + list6);

        // ყოველ მომდევნო ინდექსზე შემთხვევითი რიცხვის ჩამატება
        for (int n = 1; n < 10; ) {
            list6.add(n, random.nextInt(100));
            n += 2;
        }
        System.out.println("Method 6 added elements: " + list6);
        System.out.println();
    }


    //  ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. ჩაამატეთ შემთხვევითი
//  რიცხვი კლავიატურიდან შეტანილი n ინდექსის შემდეგ. დაბეჭდეთ თავდაპირველი და
//  მიღებული კოლექცია.
    public void method7() {
        ArrayList<Integer> list7 = new ArrayList<>();

        // 5 random ელემენტის ჩაწერა list7-ში
        randomElements(list7, 5);
        System.out.println("Method 7: " + list7);
        System.out.println("Method 7 - Enter index: ");

        // კლავიატურიდან შეყვანილ ინდექსზე random რიცხვის დამატება
        list7.add(scanner.nextInt(), random.nextInt(100));
        System.out.println("Method 7 added element: " + list7);
        System.out.println();
    }


//  ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. წაშალეთ პირველი 3
//  რიცხვი. დაბეჭდეთ თავდაპირველი და მიღებული კოლექცია.
    public void method8() {
        ArrayList<Integer> list8 = new ArrayList<>();

        // 5 random ელემენტის ჩაწერა list8-ში
        randomElements(list8, 5);
        System.out.println("Method 8: " + list8);

        // წაიშალოს 0-3 ინდექსზე მდგომი ელემენტები
        list8.subList(0, 3).clear();
        System.out.println("Method 8 changed: " + list8);
        System.out.println();
    }


//  ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. წაშალეთ კლავიატურიდან
//  შეტანილი n ინდექსზე მდგომი ელემენტი. დაბეჭდეთ თავდაპირველი და
//  მიღებული კოლექცია.
    public void method9() {
        ArrayList<Integer> list9 = new ArrayList<>();

        // 5 random ელემენტის ჩაწერა list9-ში
        randomElements(list9, 5);
        System.out.println("Method 9: " + list9);

        // კლავიატურიდან შეტანილ ინდექსზე მყოფი რიცხვის წაშლა
        System.out.println("Method 9 - Enter index: ");
        list9.remove(scanner.nextInt());
        System.out.println("Method 9: " + list9);
        System.out.println();
    }


//  ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. წაშალეთ ლუწ
//  ინდექსიანი ელემენტები. დაბეჭდეთ თავდაპირველი და მიღებული კოლექცია.
    public void method10() {
        ArrayList<Integer> list10 = new ArrayList<>();

        // 5 random ელემენტის ჩაწერა list10-ში
        randomElements(list10, 5);
        System.out.println("Method 10: " + list10);

        if (list10.isEmpty()) {
            return;
        }

        // შლის list10-ში მყოფ ლუწ ინდექსზე მყოფ ელემენტებს ბოლოდან
        for (int i = list10.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                list10.remove(i);
            }
        }

        System.out.println("Method 10 changed: " + list10);
        System.out.println();
    }


//  ჩაწერეთ კოლექციაში ხუთი შემთხვევითი მთელი რიცხვი. წაშალეთ 30-ის ტოლი
//  ელემენტები. დაბეჭდეთ თავდაპირველი და მიღებული კოლექცია.
    public void method11(){
        ArrayList<Integer> list11 = new ArrayList<>();

        // 5 random ელემენტის ჩაწერა list11-ში
        randomElements(list11, 5);
        System.out.println("Method 11: " + list11);

        for(int g=0; g<list11.size(); g++){
            if(list11.get(g) == 30){
                list11.remove(g);
            }
        }
        System.out.println("Method 11 changed: " + list11);
        System.out.println();
    }


//  ჩაწერეთ კოლექციაში 20 შემთხვევითი მთელი რიცხვი. გადაწერეთ ახალ
//  კოლექციაში 7-დან 15-მდე ინდექსებში მდგომი ელემენტები. დაბეჭდეთ ორივე
//  კოლექცია.
    public void method12(){
        ArrayList<Integer> list12 = new ArrayList<>();
        ArrayList<Integer> newList12 = new ArrayList<>();

        // 20 random ელემენტის ჩაწერა list12-ში
        randomElements(list12, 20);
        System.out.println("Method 12 first collection: " + list12);

        for(int f=7; f<15; f++){
            newList12.add(list12.get(f));
        }
        System.out.println("Method 12 second collection: " + newList12);
        System.out.println();
    }


//  ჩაწერეთ კოლექციაში 20 შემთხვევითი 10 სიმბოლოიანი სტრიქონი. გადაწერეთ
//  ახალ კოლექციაში ყველა ის ელემენტი, რომელიც შეიცავს ‘x’ სიმბოლოს.
//  დაბეჭდეთ ორივე კოლექცია.
    public void method13(){
        List<String> list13 = new ArrayList<>();
        List<String> newList13 = new ArrayList<>();

        String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";

        // აგენერირებს 10 სიმბოლოიან 20 ცალ random სტრინგს
        for(int a=0; a<20; a++){
            StringBuilder sb = new StringBuilder(10);
            for (int b = 0; b < 10; b++) {
                int index = (int)(AlphaNumericString.length() * Math.random());
                sb.append(AlphaNumericString.charAt(index));

            }
            list13.add(sb.toString());
        }
        System.out.println("Method 13: " + list13);

        // ამატებს ახალ კოლექციაში იმ სტრინგებს, რომლებიც შეიცავენ "x" სიმბოლოს
        for(String string : list13){
            if(string.contains("x")){
                newList13.add(string);
            }
        }
        System.out.println("Method 13 new collection: " + newList13);
        System.out.println();
    }


//  დაწერეთ პროგრამა, რომელიც ათობით რიცხვს გადაიყვანს ორობითში.
    public void method14(){
        List<String> list14 = new ArrayList<>();

        System.out.println("Method 14 - Enter number in decimal: ");
        int input = scanner.nextInt();

        // ინახავს ნაშთებს სტრინგის სახით list14-ში
        while(input != 0){
            int remainder = input % 2;
            list14.add(String.valueOf(remainder));
            input /=2;
        }
        // list14-ის რევერსი
        Collections.reverse(list14);

        // კოლექციის item-ების დაჯოინება
        String binary = String.join("", list14);
        System.out.println("Method 14 in binary: " + binary);
        System.out.println();
    }


//  დაწერეთ პროგრამა, რომელიც ორობით რიცხვს გადაიყვანს ათობითში.
    public void method15(){
        List<Integer> list15 = new ArrayList<>();

        System.out.println("Method 15 - Enter number in binary: ");
        int input = scanner.nextInt();
        int result = 0;

        // შეყვანილი რიცხვის თითოეული ციფრის დამატება კოლექციაში
        while (input > 0) {
            list15.add(input % 10);
            input /= 10;
        }
        Collections.reverse(list15);

        // კოლექციის სიგრძე
        int lenOfList = list15.size();

        // რიცხვის გადაყვანა ათობითში
        for(int item : list15){
            result += item * Math.pow(2, lenOfList-1);
            lenOfList--;
        }
        System.out.println("Method 15 in decimal: " + result);
        System.out.println();
    }

}
