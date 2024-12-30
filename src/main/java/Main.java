import java.util.Scanner;
import javax.swing.JFileChooser;
import java.io.*;

/**
   This program lets the user search for names among
   the 65 most popular females names in the 1990 US
   census.
*/

public class Main
{
   public static void main(String[] args) throws IOException
   {

      // Select file with input
      JFileChooser chooser = new JFileChooser();
      int result  = chooser.showOpenDialog(null);
      File file = chooser.getSelectedFile();

      String input;  // To hold keyboard input

      // Create the Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Create a PopularNames object with the census names.
      PopularNames names = new PopularNames(file);

      do
      {
         // Get a name to search for.
         System.out.print("Enter a name to search for: ");
         input = keyboard.nextLine().toUpperCase();

         // Search for the name.
         int index = names.search(input);

         // Display the search results.
         if (index != -1)
            System.out.println(input + " was found in the list.");
         else
            System.out.println(input + " was NOT found in the list.");

         // Want to go again?
         System.out.print("Do you want to search again? (y/n): ");
         input = keyboard.nextLine().toUpperCase();
      } while (input.charAt(0) != 'N');
   }
}