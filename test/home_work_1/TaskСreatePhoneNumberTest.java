package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskСreatePhoneNumberTest {

    @Test
    public void createPhoneNumber() {
        TaskСreatePhoneNumber taskСreatePhoneNumber = new TaskСreatePhoneNumber();
        Assertions.assertEquals("(123) 456-7890", taskСreatePhoneNumber.createPhoneNumber(new int[]{1234567890}));
    }
}