package home_work_1.SixthTask;

import java.util.Scanner;

public class ConditionTwo implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {

        String name1 = "Вася";
        String name2 = "Анастасия";
        String greetings = "Привет!";
        String sentence = "Я тебя так долго ждал";
        String question = "Добрый день, а вы кто?";

        if (name.equals(name1)) {
            return greetings + " " + sentence;
        } else {
            if (name.equals(name2)) {
                return sentence;
            } else {
                return question;
            }
        }
    }
}