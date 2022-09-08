package com.danielhh.APIRESTTareas.Mapper;

import com.danielhh.APIRESTTareas.DTO.TaskInDTO;
import com.danielhh.APIRESTTareas.Model.Task;
import com.danielhh.APIRESTTareas.Model.TaskStatus;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/*
Con esta clase mappeamos un TasInDTO a un Task
 */
@Component
public class TaskInDTOToTask implements IMapper <TaskInDTO, Task>{

    @Override
    public Task map(TaskInDTO in) {
        Task task = new Task();
        task.setTittle(in.getTittle());
        task.setDescription(in.getDescription());
        task.setEta(in.getEta());
        task.setCreatedTask(LocalDateTime.now());
        task.setTaskFinished(false);
        task.setTaskStatus(TaskStatus.ON_TIME);
        return task;
    }
}
