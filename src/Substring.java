import java.util.Scanner;

public class Substring {

    public static void main(String[] args)
    {
        String string, sub;
        int i, a, length;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to print all its substrings");

        string  = in.nextLine();

        length = string.length();

        System.out.println("Substrings of \""+string+"\" are:");

        for (a = 0; a < length; a++)
        {
            for(i = 1; i <= length - a; i++)
            {
                sub = string.substring(a, a+i);

                System.out.println(sub);
            }
        }
    }
}
