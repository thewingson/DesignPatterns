package kz.almat.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class LocalProxyNote implements Note {

    private Note note;
    private List<String> notes;

    public LocalProxyNote() {
    }

    public LocalProxyNote(Note note) {
        this.note = note;
    }

    @Override
    public void addNote(String note) {
        if (this.notes == null) {
            this.notes = new ArrayList<>();
        }
        this.notes.add(note);
    }

    @Override
    public List<String> getNotes() {
        return this.notes;
    }

    @Override
    public void refresh() {
        if (this.note == null) {
            this.note = new ServerNote(this.notes);
        }
        note.refresh();
    }
}
