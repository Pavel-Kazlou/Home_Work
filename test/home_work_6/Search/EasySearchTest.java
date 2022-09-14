package home_work_6.Search;

import home_work_6.Interface.ISearchEngine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasySearchTest {
    @Test
    public void ezT1(){
        ISearchEngine test=new EasySearch();
        assertEquals(1,test.search("Мир миром, Миру мира, миру. Мир, мир?", "мир"));
        assertEquals(2,test.search("Мир миром, Миру мира, миру. Мир, мир?", "Мир"));
        assertEquals(0,test.search("Мир миром, Миру мира, миру. Мир, мир?", "Мира"));
        assertEquals(1,test.search("Мир миром, Миру мира, миру. Мир, мир?", "Миру"));
        assertEquals(0,test.search("Мир миром, Миру мира, миру. Мир, мир?", "МИр"));
        assertEquals(0,test.search("Мир миром, Миру мира, миру. Мир, мир?", "МИР"));
        assertEquals(1,test.search("Мир миром, Миру мира, миру. Мир, мир?", "мира"));
    }

    @Test
    public void ezT2(){
        ISearchEngine test=new EasySearch();
        assertEquals(0,test.search("Мир миром, Миру мира, миру. Мир, мир?", "и"));
        assertEquals(0,test.search("Мир миром, Миру мира, миру. Мир, мир?", "И"));
    }
}