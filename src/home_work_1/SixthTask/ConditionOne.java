package home_work_1.SixthTask;

public class ConditionOne implements ICommunicationPrinter {

    @Override
    public String welcome(String name) {

        String name1 = "Вася";
        String name2 = "Анастасия";
        String greetings = "Привет!";
        String sentence = "Я тебя так долго ждал";
        String question = "Добрый день, а вы кто?";

        if (name.equals(name1)) {
            return greetings + " " + sentence;
        }
        if (name.equals(name2)) {
            return sentence;
        }
        return question;
    }
}

