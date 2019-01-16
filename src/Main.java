import java.util.Scanner;

public class Main {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double x, y, z;
        double Total;

        System.out.print( " Enter First no:" );
        x = keyboard.nextInt();

        System.out.print( "Enter Second no: " );
        y = keyboard.nextInt();

        System.out.print( "Enter third no: " );
        z = keyboard.nextInt();

        System.out.println("The sum of all values are : " + (x+y+z));
    }

}
