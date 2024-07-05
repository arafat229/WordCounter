import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {


        System.out.println("Enter the text:");
        // next 2 lines should be merged in one

        String text = new Scanner(System.in).nextLine();

        // use string.split function to get the result u need

        String [] ArrayOfText = text.split(" ");


            System.out.println("Number of Words: "+ArrayOfText.length);



    }

}
