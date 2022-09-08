package com.danielhh.APIRESTTareas.Controller;

import com.danielhh.APIRESTTareas.DTO.TaskInDTO;
import com.danielhh.APIRESTTareas.Model.Task;
import com.danielhh.APIRESTTareas.Model.TaskStatus;
import com.danielhh.APIRESTTareas.Service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask (@RequestBody TaskInDTO taskInDTO){
        return this.taskService.createTask(taskInDTO);
    }

    @GetMapping
    public List<Task> findAll(){
        return taskService.findAll();
    }

    @GetMapping("/status/{status}")
    public List <Task> findAllByStatus(@PathVariable ("status") TaskStatus taskStatus){
        return taskService.findAllByStatus(taskStatus);
    }
}
