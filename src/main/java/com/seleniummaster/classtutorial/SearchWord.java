package com.seleniummaster.classtutorial;

public class SearchWord {
    private String word;

    public SearchWord() {
    }

    public SearchWord(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "SearchWord{" +
                "word='" + word + '\'' +
                '}';
    }
}
