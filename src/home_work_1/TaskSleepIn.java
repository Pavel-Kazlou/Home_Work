package home_work_1;

// 5*

public class TaskSleepIn {

    /**
     * Метод отвечает на вопрос можно ли спать
     *
     * @param weekday  - сейчас рабочий день?
     * @param vacation - сейчас отпуск?
     * @return true - да можно спать, false - нет спать нельзя
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}
