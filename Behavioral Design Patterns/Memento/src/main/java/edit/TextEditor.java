package edit;

public class TextEditor {
private String content;

    public EditorState newState(){
        return new EditorState(content);
    }

    public void restoreContent(EditorState state){
        if(state!=null)
            content = state.getContent();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
