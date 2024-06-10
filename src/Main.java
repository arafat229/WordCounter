import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        System.out.println("Enter the text:");
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();

        int counter = 1;

        for(int i =0; i<text.length();i++)
        {
            if ((text.charAt(i)== ' ')&&(text.charAt(i+1) != ' '))
            {
              counter++;
            }
        }

        System.out.println("Number of word(s): "+counter);


    }

}