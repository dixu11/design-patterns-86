package behavioral.template_method;

import java.util.Scanner;

public abstract class TextConverter {

   final public void runConverter() {
        //TODO przerób te metodę na metodę szablonową -> przygotuj 2 klasy implementujące ten szablon

        //Przewidziane kroki algorytmu:
        //krok 1: Wczytanie danych
       String sentence = loadData();

        //krok 2: przetworzenie zdania
        String[] words = sentence.split(" ");
        String sentenceBackward = "";
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            sentenceBackward += word + " ";
        }
        //krok 3: zaprezentuj rezultaty
        showResults(sentenceBackward);
    }

    protected abstract String loadData();
    protected abstract void showResults(String sentence);

}
