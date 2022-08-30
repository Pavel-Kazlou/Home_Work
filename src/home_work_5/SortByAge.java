package home_work_5;

import java.util.Comparator;

public class SortByAge implements Comparator<Animal> {

    /**
     * Функция сравнения животных по возрасту
     * @param age1 the first object to be compared.
     * @param age2 the second object to be compared.
     * @return - возвращает животное с наименьшим возрастом в начало списка
     */
    @Override
    public int compare(Animal age1, Animal age2) {
        if (age1.getAge() > age2.getAge()) {
            return 1;
        }
        if (age1.getAge() < age2.getAge()) {
            return -1;
        }
        return 0;
    }
}

