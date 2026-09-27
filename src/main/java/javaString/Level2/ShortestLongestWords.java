/*
Question:
4. Write a program to split the text into words and find the shortest and longest strings in a given text.

Hints:
1. Take user input using Scanner nextLine.
2. Create a method to split the text into words using charAt without using split.
3. Create a method to find and return a string's length without using length.
4. Create a method to return a 2D String array containing each word and its length.
5. Create a method that takes the 2D array and returns the shortest and longest string positions in a 1D int array.
6. The main function calls the methods and displays the result.

Author: Asher Mustafa
Date: 25 - 09 - 2026
*/
import java.util.Scanner;
public class ShortestLongestWords
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
        int maxi=-1;
        int mini=-1;
        int maxl=Integer.MIN_VALUE;
        int minl=Integer.MAX_VALUE;
        int len=0;
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
                len++;
            }
            else
            {
                while (i + 1 < l && text.charAt(i + 1) == ' ') {
                    i++;
                }
                strp[p]=str;
                if(len>maxl)
                {
                    maxl=len;
                    maxi=p;
                }
                if(len<minl)
                {
                    minl=len;
                    mini=p;
                }
                p++;
                str="";
                len=0;
            }
        }
        System.out.println("The longest word is {"+strp[maxi] +"} and its length is "+maxl);
        System.out.println("The shortest word is {"+strp[mini] +"} and its length is "+minl);

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