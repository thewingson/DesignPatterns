package kz.almat.structural.proxy;

import java.util.List;

public interface Note {

    void addNote(String note);
    List<String> getNotes();
    void refresh();

}
