package string;

public class AnalysisString {
    private GenerateString string;

    public AnalysisString(){}

    public AnalysisString(GenerateString string) {
        this.string = string;
        System.out.println(string);
    }
    public void first(){
        System.out.println(string.getText());
    }

}
