package io.fp.notebook;

public class IntelligentNote {
    public String noteContent;
    public Days dueDay;
    public int prio;

    public IntelligentNote(String noteContent, Days dueDay, int prio) throws IntelligentNoteException {
        if (prio > 10 || prio < 1)
            throw new IntelligentNoteException("Prio is out of range!");
        this.noteContent = noteContent;
        this.dueDay = dueDay;
        this.prio = prio;
    }

    public String getNodeContent() {
        return noteContent;
    }

    public void setNodeContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public int getPrio() {
        return prio;
    }

    public void setPrio(int prio) throws IntelligentNoteException {
        if (prio > 10 || prio < 1)
            throw new IntelligentNoteException("Prio is out of range!");
        this.prio = prio;
    }

    @Override
    public String toString() {
        return "You have to do: " + noteContent + " with prio=" + prio + " until " + dueDay.toString();
    }

}
