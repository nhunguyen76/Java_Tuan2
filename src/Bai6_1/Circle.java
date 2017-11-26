package Bai6_1;

public class Circle extends Shape{
	private double radius;

    public Circle() {
    	super();
    	this.radius=0.1;
    }
    
    public Circle(double radius) {
    	super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
    	super(color,filled);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }
    
    @Override
    public String toString() {
        return "A Circle with radius="+ this.getRadius() +", which is a subclass of " + super.toString();
    }
}
