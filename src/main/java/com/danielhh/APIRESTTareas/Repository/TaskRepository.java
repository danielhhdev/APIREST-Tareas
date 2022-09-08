package com.danielhh.APIRESTTareas.Repository;

import com.danielhh.APIRESTTareas.Model.Task;
import com.danielhh.APIRESTTareas.Model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository <Task, Long> {

    /*
    Como JPARepository no tiene ingun metodo que nos busque por el estado de la tarea
    (Obvio ya que es un parametro que hemos creado nosotros)
    Creamos un método que nos devuelva una lista de las tareas en funcion de un estado
     */
    public List <Task> findAllByTaskStatus (TaskStatus taskStatus);
}
