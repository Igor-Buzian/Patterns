package history;

import edit.EditorState;
import edit.TextEditor;

import java.util.Stack;

public class History {
    private Stack<EditorState> history = new Stack<>();

    public void save(EditorState editorState) {
        if (editorState != null) {
            history.push(editorState);
            System.out.println("Saved new state");
        }
    }

    public EditorState undo() {
        if (!history.isEmpty()) {
            EditorState lastState = history.pop();
            System.out.println("Undo to last state " + lastState.getContent());
            return lastState;
        } else {
            System.out.println("We haven't new states");
            return null;
        }
    }
}
