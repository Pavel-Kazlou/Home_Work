package home_work_6;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        text = text.replaceAll("[^а-яА-Я0-9]", " ");
        return iSearchEngine.search(text, word);
    }
}