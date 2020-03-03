

public class Command {
    public static void main(String[] args) {
        //mehmete sor
        Shape shapeR = new Rectangle(2, 2, 2, 2, 2);
        Shape shapeC = new Circle(2, 2, 2);

        System.out.println(shapeR.calculateArea());
        System.out.println(shapeR.calculateSquare());
        System.out.println(shapeC.calculateArea());
        System.out.println(shapeC.calculateSquare());
        shapeR.commandMethod();
        shapeR.specificShape();
        shapeC.commandMethod();
        shapeC.specificShape();


    }

}


