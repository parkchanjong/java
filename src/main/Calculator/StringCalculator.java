package main.Calculator;

public class StringCalculator {
    public int add(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(text);
    }
    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();
        System.out.println(stringCalculator.add("1"));
    }
}
