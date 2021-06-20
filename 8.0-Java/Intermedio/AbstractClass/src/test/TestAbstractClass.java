package test;

import domain.GeometricFigure;
import domain.Rectangle;

public class TestAbstractClass {

    public static void main(String[] args) {

        GeometricFigure figure = new Rectangle("Rectangle");
        figure.draw();
    }
}
