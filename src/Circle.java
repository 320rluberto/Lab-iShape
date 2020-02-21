public class Circle extends Shape{

    private double radius;

    public Circle(){
        super();
        this.radius = 0;
    }

    public Circle(String shapeColor, boolean shapeIsFilled, double shapeRadius){
        super(shapeColor, shapeIsFilled);
        this.radius = shapeRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (Math.PI*Math.sqrt(radius));
    }

    public double getPerimeter(){
        return (2*Math.PI*radius);
    }

    public String toString(){
        return "A Circle with a radius=" + radius;
    }

}
