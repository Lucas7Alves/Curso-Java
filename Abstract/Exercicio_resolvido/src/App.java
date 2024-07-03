import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Circle;
import entites.Rectangle;
import entites.Shape;
import entites_enum.Color;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle Circle (r/c): ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            if (type == 'r') {
                
                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.nextLine());
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                sc.nextLine();

                
                shapes.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.nextLine());
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                sc.nextLine();
                shapes.add(new Circle(color, radius));
            }          

        }

        sc.close();

        System.out.println("SHAPES AREAS:");
        for (Shape s : shapes) {
            System.out.println(String.format("%.2f", s.area()));
        }
    }
}
