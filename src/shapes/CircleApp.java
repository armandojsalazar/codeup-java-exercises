package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input ken = new Input();

        double radius1 = ken.getDouble();
        Circle circle = new Circle(radius1);
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The circumference of the circle is: " + circle.getCircumference());


    }
}
