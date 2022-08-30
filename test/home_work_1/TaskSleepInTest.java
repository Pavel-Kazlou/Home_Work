package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskSleepInTest {

    @Test
    public void sleepInFalse() {
        Assertions.assertEquals(false, TaskSleepIn.sleepIn(true, false));

    }

    @Test
    public void sleepInTrue() {
        Assertions.assertEquals(true, TaskSleepIn.sleepIn(false, true));
    }
}