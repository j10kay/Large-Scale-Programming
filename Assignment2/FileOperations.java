package howard.edu.oop.assignment2;
import java.io.File; 
import java.util.Scanner; 
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
* <h1>File Operations!</h1>
* <p>The File Operations program implements an application that
* reads comma separated array value as strings in an input file
* and stores the values in a 2D ArrayList
* </p>
*
* @author  Chijioke Kamanu
* @since 2019-02-07
*/

public class FileOperations {
  
  public static ArrayList<ArrayList<Integer>> getTestArrays(String fileName) throws FileNotFoundException{
    File file = new File(fileName); 
    Scanner sc = new Scanner(file); 
    
    String[] testArraysStrings = new String[10];
    int arrayIndex = 0;
    while (sc.hasNextLine()) {
      testArraysStrings[arrayIndex] = sc.nextLine();
      arrayIndex++;
    }
    
    ArrayList<ArrayList<Integer>> aList = new ArrayList<ArrayList<Integer>>(10); 
    for (int i = 0; i < testArraysStrings.length; i++){
      ArrayList<Integer> tempList = new ArrayList<Integer>(); 
      String[] digits = testArraysStrings[i].split(", ");
      for (int j = 0; j < digits.length; j++){
        tempList.add(Integer.parseInt(digits[j]));
      }
      aList.add(tempList);
    }

    return aList;
  }
}
