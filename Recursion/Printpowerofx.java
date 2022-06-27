//here stack height is n

import java.util.*;

public class Printpowerofx {

    public static int printpow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
    
        int xpownm1 = printpow(x,n-1);
        int k= x* xpownm1;
        return k;
    }
    public static void main(String[] args) {
        int x=2,n=3;
        int ans = printpow(x,n);
        System.out.println(ans);
    }
    
}