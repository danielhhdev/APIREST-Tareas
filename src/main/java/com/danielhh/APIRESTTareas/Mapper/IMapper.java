package com.danielhh.APIRESTTareas.Mapper;

/*
Con esta interfaz lo que queremos es mappear un objeto a otro

 */

public interface IMapper <I, O>{
    public O map(I in);
}
