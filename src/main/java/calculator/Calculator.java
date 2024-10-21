package calculator;

public class Calculator {
    public int add(String input) {
        if(input.isEmpty()){
            return 0;
        }

        String delimiter = ",|:";
        if (input.startsWith("//")) {
            int delimiterIndex = input.indexOf("\n");
            delimiter = input.substring(2, delimiterIndex);
            input = input.substring(delimiterIndex + 1);
        }

        String[] numbers = input.split(",|:");

        int sum = 0;
        for(String number : numbers) {
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}