import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }

        shiftIntegers(arr, n);
        printArray(arr, n);

 }
 
        public static void shiftIntegers(int arr[], int n)
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] < 0)
            {
                if (i != j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    public static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}
