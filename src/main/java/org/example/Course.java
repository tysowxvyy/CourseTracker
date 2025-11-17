package org.example;

/** This is the Course class; the blueprint for each course.
 * Each course has two pieces od data:
 * id: a unique number (long)
 * name: the course name (like "CS400")
 * The constructor lets you make a Course with both fields.
 * Getters and setters allow reading and changing the two variables.
 * This class represents ONE course in your system.
*/

public class Course {
    private long id;
    private String name;

    public Course() {
    }

    public Course(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}
