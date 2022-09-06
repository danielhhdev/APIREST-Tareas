package com.danielhh.APIRESTTareas.Model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Task")
public class Task {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tittle;
    private String description;
    private LocalDateTime createdTask;
    private LocalDateTime eta;
    private boolean TaskFinished;
    private TaskStatus taskStatus;

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedTask() {
        return createdTask;
    }

    public void setCreatedTask(LocalDateTime createdTask) {
        this.createdTask = createdTask;
    }

    public LocalDateTime getEta() {
        return eta;
    }

    public void setEta(LocalDateTime eta) {
        this.eta = eta;
    }

    public boolean isTaskFinished() {
        return TaskFinished;
    }

    public void setTaskFinished(boolean taskFinished) {
        TaskFinished = taskFinished;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}
