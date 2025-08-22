package demo;

import edit.EditorState;
import edit.TextEditor;
import history.History;

public class Main {
    public static void main(String[] args) {
        TextEditor edit = new TextEditor();
        History history = new History();

        edit.setContent("Hello");
        history.save(edit.newState());
        System.out.printf("Created %s and saved \n", edit.getContent());
        edit.setContent("World");
        history.save(edit.newState());
        System.out.printf("Created new content %s and saved \n", edit.getContent());
        edit.restoreContent(history.undo());
        edit.restoreContent(history.undo());
        edit.restoreContent(history.undo());
    }
}
