package javaString.Level2;
/*
Question:
2. Write a program to split the text into words, compare the result with the split method, and display the result.

Hints:
1. Take user input using Scanner nextLine.
2. Create a method to find the length of the String without using the built-in length method.
3. Create a method to split the text into words using charAt without using String split.
4. First count the words and create an array to store the indexes of the spaces.
5. Then create an array to store the words and use the indexes to extract the words.
6. Create a method to compare two String arrays and return a boolean.
7. The main function calls the user-defined method and the built-in split method and compares the arrays.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/
import java.util.Scanner;
public class SplitWordsAndCompare
{
    public static int len(String text)
    {
        int count=0;
        while(true)
        {
            try
            {
                text.charAt(count);
                count++;
            }
            catch(RuntimeException  e)
            {
                break;
            }
        }
        return count;
    }
    public static int word(String text)
    {
        int l = len(text);
        text=text+" ";
        int count=0;
       for(int i = 0; i < l; i++)
        {
            char ch = text.charAt(i);

            if(ch != ' ' && (i == 0 || text.charAt(i - 1) == ' '))
            {
                count++;
            }
        }
        return count;
    }
    public static String[] words(String text)
    {
        text=text.trim();
        int l=len(text)+1;
        int lw=word(text);

        text= text+" ";
        String str="";
        int p =0;
        String[] strp=new String[lw];
        for(int i =0; i <l;i++)
        {
            char ch = text.charAt(i);
            if(ch!=' ')
            {
                str=str+ch;
            }
            else
            {
                while (i + 1 < l && text.charAt(i + 1) == ' ') {
                    i++;
                }
                strp[p]=str;
                p++;
                str="";
            }
        }
        return strp;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a text");
        String text=sc.nextLine();
        text=text.trim();
        String[] wordsinbuild = text.split(" ");
        String[] wordsinuser = words(text);
        for(int i =0 ; i<wordsinuser.length;i++)
        {
            if(!wordsinuser[i].equals(wordsinbuild[i]))
            {
                System.out.println("The words are not same");
                return;
            }
        }
        System.out.println("The words are same");
        return;
    }
}