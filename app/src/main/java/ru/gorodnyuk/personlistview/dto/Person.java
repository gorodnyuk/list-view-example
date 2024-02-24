package ru.gorodnyuk.personlistview.dto;

import java.io.Serializable;
import java.util.UUID;

public class Person implements Serializable {
    private UUID id;
    private String name;

    public Person(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
