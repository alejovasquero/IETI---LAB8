package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.model.TaskStatus;
import com.eci.cosw.springbootsecureapi.model.TaskUser;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    private List<Task> tasks = new ArrayList<>();

    @PostConstruct
    public void populateTasks(){
        TaskUser user = new TaskUser("david", "david@example.com");

        tasks.add(new Task("Sample Task", user, TaskStatus.READY, new Date()));
        tasks.add(new Task("Do Homework", user, TaskStatus.IN_PROGRESS, new Date()));
        tasks.add(new Task("Kill myself", user, TaskStatus.TO_DO, new Date()));
    }

    @Override
    public List<Task> getAll() {
        return tasks;
    }

    @Override
    public Task createTask(Task task) {
        tasks.add(task);
        return task;
    }
}
