import java.util.*;
public class Diaplay_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i=0; i<n; i++) {
             arr[i] = sc.nextInt();
        }

        ReverseArray(arr,0);
        sc.close();
        
    }

    public static void ReverseArray(int[] arr, int idx){
        if(idx==arr.length){return;}
        int a=arr[idx];
        ReverseArray(arr,idx+1);
        
        System.out.println(a);
    }
  } 

