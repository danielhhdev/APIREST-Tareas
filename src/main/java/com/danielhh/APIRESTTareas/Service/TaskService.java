package com.danielhh.APIRESTTareas.Service;

import com.danielhh.APIRESTTareas.Repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository taskRepository;


    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    
}
