package Bai8;



public abstract class Shape {
    protected String color;
    
    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return "Shape [color=" + color + "]";
    }
    
}