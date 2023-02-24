package io.fp.notebook;

public class Note<T> {
    T noteContent;

    public Note(T noteContent)
    {
        this.noteContent=noteContent;
    }
    public T getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(T noteContent) {
        this.noteContent = noteContent;
    }

    public String toString()
    {
        return "Note:" + noteContent;
    }
}
