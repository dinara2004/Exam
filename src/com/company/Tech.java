package com.company;

public abstract class Tech {
    private String name;

    public abstract void run();

    public Tech() {
    }

    public Tech(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tech{" +
                "name='" + name + '\'' +
                '}';
    }
}
