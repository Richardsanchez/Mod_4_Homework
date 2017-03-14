/**
 * Created by richarddev on 3/2/17.
 */
import java.util.Scanner;

public class Tester {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled(True or False)?: ");
        Boolean bool = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3, color, bool);

        System.out.println(triangle);

    }

}
