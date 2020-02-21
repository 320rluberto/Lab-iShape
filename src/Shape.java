public class Shape {

    private String color;
    private boolean filled;

    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String shapeColor, boolean shapeIsFilled){
        this.color = shapeColor;
        this.filled = shapeIsFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        if(this.filled == true){
            return "A shape with color of " + this.color + " and is filled";
        }
        return "A shape with color of " + this.color + " and is not filled";
    }
}
