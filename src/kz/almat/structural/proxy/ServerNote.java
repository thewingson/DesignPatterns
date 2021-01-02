package kz.almat.structural.proxy;

import java.util.List;

public class ServerNote implements Note {

    private List<String> notes;

    public ServerNote(List<String> notes) {
        this.notes = notes;
    }

    @Override
    public void addNote(String note) {

    }

    @Override
    public List<String> getNotes() {
        return this.notes;
    }

    @Override
    public void refresh() {
        System.out.println(notes);
    }
}
