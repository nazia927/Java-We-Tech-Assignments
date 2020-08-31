import java.util.Scanner;
public class Q2A2
{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int x = obj.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter elemnts in the array: ");
        int[] freq = new int[21];
        for(int i=0;i<x;i++){
            arr[i] = obj.nextInt();
            if(arr[i]<0 || arr[i]>20){
                freq[0]++;
            }
            else{
                freq[arr[i]]++;
            }
        }
        int j=0;
        for(int i=0;i<21;i++){
            for(int k=0;k<freq[i];k++){
                arr[j] = i;
                j++;
            }
        }
        System.out.print("Sorted array: ");
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
    }
}