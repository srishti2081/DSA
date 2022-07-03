import java.util.*;
public class Allindices_ofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[]= new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int AI= Allindices_ofarray(arr,0,m,0);
        System.out.println(AI);
        
        
        sc.close();
        
        
    }
    public static int Allindices_ofarray(int []arr,int idx, int num ,int x) {
        if(idx== arr.length){
            return new int [x];
        }

        if(arr[idx]==num){
            Allindices_ofarray(arr,idx+1,num, x+1);
           // return idx;
        }else{
            int a=Allindices_ofarray(arr,idx+1,num,0);
            //return a;
        }
    }
    
}
