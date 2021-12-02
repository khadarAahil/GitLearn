package com.khadar.dp.problem.solution;

public class Rectangle implements Shape{

    private int height;

    private int width;

    public Rectangle(int length, int width) {
        this.height = length;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int computeArea() {
        return width * height;
    }
}
