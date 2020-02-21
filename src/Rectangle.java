public class Rectangle {

    private double width;
    private double length;

    public Rectangle(){
        super();
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double rectWidth, double rectLength){
        this.width = rectWidth;
        this.length = rectLength;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return length+length+width+width;
    }

    public String toString(){
        return "A rectangle with a width=" + width + " and a length=" + length;
    }

}
