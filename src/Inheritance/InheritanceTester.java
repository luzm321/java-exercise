package Inheritance;

public class InheritanceTester {
    public static void main(String[] args) {
        //var employee = new Employee();
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");

        // Chain of inheritance from Person to Woman to Mother:
        Mother mom = new Mother();
        mom.setName("Jane"); // inherit setter method from Person ancestor
        System.out.println(mom.getName() + " is a " + mom.getGender());
    }

    public static void testSquareOverride() {
        var rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        var square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }
}
