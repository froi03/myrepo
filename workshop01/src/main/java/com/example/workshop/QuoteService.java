package com.example.workshop;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class QuoteService {
    private List<String> quotes;
    private int currentIndex;

    public QuoteService() {
        initialize();
    }

    private void initialize(){
        quotes = Arrays.asList(
            "Logic will get you from A to B. Imagination will take you everywhere.",
            "There are 10 kinds of people. Those who know binary and those who don't.",
            "There are two ways of constructing a software design. One way is to make it so simple that there are obviously no deficiencies and the other is to make it so complicated that there are no obvious deficiencies.",
            "It's not that I'm so smart, it's just that I stay with problems longer.",
            "It is pitch dark. You are likely to be eaten by a grue."
        );
        currentIndex = 0;
        Collections.shuffle(quotes); // shuffle all quotes
    }

    public String getQuote() {
        // get the next quote randomly from the list and without repeats
        if (currentIndex >= quotes.size()) {
            initialize();
            return getQuote();
        }
        String quote = quotes.get(currentIndex);
        currentIndex++; // move forward in the shuffled list
        return quote;
    }

    public String getRepoUrl() {
        return "https://github.com/froi03/myrepo";
    }
}