import java.io.*;

/**
   The PopularNames class reads a list of names from
   a file into an array. It provides a search method
   that can be used to search for a particular name
   in the array.
*/

public class PopularNames
{
   private String[] names;

   /**
      Constructor
      @param filename Name of the file to read
                      census names from.
      @throws IOException When a file I/O error occurs.
   */
   public PopularNames(File file) throws IOException
   {
      // Create the file stream objects.
      FileReader freader = new FileReader(file);
      BufferedReader inFile = new BufferedReader(freader);

      // Get the number of lines in the file.
      int size = numLines(file);

      // Create an array large enough to hold all the 
      // Strings in the file.
      names = new String[size];

      // Read the names from the file into the array.
      for (int count = 0; count < size; count++)
         names[count] = inFile.readLine();

      // Close the file.
      inFile.close();

      // Sort the names.
      quickSort();
   }

   /**
      The search method performs a binary search on the
      names array. If the search value is found, its
      array subscript is returned. Otherwise -1 is returned
      indicating the search value was not found in the
      array.
      @param value The string to search for.
      @return The subscript of the name if it was found;
              -1 otherwise.
   */

   public int search(String value)
   {

   }

   /**
      The numLines method counts the number of lines
      in a text file.
      @param file the file to read.
      @return The number of lines in the file.
      @throws IOException When a file I/O error occurs.
   */
   private int numLines(File file) throws IOException
   {
      // Create the file stream objects.
      FileReader freader = new FileReader(file);
      BufferedReader inFile = new BufferedReader(freader);

      // Initialize a counter.
      int count = 0;

      // Read the first line from the file.
      String input = inFile.readLine();

      // Read the remaining contents and count
      // the lines that are read.
      while (input != null)
      {
         count++;
         input = inFile.readLine();
      }

      // Close the file.
      inFile.close();

      // Return the number of lines.
      return count;
   }

  /**
      The quickSort method calls the doQuickSort method
      to sort the names array.
   */

   private void quickSort()
   {

   }


   /**
      The doQuickSort method uses the QuickSort algorithm
      to sort an array of strings.
      @param array The array to sort.
      @param start The starting subscript of the list to sort
      @param end The ending subscript of the list to sort
   */

   private void doQuickSort(String array[], 
                                   int start, int end)
   {

   }

   /**
      The partiton method selects a pivot value in an array
      and arranges the array into two sub lists. All the
      values less than the pivot will be stored in the left
      sub list and all the values greater than or equal to
      the pivot will be stored in the right sub list.
      @param array The array to partition.
      @param start The starting subscript of the area to partition.
      @param end The ending subscript of the area to partition.
      @return The subscript of the pivot value.
   */

   private int partition(String array[], 
                         int start, int end)
   {

   }

   /**
      The swap method swaps the contents of two elements
      in an array of String objects.
      @param The array containing the two elements.
      @param a The subscript of the first element.
      @param b The subscript of the second element.
   */

   private void swap(String[] array, int a, int b)
   {
      String temp;

      temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   }
}