package home_work_6.Search;

import home_work_6.Interface.ISearchEngine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchEnginePunctuationNormalizerTest {
    @Test
    public void ezT1(){
        ISearchEngine test=new RegExSearch();
        assertEquals(2,test.search("Привет-пока, и вновь привет, а и, забыл, пока. И?", "и"));
        assertEquals(1,test.search("Привет-пока, и вновь привет, а и, забыл, пока. И?", "И"));
    }

    @Test
    public void ezT2(){
        ISearchEngine test=new RegExSearch();
        assertEquals(3,test.search("МИр, миР, МИР, мИр, мириться, мера, мИР, мир-мир, мир, Мир?Мир", "мир"));
        assertEquals(2,test.search("МИр, миР, МИР, мИр, мириться, мера, мИР, мир-мир, мир, Мир?Мир", "Мир"));
    }

    @Test
    public void ezT3(){
        ISearchEngine test=new RegExSearch();
        assertEquals(0,test.search("", "и"));
        assertEquals(0,test.search("", "мир"));
        assertEquals(0,test.search("", " "));
    }

}