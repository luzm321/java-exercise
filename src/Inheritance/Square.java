package Inheritance;

public class Square extends Rectangle{
    // override annotation helps ensure you've overridden the method:
    @Override
    public double calculatePerimeter() {
        return sides * length;
    }

    //method overloads with different signatures:
    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
