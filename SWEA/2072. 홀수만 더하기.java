import java.util.*;

class Solution
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for (int i=0; i<T; i++)
        {
            int sum=0;
            for(int j=0; j<10; j++)
            {
                int num=sc.nextInt();
                if(num%2!=0)
                {
                    sum+=num;
                } 
            }
            System.out.printf("#%d %d%n",i+1,sum);
        }
        sc.close();
    }
}
