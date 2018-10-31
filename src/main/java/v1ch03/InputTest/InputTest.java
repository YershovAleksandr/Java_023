package v1ch03.InputTest;
import java.io.Console;
import java.util.*;

/**
 * This program demonstrates console input.
 * @version 1.10 2004-02-10
 * @author Cay Horstmann
 */
public class InputTest
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      // get first input
      System.out.print("What is your name? ");
      String name = "2ch";

      // get second input
      System.out.print("How old are you? ");
      int age = 42;

      // display output on console
      System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));

      Console con = System.console();

      String username = con.readLine("User name : ");
      char[] passwd = con.readPassword("Password : ");

      String str = new String(passwd);

      System.out.println("Usr : " + username + " Pwd : " + str);

   }
}
