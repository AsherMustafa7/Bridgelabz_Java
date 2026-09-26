/*
Question:
9. Write a program to demonstrate ArrayIndexOutOfBoundsException using an array of names and a user-supplied index.

Hints:
1. Define an array of names.
2. Write a method that accesses an index larger than the array length.
3. Write a method using try catch for ArrayIndexOutOfBoundsException and RuntimeException.
4. Call the handling method from main.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/
/*
import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionDemo
{
    public static void Throwingexception(String[] str, int index)
    {
        try
        {
            System.out.println("Element at index "+ index+ " is "+str[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The index is not correct");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String [] str= {"Asher","Mustafa","Hello"};
        System.out.println("valid indexs are 0 to 2");
        System.out.println("Enter the index to print the word");
        int n = sc.nextInt();
        Throwingexception(str,n);
        return;
    }
}
*
* */

import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionsDemo
{
    public static void TheExceptions(String str[], int index) throws Exception
    {
        // i need to kind of check the index here
        if(index < 0 || index >= str.length)
        {
            throw new Exception("Invalid index: " + index);
        }
        // Alright so I will explain this to you , what this means is that that function "TheExcaption"m  is telling the java that I "may" throw an exception
        // and who so ever will call me need to make sure to handle it , that is what the main function has a try and catch to handle it
        // this is not as straight forward though , as you can clear see I wrote "throws Exception" now keep in mind that Exception is a superclass containing ,
        // checked and runtime exception , so checked(FileNotFoundException, SQLException, IOException etc) and runtime->unchecked(ArrayIndexOutOfBoundsException, NullPointerException, ArithmeticException, NumberFormatException)
        // You will also notice that I have written catch (Exception e ) and not catch(ArrayIndexOutOfBoundsException e)
        // okay the idea is that java check that if you hand handled a checked exception or not at compile time itself -> so say you had throws Exception but
        // you wrote catch(ArrayIndexOutOfBoundsException e) then its wrong, cause we need to handle a unchecked experession and we even if our function is saying i may throw
        // a checked experion i am only handling an uncheck exception so that is worng , i need to write catch(exception e) so that i have that user class

        // know that you dont have to do all this with a uncheaked or run time exception, cause java dont cheack it during compile time, ofcourse you can handle it , like place a
        // block in try and catch and check for it but it wont throw an error at compile time, and wont ask you to mandarory handle it
        // but say if there is a file that you want to import and you wrote something like
        // FileReader file = new FileReader("data.txt");
        // This can through an exception called FileNotFound and that is a check one, so java will say at compile time itself that you need to handle it
        System.out.println("Element at index " + index + " is " + str[index]);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("The valid index are 0 and 2");
        System.out.println("Enter your index");
        int n =sc.nextInt();
        String [] str={"Asher","Mustafa","hello"};
        try
        {
            TheExceptions(str,n);
        }
        catch (Exception e)
        {
            System.out.println("The Exception "+e.getMessage());
            System.out.println("The Exception class name"+e.getClass().getName() );
            System.out.println("The Exception simple name"+e.getClass().getSimpleName());
            /*The valid index are 0 and 2
                Enter your index
                3
                The Exception Invalid index: 3
                The Exception class namejava.lang.Exception
                The Exception simple nameException*/
                // the above output happened cause we ourself wrote throw new Exception("Invalid index"); and throws Exceptionwe need to change it to
                // throw new ArrayIndexOutOfBoundsException("Invalid index: " + index); and public static void TheExceptions(String str[], int index) throws ArrayIndexOutOfBoundsException
        }
        return;
    }
}

/*
import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionsDemo
{
    public static void TheExceptions(String str[], int index)
    {
        // i need to kind of check the index here

            try
            {
                System.out.println("Element at index " + index + " is " + str[index]);
            }
            catch(Exception e)
            {
                System.out.println("There has been an exception "+e.getMessage());
            }
    }
    // So now as you can see there is no throw or throws , only try and catch, always rememerber that its very important when you have throw you want to throw an exeption when you see something is worng so what wwe did is that
    // we cheaked if(index < 0 || index >= str.length) and then used throw , while in normal one we havent cheked we just try to do something and if that is something is throwing error then it will automatically catch it.
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("The valid index are 0 and 2");
        System.out.println("Enter your index");
        int n =sc.nextInt();
        String [] str={"Asher","Mustafa","hello"};
        TheExceptions(str,n);
        return;
    }
}


* */