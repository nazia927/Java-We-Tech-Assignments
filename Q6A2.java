import java.util.Scanner;
public class Q6A2
{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = obj.nextInt();

        System.out.println("Hailstone sequence: " + x);
        int m = 0;
        while(x!=1 && m<Integer.MAX_VALUE && x<Integer.MAX_VALUE && x>0){
            if(x%2!=0){
                x*=3;
                x++;
            }
            else{
                x/=2;
            }
            System.out.println(x);
            m++;
        }
        if(x==1){
            System.out.println("Steps: "+m);
        }
        else if(x==Integer.MAX_VALUE || x<0){
            System.out.println("Integer overflow ");
        }
        else{
            System.out.println("Steps maxed out.");
        }
    }
}