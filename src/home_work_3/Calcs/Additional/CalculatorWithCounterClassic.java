package home_work_3.Calcs.Additional;

import home_work_3.Calcs.Simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    /**
     * Значение счётчика до начала использования
     */
    private long countOperation;

    public long getCountOperation() {
        incrementCountOperation(); // вызываем для +1
        return countOperation;     // возвращаем результат выполнения преддыдущей операции
    }

    /**
     * Изменение счётчика
     */
    public void incrementCountOperation() {
        countOperation++;
    }
}
