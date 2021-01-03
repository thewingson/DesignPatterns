package kz.almat.behavioral.observer;

public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.setName("SDP");

        Student studentA = new Student("A");
        Student studentB = new Student("B");
        Student studentC = new Student("C");

        subject.subscribe(studentA);
        subject.subscribe(studentB);
        subject.subscribe(studentC);

        System.out.println(studentA.getTasks());

        subject.addTask(new Task("asd", "asd"));
        subject.addTask(new Task("qwe", "qwe"));

        System.out.println(studentA.getTasks());
    }

}
