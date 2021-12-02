package com.khadar.dp.prototype;

public class Show implements ProtoTypeCapable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Show clone() throws CloneNotSupportedException {
        return (Show) super.clone();
    }
}
