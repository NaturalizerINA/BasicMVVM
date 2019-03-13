package com.mukminullah.mmvm.Data;

public class EntityNotes {
    String name;
    String detail;

    public EntityNotes(String name, String detail) {
        this.name = name;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "EntityNotes{" +
                "name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
