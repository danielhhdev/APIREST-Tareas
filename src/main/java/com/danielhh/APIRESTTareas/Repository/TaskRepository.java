package com.danielhh.APIRESTTareas.Repository;

import com.danielhh.APIRESTTareas.Model.Task;
import com.danielhh.APIRESTTareas.Model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TaskRepository extends JpaRepository <Task, Long> {

    /*
    Como JPARepository no tiene ingun metodo que nos busque por el estado de la tarea
    (Obvio ya que es un parametro que hemos creado nosotros)
    Creamos un método que nos devuelva una lista de las tareas en funcion de un estado
     */
    public List <Task> findAllByTaskStatus (TaskStatus taskStatus);


    /*
    Marca una tarea como finalizada
    Se hace una query nativa, para que cuando se llame a ese metodo pueda hacer la modificacion en la BD
    @Modifying hace que esta query es una query de actualizacion
     */
    @Modifying
    @Query(value = "UPDATE TASK SET FINISHED = true WHERE ID=id", nativeQuery = true)
    public  void markTaskAsFinished(@Param("id")Long id);


}
