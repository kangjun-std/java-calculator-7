package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.print("덧셈할 문자열을 입력해 주세요: ");
        String input = Console.readLine();

        Calculator calculator = new Calculator();

        int result = calculator.add(input);
        System.out.print("결과: " + result);
    }
}