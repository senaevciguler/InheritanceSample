class Rectangle extends Shape {

    private double cornerTotal;
    private double smallCorner;
    private double bigCorner;


    public Rectangle(double area, double square, double totalCorner, double smallCorner,
                     double bigCorner) {
        super(area, square);
        this.cornerTotal = totalCorner;
        this.smallCorner = smallCorner;
        this.bigCorner = bigCorner;
    }

    public double getCornerTotal() {
        return cornerTotal;
    }

    public double getSmallCorner() {
        return smallCorner;
    }

    public double getBigCorner() {
        return bigCorner;
    }

    public void commandMethod() {
        super.commandMethod();
    }

    @Override
    public double calculateArea() {
        return getSmallCorner() * getBigCorner();

    }

    @Override
    public double calculateSquare() {
        return 2 * (getBigCorner() + getSmallCorner());
    }

    @Override
    void specificShape() {
        System.out.println("this is a rectangle and it has a " + getCornerTotal() + " corner");
    }
}
