package kz.almat.structural.proxy;

public class Main {

    public static void main(String[] args) {
        Note note = new LocalProxyNote();
        note.addNote("asd");
        note.addNote("ert");
        note.refresh();
    }

}
