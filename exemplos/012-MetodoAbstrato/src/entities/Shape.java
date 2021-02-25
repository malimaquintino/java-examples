package entities;

import entities.enums.Color;

/*
* para ter um metodo abstrato a classe deve ser abstrata tbm
* */
public abstract class Shape {
    private Color color;

    public Shape() {}

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
