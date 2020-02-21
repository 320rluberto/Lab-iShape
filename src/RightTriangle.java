public class RightTriangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;
    private boolean hyp;

    public RightTriangle(){
        super();
        this.sideA = 3;
        this.sideB = 4;
        this.sideC = 5;
        this.hyp = true;
    }

    public RightTriangle(double a, double b, boolean hypot){
        super();
        generateSides(a, b, hypot);
    }

    public RightTriangle(double a, double b, boolean hypot, String color, boolean filled){
        super();
        generateSides(a, b, hypot);
        setColor(color);
        setFilled(filled);
    }

    public void generateSides(double a, double b, boolean hypot){
        if(hypot == true){
            if(a > b){
                this.sideC = a;
                this.sideA = b;

            }
            else{
                this.sideC = b;
                this.sideA = a;
            }
            this.sideB = Math.sqrt(Math.pow(this.sideC, 2) / Math.pow(this.sideA, 2));
        }
        else{
            this.sideA = a;
            this.sideB = b;
            this.sideC = Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2));
        }
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public boolean isHyp() {
        return hyp;
    }

    public void setHyp(boolean hyp) {
        this.hyp = hyp;
    }

    public double getArea(){
        return (1/2*this.sideA*this.sideB);
    }

    public double getPerimeter(){
        return this.sideA + this.sideB + this.sideC;
    }




}
