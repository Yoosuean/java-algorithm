import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Collections;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m=N/2;
         
        ArrayList<Integer> arr = new ArrayList();
         
        for (int i=N; N>0; N--) {
            int num = sc.nextInt();
            arr.add(num);
        }
            Collections.sort(arr);
            System.out.println(arr.get(m));
    }
}