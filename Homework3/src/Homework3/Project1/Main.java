package Homework3.Project1;

public class Main {

    public static void main(String[] args) {
		A FirstTask = new A();
		FirstTask.SetValues();
		FirstTask.Sum();
		FirstTask.Multiply();

		B SecondTask = new B();
		SecondTask.SetValues();
		SecondTask.Max();
		SecondTask.Min();

		C ThirdTask = new C();
		ThirdTask.SetValues();
		System.out.println(ThirdTask.aLastDigit());
		System.out.println(ThirdTask.bFirstDigit());
		System.out.println(ThirdTask.cSumOfDigits());
		System.out.println(ThirdTask.MultiplicationOfMethods());
		System.out.println(ThirdTask.SumOfMethods());
	}


}
