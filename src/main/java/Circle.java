class Circle extends Shape{
    private double radius;

    public Circle(double area, double square, double radius) {
        super(area, square);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void commandMethod() {
        super.commandMethod();
    }

    @Override
    public double calculateArea() {
        return Math.PI * (getRadius() * 2);
    }

    @Override
    public double calculateSquare() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    void specificShape() {
        System.out.println("this is a circle and it hasn't any corner");
    }
}