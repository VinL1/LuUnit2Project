import java.util.Scanner;

public class LinearEquationRunner {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        String cord1;
        String cord2;
        int x1;
        int x2;
        int y1;
        int y2;
        double newX;

        System.out.println(LinearEquation.start());
        System.out.println("Enter coordinate 1: \n");
        cord1 = input.nextLine();
        System.out.println("Enter coordinate 2: \n");
        cord2 = input.nextLine();

        x1 = Integer.parseInt(cord1.substring(1, cord1.indexOf(",")));
        y1 = Integer.parseInt(cord1.substring(cord1.indexOf(",") + 1, cord1.indexOf(")")));
        x2 = Integer.parseInt(cord2.substring(1, cord2.indexOf(",")));
        y2 = Integer.parseInt(cord2.substring(cord2.indexOf(",") + 1, cord2.indexOf(")")));

        LinearEquation line1 = new LinearEquation (x1, y1, x2, y2);

        System.out.println(line1.lineInfo() + "\n");

        System.out.println("Enter a value for x: \n");
        newX = input.nextDouble();
        System.out.println("The point on the line is " + line1.coordinateForX(newX));
    }
}
