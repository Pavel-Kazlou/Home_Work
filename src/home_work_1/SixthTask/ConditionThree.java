package home_work_1.SixthTask;

import java.util.Scanner;

public class ConditionThree implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {

        String greetings = "Привет!";
        String sentence = "Я тебя так долго ждал";
        String question = "Добрый день, а вы кто?";

        switch (name) {
            case "Вася":
                return greetings + " " + sentence;
            case "Анастасия":
                return sentence;
            default:
                return question;
        }
    }
}
