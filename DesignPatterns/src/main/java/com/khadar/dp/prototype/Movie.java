package com.khadar.dp.prototype;

public class Movie implements ProtoTypeCapable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Movie clone() throws CloneNotSupportedException {
        return (Movie)super.clone();
    }

    @Override
    public String toString() {
        return "Movie";
    }
}
