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

    int min = arr[0];
    int max = arr[0];

    for(int i = 1; i < arr.length; i++){
       if(arr[i] < min){
          min = arr[i];
       }

       if(arr[i] > max){
          max = arr[i];
       }
    }
    
    System.out.println("Maximum number in array is " + max);
    System.out.println("Minimum number in array is " + min);

 }

}
