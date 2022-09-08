package com.danielhh.APIRESTTareas.Service;

import com.danielhh.APIRESTTareas.DTO.TaskInDTO;
import com.danielhh.APIRESTTareas.Model.Task;
import com.danielhh.APIRESTTareas.Repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository taskRepository;


    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    /*
    El repositorio es de tipo Task por lo que no podemos usar el metodo save para
    un objeto tipo TaskInDTO, por lo que habría que pasarlo a Task
    Para ellos crearemos un clase que haga este cambio
     */
    public Task createTask (TaskInDTO taskInDTO){
        taskRepository.save()
    }
}
