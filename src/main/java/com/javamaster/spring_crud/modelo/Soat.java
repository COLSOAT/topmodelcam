package com.javamaster.spring_crud.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

public class Soat {
    @Getter
    @Setter
    String placa;

    @Getter
    @Setter
    @Column(name = "telefono")
    private String telefono;


}
