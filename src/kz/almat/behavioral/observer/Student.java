package kz.almat.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Student implements SubjectObserver{

    private String fullName;

    private List<Task> tasks = new ArrayList<>();

    public Student(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Task> getTasks() {
        return tasks;
    }
    @Override
    public void updateTasks(Task task) {
        this.tasks.add(task);
    }
}
