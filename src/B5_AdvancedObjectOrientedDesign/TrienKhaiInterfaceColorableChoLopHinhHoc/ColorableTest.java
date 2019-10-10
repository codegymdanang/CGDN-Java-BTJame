package B5_AdvancedObjectOrientedDesign.TrienKhaiInterfaceColorableChoLopHinhHoc;

public class ColorableTest {
    public static void main(String[] args) {
        Shape shapeArray[] = new Shape[3];
        Circle circle = new Circle(3.0);
        shapeArray[0] = circle;
        Square square = new Square(5.0);
        shapeArray[1] = square;
        Rectangle rectangle = new Rectangle(3.0, 5.0);
        shapeArray[2] = rectangle;

        for (int i = 0; i < shapeArray.length ; i++) {
            System.out.println(shapeArray[i]);
            if (shapeArray[i] instanceof Colorable) {
                Colorable square1 = (Square) shapeArray[i];
                square1.howToColor();
            }

        }

    }
}
