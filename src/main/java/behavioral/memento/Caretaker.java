package behavioral.memento;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Caretaker {

    private Deque<DocumentMemento> stack = new LinkedList<>();
    private Document document;

    public Caretaker(Document document) {
        this.document = document;
    }

    public void saveDocument() {
        stack.addLast(document.createMemento());

    }

    public void undoDocument() {
        if (stack.isEmpty()) {
            return;
        }
        document.recreateFromMemento(stack.removeLast());
    }





}
