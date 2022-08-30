package home_work_5;

import java.util.Comparator;

public class SortByAgeAndAnimalNick implements Comparator<Animal> {

    /**
     * Функция сравнения животных по возрасту(первичная сортировка) и кличке(вторичная сортировка)
     * @param animal1 the first object to be compared.
     * @param animal2 the second object to be compared.
     * @return - возвращает животное с наименьшим возрастом в начало списка, иначе сортирует клички по алфовиту
     */
    @Override
    public int compare(Animal animal1, Animal animal2) {
        if (animal1.getAge() > animal2.getAge()) {
            return 1;
        }
        if (animal1.getAge() < animal2.getAge()) {
            return -1;
        }
        return animal1.getNick().compareTo(animal2.getNick());
    }
}
