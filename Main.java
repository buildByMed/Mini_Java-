class ComplexNo {
    int real, imag;

    ComplexNo(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Calculator {

    // i. Multiply two integers
    void multiply(int a, int b) {
        System.out.println("Multiplication of integers: " + (a * b));
    }

    // ii. Repeat a string n times
    void multiply(String str, int n) {
        System.out.print("Repeated string: ");
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

    // iii. Multiply two complex numbers
    void multiply(ComplexNo c1, ComplexNo c2) {
        int real = (c1.real * c2.real) - (c1.imag * c2.imag);
        int imag = (c1.real * c2.imag) + (c1.imag * c2.real);

        System.out.println("Multiplication of complex numbers: "
                + real + " + " + imag + "i");
    }

    // iv. Translate point by multiplying coordinates with factor
    void multiply(Point p, int factor) {
        int newX = p.x * factor;
        int newY = p.y * factor;

        System.out.println("Translated point: (" + newX + ", " + newY + ")");
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        // i. Two integers
        c.multiply(5, 4);

        // ii. String and integer
        c.multiply("Java ", 3);

        // iii. Two complex numbers
        ComplexNo c1 = new ComplexNo(2, 3);
        ComplexNo c2 = new ComplexNo(4, 5);
        c.multiply(c1, c2);

        // iv. Point and translation factor
        Point p = new Point(3, 4);
        c.multiply(p, 2);
    }
}