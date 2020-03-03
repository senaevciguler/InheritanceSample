public abstract class Shape {

    private double area;
    private double square;

    public Shape(double area, double square) {
        this.area = area;
        this.square = square;
    }

    public double getArea(double num1, double num2) {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
    public void commandMethod (){
        System.out.println("there are type of shape model");

    }

    public double calculateArea() {
        return area;
    }

    public double calculateSquare() {
        return square;
    }

     abstract void specificShape();

}
