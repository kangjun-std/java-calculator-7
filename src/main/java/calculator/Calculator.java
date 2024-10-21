package calculator;

public class Calculator {
    public int add(String input) {
        if(input.isEmpty()){
            return 0;
        }

        String delimiter = "[,:]";
        if (input.startsWith("//")) {
            int delimiterIndex = input.indexOf("\n");
            delimiter = input.substring(2, delimiterIndex);
            input = input.substring(delimiterIndex + 1);
        }

        String[] numbers = input.split(delimiter);

        int sum = 0;
        for(String number : numbers) {
            int num = toPositiveNumber(number);
            sum += num;
        }

        return sum;
    }

    private int toPositiveNumber(String number) {
        int num;
        try {
            num = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
        if (num < 0) {
            throw new IllegalArgumentException();
        }
        return num;
    }
}