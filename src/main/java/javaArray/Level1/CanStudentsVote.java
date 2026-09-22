import java.util.*;
public class CanStudentsVote
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ar= new ArrayList<>();
        System.out.println("Please Enter the 10 values");
        for(int i =0; i <10;i++)
        {
            int a =sc.nextInt();
            ar.add(a);
        }
        for(int i =0; i <10;i++)
        {
            if(ar.get(i)<0)
            {
                System.out.println(ar.get(i)+ " Age is Invalid for ");
            }
            else if(ar.get(i)<18)
            {
                System.out.println(ar.get(i)+" Is a Invalid age for voting");
            }
            else {
                System.out.println(ar.get(i)+" Is a valid age for voting");
            }
        }
    }
}
