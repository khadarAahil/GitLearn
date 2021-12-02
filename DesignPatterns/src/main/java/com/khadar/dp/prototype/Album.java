package com.khadar.dp.prototype;

public class Album implements ProtoTypeCapable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Album clone() throws CloneNotSupportedException {
        return (Album) super.clone();
    }

    @Override
    public String toString() {
        return "Album";
    }
}
