package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // CRIANDO OBJETOS
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of the triangle:");
         x.a = sc.nextDouble();
         x.b = sc.nextDouble();
         x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
         y.a = sc.nextDouble();
         y.b = sc.nextDouble();
         y.c = sc.nextDouble();

        double py = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(py * (py - x.a) * (py - x.b) * (py - x.c));

        py = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(py * (py - y.a) * (py - y.b) * (py - y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}
