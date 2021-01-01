package kz.almat.structural.adapter;

public class Main {

    public static void main(String[] args) {
        // class adapter
        Message64bit message64bit = DataProvider.getMessage();
        MessageClassAdapter classAdapter = new MessageClassAdapter(message64bit.getMessage());

        DataAnalyzer.analyze(classAdapter);

        // object adapter
        MessageObjectAdapter objectAdapter = new MessageObjectAdapter(DataProvider.getMessage());
        DataAnalyzer.analyze(objectAdapter);

    }

}
