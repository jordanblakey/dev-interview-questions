// Single line comment
/* Multi
   Line
   Comment */

// Import statements
import java.util.ArrayList; // Import single class
import java.util.Scanner;
import java.security.*; // Import all classes from a package

// Class declaration -- File name should match the top level class
public class JavaRefresher {
  // main method is required for a class or program to run.
  public static void main(String[] args) {
    // Output (stdout) /////////////////////////////////////////////////////////

    // println creates a new line
    System.out.println("Hello world!");
    System.out.println(
      "Integer: " + 10 +
      " Double: " + 3.14 +
      " Boolean: " + true
    );

    // use print to print without a newline
    System.out.print("Hello ");
    System.out.print("World!");

    // Input ///////////////////////////////////////////////////////////////////

    // use the Scanner class to read input
    System.out.print("\nPlease enter your name: ");
    Scanner myScanner = new Scanner(System.in);

    // Read string input
    String name = myScanner.next();
    System.out.println("Your name was read as: " + name);

    // System.out.print("Please enter a byte: ");
    // byte numByte = myScanner.nextByte(); // Read byte input
    // System.out.print("Please enter an integer: ");
    // int numInt = myScanner.nextInt(); // Read int input
    // System.out.print("Please enter a float: ");
    // float numFloat = myScanner.nextFloat(); // Read float input
    // System.out.print("Please enter a double: ");
    // double numDouble = myScanner.nextDouble(); // Read double input
    // System.out.print("Please enter a boolean: ");
    // boolean bool = myScanner.nextBoolean(); // Read boolean input

    // Variables ///////////////////////////////////////////////////////////////
    int fooInt;
    int fooInt1, fooInt2, fooInt3;
    int barInt = 1; // -2,147,483,648 to 2,147,483,647
    int barInt1, barInt2, barInt3;
    barInt1 = barInt2 = barInt3 = 1;
    int signedInt = (int) 10; // Manual type casting
    short fooShort = 10000; // -32,768 to 32,767
    long fooLong = 100000L; // 64bit signed two's complement integer
    float fooFloat = 234.5f;
    double fooDouble = 123.4;
    boolean fooBoolean = true;
    char fooChar = 'A'; // 16 bit Unicode character
    System.out.println(fooChar); // "A"

    // Constants ///////////////////////////////////////////////////////////////
    final int HOURS_I_WORK_PER_WEEK = 9001; // Cannot be reassigned
    final double E; // Can be initialized but not assigned
    E = 2.71828; // Cannot be reassigned

  }
}
