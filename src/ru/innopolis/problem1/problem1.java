public class problem1 {
    public static void main(String[] args) {
        ShapeFactory shapeFactory;
        String shapeName;
        Scanner scanner = new Scanner(System.in);
        shapeName = scanner.next();
        switch (shapeName){
            case "Circle":
                shapeFactory = new CircleFactory();
                break;
            case "Square":
                shapeFactory = new SquareFactory();
                break;
            case "Rectangle":
                shapeFactory = new RectangleFactory();
                break;
            default:
                System.out.println("Invalid input");
        }
        
    }
}
interface IShapeFactory{
    public Shape getInstance();
}

class ShapeFactory implements IShapeFactory{
    @Override
    public Shape getInstance() {
        return null;
    }
}

class CircleFactory extends ShapeFactory{

    public Shape getInstance(int radius) {
        return new Circle(radius);
    }
}
class SquareFactory extends ShapeFactory{

    public Shape getInstance(int length){
        return new Square(length);
    }
}

class RectangleFactory extends ShapeFactory{

    public Shape getInstance(int height, int width){
        return new Rectangle(height, width);
    }
}

interface Shape{

}

class Circle implements Shape{
    int radius;
    Circle(int radius){
        this.radius= radius;
    }
}

class Square implements Shape{
    int side_length;
    Square(int length){
        this.side_length = length;
    }
}

class Rectangle implements Shape{
    int height, width;
    Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
}
