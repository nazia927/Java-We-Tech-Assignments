public class Q4A2
{
    public static void main(String[] args){
        int i=1;
        int sum = 1;
        while(i<Integer.MAX_VALUE){
            if(sum==i*i){
                System.out.println("Answer: "+i);
            }
            i+=1;
            sum+=i;
        }
        System.out.println("Final loop, sum: "+sum+ " i: "+i);
    }
}