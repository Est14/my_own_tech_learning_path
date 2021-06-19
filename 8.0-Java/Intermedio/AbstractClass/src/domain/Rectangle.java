package domain;

public class Rectangle extends GeometricFigure{

    public Rectangle(String figure){
        super(figure);
    }

    public void  draw(){
        System.out.println("Print: " + this.getClass().getSimpleName());
    };
}
