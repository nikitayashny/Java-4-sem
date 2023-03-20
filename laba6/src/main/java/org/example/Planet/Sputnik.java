package org.example.Planet;

public class Sputnik {
    private String name;
    private float radius;
    private float distance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Sputnik{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", distance=" + distance +
                '}';
    }
}