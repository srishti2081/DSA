import java.util.*;
public class Min_and_Maxofarray {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[]= new int[n];

    int max=arr[0],min=arr[0];
    for(int i=0; i<arr.length; i++){
    arr[i]=sc.nextInt();
    if(arr[i]>max){
       max=arr[i];
    }
    if(arr[i]<min){
        min=arr[i];
    }
    System.out.println(arr[i]);
    }
    
    System.out.println("max is-" +max);
    System.out.println("min is-" +min);
    
    
    sc.close();
} 
}