import java.util.Scanner;

public class Q4{
    public static void main(String args[])
    {
        Scanner Obj=new Scanner(System.in);
        System.out.println("String 1 :  ");
        String s1=Obj.nextLine();

        System.out.println("String 2 :  ");
        String s2=Obj.nextLine();

        int arr[]=new int[257];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<s1.length();i++)
        {
            int x=s1.charAt(i);
            arr[x]++;
        }
        for(int i=0;i<s2.length();i++)
        {
            int x=s2.charAt(i);
            if(arr[x]>0)
            {
                arr[x]--;
            }
        }
        int m=0;
        for(int i=0;i<257;i++)
        {
            if(arr[i]>0)
            {
                m=1;
            }
        }
        if(m==1)
        {
            System.out.println("Not anagrams");
        }
        else
        {
            System.out.println("Anagrams!");
        }
    }
}
