import shapes.*;

public class TestResizable {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(10);

        System.out.println("Area of the circle " + circle.getArea());
        System.out.println("Perimeter of the circle " + circle.getPerimeter());

        circle.resize(50);

        System.out.println("Area of the circle " + circle.getArea());
        System.out.println("Perimeter of the circle " + circle.getPerimeter());
    }
}
