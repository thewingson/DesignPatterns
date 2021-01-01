package kz.almat.structural.adapter;

public class Main {

    public static void main(String[] args) {
//        Message64bit message64bit = DataProvider.getMessage();
        MessageAdapter adapter = new MessageAdapter(DataProvider.getMessage());

        DataAnalyzer.analyze(adapter);

    }

}
