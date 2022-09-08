package com.danielhh.APIRESTTareas.Service;

import com.danielhh.APIRESTTareas.DTO.TaskInDTO;
import com.danielhh.APIRESTTareas.Mapper.TaskInDTOToTask;
import com.danielhh.APIRESTTareas.Model.Task;
import com.danielhh.APIRESTTareas.Model.TaskStatus;
import com.danielhh.APIRESTTareas.Repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    private final TaskInDTOToTask taskInDTOToTask;


    public TaskService(TaskRepository taskRepository, TaskInDTOToTask taskInDTOToTask) {
        this.taskRepository = taskRepository;
        this.taskInDTOToTask = taskInDTOToTask;
    }

    /*
    El repositorio es de tipo Task por lo que no podemos usar el metodo save para
    un objeto tipo TaskInDTO, por lo que habría que pasarlo a Task
    Para ellos crearemos un clase que haga este cambio
     */
    public Task createTask (TaskInDTO taskInDTO){
        Task task = taskInDTOToTask.map(taskInDTO);
        return taskRepository.save(task);
    }

    public List<Task> findAll(){
        return taskRepository.findAll();
    }

    public List<Task> findAllByStatus(TaskStatus taskStatus){
        return taskRepository.findAllByTaskStatus(taskStatus);
    }
}
