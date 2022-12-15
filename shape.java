import java.util.Scanner;

public class shape {
    public static void main(String[] args) {

        notShape a = new Reactangle();
        a.read();
        a.show();

        a = new Circle();
        a.read();
        a.show();
    }
}

abstract class notShape {
    final float PI = 3.14f;

    abstract void read();

    abstract void show();
}

class Reactangle extends notShape {
    double length;
    double width;
    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter length : ");
        length = sc.nextDouble();
        System.out.print("Enter width : ");
        width = sc.nextDouble();
    }

    void show() {
        System.out.println("The area of Reactangle is :" + (length * width));
    }
}

class Circle extends notShape {
    double radius;
    Scanner sc = new Scanner(System.in);

    void read() {
        System.out.print("Enter Radius of Circle : ");
        radius = sc.nextDouble();
    }

    void show()
    {
        System.out.println("The area of Circle is : "+(radius*radius*radius));
    }
}