package com.danielhh.APIRESTTareas.Repository;

import com.danielhh.APIRESTTareas.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task, Long> {
}
