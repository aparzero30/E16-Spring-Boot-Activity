package com.example.E16.Spring.Boot.Activity.entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table (name = "taskTable")
public class Task {



    @GeneratedValue
    @jakarta.persistence.Id
    private Integer taskId;
    private String title;
    private String description;
    private String completed;


    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}
