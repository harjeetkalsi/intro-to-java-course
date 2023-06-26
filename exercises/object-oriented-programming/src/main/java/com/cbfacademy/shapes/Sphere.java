package com.cbfacademy.shapes;
import java. lang. Math. *;

public class Sphere extends Shape {

    double radius;

    public Sphere(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = 4 * Math.PI * (radius*radius);
        return area;
    }
    
}
