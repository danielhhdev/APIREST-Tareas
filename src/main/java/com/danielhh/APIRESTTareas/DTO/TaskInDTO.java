package com.danielhh.APIRESTTareas.DTO;

import java.time.LocalDateTime;

/*
Esta clase son los datos que necesitamos para crear un tarea
Es una version simplificada de la tarea, ya que no queremos ciertos datos
que no proceden a la hora de crear la tarea.
 */
public class TaskInDTO {

    private String tittle;
    private String description;
    private LocalDateTime eta;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getEta() {
        return eta;
    }

    public void setEta(LocalDateTime eta) {
        this.eta = eta;
    }
}
