package com.pgrabarczyk.spring.integration.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SomeBox {

    private Boolean extra;
    private Object object;

    public SomeBox(Object object) {
	this.object = object;
    }
}
