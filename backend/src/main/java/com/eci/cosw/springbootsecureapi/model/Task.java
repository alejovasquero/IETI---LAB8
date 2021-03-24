package com.eci.cosw.springbootsecureapi.model;

import java.util.Date;

public class Task {


    private String description;
    private TaskUser responsible;
    private TaskStatus status;
    private Date dueDate;


    public Task(String description, TaskUser responsible, TaskStatus status, Date dueDate) {
        this.description = description;
        this.responsible = responsible;
        this.status = status;
        this.dueDate = dueDate;
    }

    public Task(){

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskUser getResponsible() {
        return responsible;
    }

    public void setResponsible(TaskUser responsible) {
        this.responsible = responsible;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return String.format("{ description: '%s', responsible: %s, status, %s, dueDate: %s}", description, responsible.toString(), status.toString(), dueDate.toString());
    }
}
