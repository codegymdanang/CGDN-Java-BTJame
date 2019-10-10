package B5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceResizeableChoLopHinhHoc;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape shapeArray[] = new Shape[3];
        Circle circle = new Circle(3.0);
        shapeArray[0] = circle;
        Rectangle rectangle = new Rectangle(3.0, 5.0);
        shapeArray[1] = rectangle;
        Square square = new Square(5.0);
        shapeArray[2] = square;
        for (int i = 0; i < shapeArray.length ; i++) {
            System.out.println(shapeArray[i]);
            shapeArray[i].resize(getRandom());
        }

    }
    public static int getRandom() {
        return (int )(Math.random() * 50 + 1);
    }
}
