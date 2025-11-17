package org.example;
import java.time.LocalDate;

public class Assignment {
    private String title;
    private String course;
    private LocalDate dueDate = LocalDate.of(2025, 11, 20);
    private  boolean completed = false;

    public Assignment(){
        this.title = "";
        this.course = "";
        this.dueDate = LocalDate.of(2025, 11, 20);
        this.completed = false;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }





}
