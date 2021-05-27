package behavioral.template_method;

import behavioral.template_method.TextConverter;

import java.util.Scanner;

public class TextConverterConsole extends TextConverter {
    @Override
    protected String loadData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz zdanie - postaram się, wyświetlić je od tyłu :)");
        String sentence = scanner.nextLine();
        return sentence;
    }

    @Override
    protected void showResults(String sentenceBackward) {
        System.out.println("Twoje zdanie: ");
        System.out.println(sentenceBackward);
    }
}
