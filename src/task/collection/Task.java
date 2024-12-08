package task.collection;

import java.util.Objects;

public class Task{

    private int id;
    private String title;
    private boolean isCompleted;

    public Task(int id, String title, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public String getTitle() {
        return title;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(title, task.getTitle());
    }
    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}