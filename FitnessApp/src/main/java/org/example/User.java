package org.example;

public class User {
    private String name;
    private Long id;

    User(String name,Long id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
