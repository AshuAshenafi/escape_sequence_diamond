import java.util.Scanner;

public class EscapeSequence {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int rows = keyboard.nextInt();

        System.out.println("Enter the number of rows: ");

        for (int i=1; i<= rows ; i++)
        {
            for (int j = rows; j > i ; j--) {

            System.out.print(" ");
            }

            System.out.print("*");

            for (int k = 1; k < 2*(i -1) ;k++) {
                System.out.print(" ");
            }
            if( i==1) {
                System.out.println("");
            }
            else {
                System.out.println("*");
            }
        }

        for (int i=rows-1; i>= 1 ; i--)
        {
            for (int j = rows; j > i ; j--) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int k = 1; k < 2*(i -1) ;k++) {
                System.out.print(" ");
            }

            if( i==1){
                System.out.println("");
            }

            else{
                System.out.println("*");
            }
        }
        keyboard.close();
    }

}
