package kz.almat.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String name;
    private List<Task> tasks = new ArrayList<>();
    private List<SubjectObserver> observers = new ArrayList<>();

    public Subject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task){
        this.tasks.add(task);
        this.observers.forEach(observer -> observer.updateTasks(task));
    }

    public List<SubjectObserver> getObservers() {
        return observers;
    }

    public void subscribe(SubjectObserver observer){
        this.observers.add(observer);
    }

    public void unsubscribe(SubjectObserver observer){
        this.observers.remove(observer);
    }

}
