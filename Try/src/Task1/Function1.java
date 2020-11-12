package Task1;


public class Function1 extends Thread{

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
        return x*x*x + 2*x + 3;
    }

//    მეთოდი, რომელიც ინახავს დათვლილ მონაცემებს ტექსტურ ფაილში
    private void saveResults(String num){
        Function2.saveState(num);
    }
}
