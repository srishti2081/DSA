import java.util.*;
class Solution {
     
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int  nums[] =new int[n];
    
    
     for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
    }
    int target=sc.nextInt();
    
    for(int i=0;i<nums.length;i++){

        for(int j=i+1;j<nums.length;j++){

        if(nums[i]+nums[j]==target){
            System.out.print(i+" ");
            System.out.print(j);
          // System.out.println(nums[i],nums[j]);
        }
            
        }
    }
    
}
}

