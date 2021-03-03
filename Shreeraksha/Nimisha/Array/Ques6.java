import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
for(int i = 1; i <=t ; i++){
            int temp = arr[arr.length-1];
            for(int j = arr.length-1; j > 0 ; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
