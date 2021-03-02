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

        int newLength = removeDuplicates(arr);

    System.out.println("Length of array after removing duplicates = " + newLength);

    System.out.print("Array = ");
    for (int i = 0; i < newLength; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

 }
 
 static int removeDuplicates(int[] arr) {
    int n = arr.length;

    int j = 0;

    for (int i = 0; i < n; i++) {

      if (i < n - 1 && arr[i] == arr[i + 1]) {
        continue;
      }

      arr[j++] = arr[i];
    }

    return j;
  }
}
