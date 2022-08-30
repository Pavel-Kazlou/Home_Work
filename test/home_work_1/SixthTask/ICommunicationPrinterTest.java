package home_work_1.SixthTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ICommunicationPrinterTest {

    @Test
    public void welcomeConditionOne() {
        ConditionOne conditionOne = new ConditionOne();
        Assertions.assertEquals("Привет!" + " " + "Я тебя так долго ждал", conditionOne.welcome("Вася"));

        ConditionOne conditionOne1 = new ConditionOne();
        Assertions.assertEquals("Я тебя так долго ждал", conditionOne1.welcome("Анастасия"));

        ConditionOne conditionOne2 = new ConditionOne();
        Assertions.assertEquals("Добрый день, а вы кто?", conditionOne2.welcome("Павел"));
    }

    @Test
    public void welcomeConditionTwo() {
        ConditionTwo conditionTwo = new ConditionTwo();
        Assertions.assertEquals("Привет!" + " " + "Я тебя так долго ждал", conditionTwo.welcome("Вася"));

        ConditionTwo conditionTwo1 = new ConditionTwo();
        Assertions.assertEquals("Я тебя так долго ждал", conditionTwo1.welcome("Анастасия"));

        ConditionTwo conditionTwo2 = new ConditionTwo();
        Assertions.assertEquals("Добрый день, а вы кто?", conditionTwo2.welcome("Павел"));
    }

    @Test
    public void welcomeConditionThree() {
        ConditionThree conditionThree = new ConditionThree();
        Assertions.assertEquals("Привет!" + " " + "Я тебя так долго ждал", conditionThree.welcome("Вася"));

        ConditionThree conditionThree1 = new ConditionThree();
        Assertions.assertEquals("Я тебя так долго ждал", conditionThree1.welcome("Анастасия"));

        ConditionThree conditionThree2 = new ConditionThree();
        Assertions.assertEquals("Добрый день, а вы кто?", conditionThree2.welcome("Павел"));
    }
}